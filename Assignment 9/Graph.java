/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import java.io.*;

/**
 *
 * @author Ditzy
 */
public class Graph {
    private List<Node> nodes;
    private int visitedCount;

    Random random = new Random();

    public List<List<Integer>> adjacentNodes;

    public Graph() {
        this.nodes = new ArrayList<Node>();
        int count = 10;

        adjacentNodes = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            nodes.add(new Node(random.nextInt(100000)));
            adjacentNodes.add(new ArrayList<>());
        }

        for (int i = 0; i < nodes.size(); i++) {
            List<Integer> adjacent = adjacentNodes.get(i);

            if (adjacent.size() == 0) {
                int newConnections = random.nextInt(3) + 1;
                while (newConnections -- > 0) {
                    int newConnection = random.nextInt(nodes.size());
                    while (newConnection == i || adjacent.contains(newConnection) || adjacentNodes.get(newConnection).size() > 4 ) {
                        newConnection = random.nextInt(nodes.size());

                    }
                    
                    addPath(i, newConnection);
                }

            }

        }
    }
    
    public void addPath(int a, int b) {
        adjacentNodes.get(a).add(b);

        if (a != b) {
            adjacentNodes.get(b).add(a);
        }

    }
    
    public void printGraph() {
        System.out.println("The generated random Graph:");
        for (int i = 0; i < this.adjacentNodes.size(); i++) {
            System.out.print("Node " + i + " : " + this.nodes.get(i).value + " Adjacent Nodes: { ");
            
            List<Integer> list = this.adjacentNodes.get(i);
            
            if (list.isEmpty()) {
                System.out.print(" No adjacent Nodes ");
                
            }
            else {
                int size = list.size();
                for (int j = 0; j < size; j++) {
                    System.out.print(list.get(j));
                    if (j < size - 1){
                        System.out.print(" , ");
                    }
                }
            }
            
            System.out.println("}");
        }
        
    }
    
    public void BreadthSearch(int target) {
        int[] distance = new int[nodes.size()];
        Arrays.fill(distance, Integer.MAX_VALUE);
        int[] parent = new int[nodes.size()];
        Arrays.fill(parent, 0);
        boolean found = false;
        visitedCount = 0;
        Queue<Integer> pending = new LinkedList<Integer>();
        pending.add(0);
        int index = -1;
        int currentDistance = 0;
        distance[0] = 0;
        
        while (pending.size() > 0) {
            index = pending.remove();
            currentDistance = distance[index];
            visitedCount++;
            
            
            if (nodes.get(index).value == target) {
                found = true;
                break;
                
            }
            else {
                List<Integer> adjacent = adjacentNodes.get(index);
                for (int j = 0; j < adjacent.size(); j++) {
                    int possible = adjacent.get(j);
                    if (distance[possible] == Integer.MAX_VALUE) {
                        pending.add(possible);
                    }
                    if (currentDistance + 1 < distance[possible]) {
                        distance[possible] = currentDistance + 1;
                        parent[possible] = index;
                    }
                    
                }
            }
            
            
            
        }
        if (found) {
            System.out.println("Found Node using Breadth Search");
            int current = index;
            ArrayList<Integer> path = new ArrayList<Integer>();
            path.add(current);
            while (parent[current] != current) {
                current = parent[current];
                path.add(current);
            }
            Collections.reverse(path);
            System.out.println("Shortest Path Length using Breadth Search:" + path.size());
            
        }
        else {
            System.out.println("Node not found using Breadth Search.");
        }

        System.out.println("Nodes Visited during Breadth Search:" + visitedCount);

    }

    public void DepthSearch(int target) {
        int[] distance = new int[nodes.size()];
        Arrays.fill(distance, Integer.MAX_VALUE);
        int[] parent = new int[nodes.size()];
        Arrays.fill(parent, 0);
        visitedCount = 0;
        int currentDistance = 0;
        distance[0] = 0;
        
        if (!doDepthFirst(0, 0, target, distance, parent)) {
            System.out.println("Node not found using Depth Search.");
        }
        
        System.out.println("Nodes Visited during Depth Search:" + visitedCount);
        
                

    }

    private boolean doDepthFirst(int current, int currentDistance, int target, int[] distance, int[] parent) {
        visitedCount++;
        if (nodes.get(current).value == target) {
            System.out.println("Found Node using Depth Search");
            ArrayList<Integer> path = new ArrayList<Integer>();
            path.add(current);
            while (parent[current] != current) {
                current = parent[current];
                path.add(current);
            }
            Collections.reverse(path);
           
            System.out.println("Shortest Path Length using Depth Search:" + path.size());
            return true;
        }
        boolean found = false;
        List<Integer> adjacent = adjacentNodes.get(current);

        for (int i = 0; i < adjacent.size() && !found; i++) {
            int possible = adjacent.get(i);
            if (distance[possible] == Integer.MAX_VALUE) {
                distance[possible] = currentDistance + 1;
                parent[possible] = current;
                found = doDepthFirst(possible, currentDistance + 1, target, distance, parent); 
            }
            else if (currentDistance + 1 < distance[possible]) {
                distance[possible] = currentDistance + 1;
                parent[possible] = current;
                
            }
        }
        
        return found;
        
        
        
    }


    

    
}
