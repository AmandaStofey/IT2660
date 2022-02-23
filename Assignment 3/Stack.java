/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ditzy
 */
public class Stack {
    private ZooAnimal[] Zoo;
    private int top;
    private int size;
    
    public Stack() {
        top = -1;
        size = 3;
        Zoo= new ZooAnimal[3];
    }
    
    public Stack(int n) {
        top = -1;
        size = n;
        Zoo = new ZooAnimal[n];
    }
    
    public boolean push (ZooAnimal newAnimal) {
        if(top == size - 1) {
            ZooAnimal[] newZoo = new ZooAnimal[size + 1];
            for (int i = 0;i < size; i++) {
            newZoo[i] = this.Zoo[i];
            }
        
        this.Zoo = newZoo;
        top = top + 1;
        size = this.Zoo.length;
        Zoo[top] = newAnimal.deepCopy();
        return true;
            
        }
        else {
            top = top + 1;
            Zoo[top] = newAnimal.deepCopy();
            return true;
        }
    }
    
    public ZooAnimal pop() {
        ZooAnimal targetPop = new ZooAnimal();
        if (top == -1) {
            return null;
        }
        else {
            targetPop = Zoo[top].deepCopy();
            ZooAnimal[] newZoo = new ZooAnimal[size - 1];
            for (int i = 0;i < size - 1; i++) {
                newZoo[i] = this.Zoo[i];
            }
            this.Zoo = newZoo;
            size = this.Zoo.length;
            top = top - 1;
            
            System.out.println("Returned: ");
            System.out.println(targetPop.toString());
            System.out.println("");
                    
            return targetPop;
        }
    }
    
    public ZooAnimal peek() {
        return Zoo[top];
        
    }
    
    public void emptyStack() {
        top = -1;
        size = 1;
        this.Zoo= new ZooAnimal[1];
        
    }
    
    public void showAll() {
        for(int i = top; i >= 0; i--) {
            
            System.out.println(Zoo[i].toString());
            System.out.println("");
        }
    }
    
    public boolean emptyOrFull () {
        if (top == -1) {
            System.out.println("This Stack is Empty");
            System.out.println("");
            return false;
        }
        else if (top == size - 1) {
            System.out.println("This Stack is Full");
            System.out.println("");
            return false;
        }
        else {
            System.out.println("This Stack has room");
            System.out.println("");
            return true;
        }
    }
            
    
}
