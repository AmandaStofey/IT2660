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
        Item root = new Item("Sword", 100, 5);
        root.setNextItem(new Item("Potion", 5, 100));
        root.getNextItem().setNextItem(new Item("Spear", 75, 10));
        root.print();
        
        root = root.insertItemAtPosition(new Item("Backpack", 10, 20), 0);
        root = root.insertItemAtPosition(new Item("Rations", 1, 200), 2);
        root = root.insertItemAtPosition(new Item("Plate Armor", 50, 6), 3);
        root = root.insertItemAtPosition(new Item("Leather Armor", 15, 8), 5);
        
        root.print();

    }

}
