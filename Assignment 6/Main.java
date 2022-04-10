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
        Numbers list = new Numbers();
        list.list();
        System.out.println("Unsorted List of Numbers");
        list.print();
        list.mergeSort();
        System.out.println("\nSorted List of Numbers");
        list.print();
        
    }
    
}
