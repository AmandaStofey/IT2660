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
        StudentNode rootOdd = StudentNode.fromArray(new Student[] { new Student ("Zach", 3, 3.7), new Student("Amy", 1, 2.5), new Student("Sarah", 2, 3.0)});
        Menu menu = new Menu();
        menu.runMenu(rootOdd);



    }
    
}
