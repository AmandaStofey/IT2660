/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ditzy
 */
public class Dog {
    private String name;
    private String breed;
    private int age;
    
    
    public String getName() {
        return this.name;
    }
  
    public String getBreed() {
        return this.breed;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setAge (int newAge) {
        this.age = newAge;
    }
    
    public void setBreed (String newBreed) {
        this.breed = newBreed;
    }
    
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    
}