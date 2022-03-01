/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ditzy
 */
public class Item {
    private String name;
    private int price;
    private int quantity;
    
    private Item next;
    
    public Item() {
        this.name = "";
        this.price = 0;
        this.quantity = 0;
        
    }
    
    public Item (String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        
    }
    
    public Item getNextItem() {
        return this.next;
    }
    
    public void setNextItem (Item item) {
        this.next = item;
    }
    
    public Item insertItemAtPosition (Item newItem, int position) {
        if (position == 0) {
            return newRoot(newItem);
        }
        if (position == getListSize()) {
            return append(newItem);
        }
        Item previousItem = getItemAtPosition(position-1);
        newItem.setNextItem(previousItem.getNextItem());
        previousItem.setNextItem(newItem);
        return this;
    }
    
    private Item getItemAtPosition (int position) {
        Item walker = this;
        for (int i=0; i < position; i++) {
            walker = walker.getNextItem();
        }
        return walker;
    }
    
    private Item append(Item item) {
        Item lastItem = getItemAtPosition(getListSize() - 1);
        lastItem.setNextItem(item);
        return this;
    }
    
    private Item newRoot (Item newRoot) {
        newRoot.setNextItem(this);
        return newRoot;
    }
    
    private int getListSize() {
        int listSize = 1;
        Item walker = this;
        while (walker.getNextItem() != null) {
            walker = walker.getNextItem();
            listSize++;
        }
        return listSize;
    }
    
    public String toString() {
        return ("\n" +
                "Name: " + name + "\n"
                + "Price: " + price + " gold" + "\n"
                + "Quantity: " + quantity + "\n");
    }
     public void print() {
         Item walker = this;
         System.out.print("\n" + "Item List:");
         System.out.print(this.toString());
         while (walker.getNextItem() != null) {
             walker = walker.getNextItem();
             System.out.print(walker.toString());
         }
     }
    
}
