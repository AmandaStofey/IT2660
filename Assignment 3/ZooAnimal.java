/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ditzy
 */
public class ZooAnimal {
    public String name;
    public int age;
    public String species;
    
    public ZooAnimal() {
        name = "";
        age = 0;
        species = "";
    }
    
    public ZooAnimal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
        
    }
    
    public String toString() {
        return ("Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Species: " + species);
    }
    
    public ZooAnimal deepCopy() {
        ZooAnimal clone = new ZooAnimal(name, age, species);
        return clone;
    }
    
}
