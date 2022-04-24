/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ditzy
 */
public class Student {
    private String name;
    private int idNumber;
    private double gpa;
    
    public String getName() {
        return this.name;
    }
    
    public int getID() {
        return this.idNumber;
    }
    
    public double getGPA() {
        return this.gpa;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setID (int newID) {
        this.idNumber = newID;
    }
    
    public void setGPA (double newGPA) {
        this.gpa = newGPA;
    }
    
    public Student(String name, int idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }
}
