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
        System.out.println("List of Animals");
        Stack Zoo = new Stack(3);
        
        System.out.println("Printing and Testing and Empty Stack");
        Zoo.showAll();
        Zoo.emptyOrFull();
        
        System.out.println("Adding Animals to the Stack without Filling it");
        Zoo.push(new ZooAnimal("Tiger", 2, "Ziggy"));
        Zoo.push(new ZooAnimal("Bear", 4, "Koda"));
        Zoo.showAll();
        Zoo.emptyOrFull();
        
        System.out.println("Filling the stack's initial size");
        Zoo.push(new ZooAnimal("Wolf", 2, "Zephyr"));
        Zoo.showAll();
        Zoo.emptyOrFull();
        
        System.out.println("Resizing the Stack to hold 4 Animals");
        Zoo.push(new ZooAnimal("Elephant", 10, "Marembe"));
        Zoo.showAll();
        Zoo.emptyOrFull();
        
        System.out.println("Peeking at the top Member");
        System.out.println(Zoo.peek());
        System.out.println("");
        
        System.out.println("Popping Marembe off the Stack");
        Zoo.pop();
        System.out.println("Current Stack Members:");
        Zoo.showAll();
        Zoo.emptyOrFull();
        
        System.out.println("Emptying the Stack");
        Zoo.emptyStack();
        Zoo.showAll();
        Zoo.emptyOrFull();
        
        System.out.println("Adding an animal to the newly Emptied Stack");
        Zoo.push(new ZooAnimal("Monkey", 3, "Cookie"));
        Zoo.showAll();
        Zoo.emptyOrFull();
        
    }
}
