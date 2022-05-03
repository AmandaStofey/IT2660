
import java.util.List;
import java.io.*;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ditzy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph randomGraph = new Graph();
        randomGraph.printGraph();
        while (true) {
            System.out.println("Enter the node you wish to search for:");
            int target = sc.nextInt();
            randomGraph.BreadthSearch(target);
            randomGraph.DepthSearch(target);

        }

    }
}

