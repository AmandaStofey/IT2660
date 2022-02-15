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
        System.out.println();
        System.out.println("Dog List:");
        DogKennel kennel1 = new DogKennel(new Dog("Lassie","Shetland Sheepdog", 8));
        kennel1.insertAtIndex(new Dog("Sammie", "German Shepherd", 3), 1);
        kennel1.insertAtIndex(new Dog("Sora", "Retriever Mix", 1), 2);
        kennel1.insertAtIndex(new Dog("Rusty", "Golden Retriever", 5), 3);
        kennel1.insertAtIndex(new Dog("Noelle", "Poodle", 7), 4);
        kennel1.print();
        System.out.println("");
        System.out.println("Removal of Sammie:");
        kennel1.removeAtIndex(1);
        kennel1.print();
        System.out.println("");
        System.out.println("Removal of Last Dog:");
        kennel1.removeFromEnd();
        kennel1.print();
        System.out.println("");
        System.out.println("Adding a dog at the end:");
        kennel1.insertAtEnd(new Dog("Fido", "Beagle", 2));
        kennel1.print();
        System.out.println("");
        System.out.println("get Lassie's info:");
        kennel1.fetch("Lassie");
        System.out.println("");
        System.out.println("Update Lassie to Max");
        kennel1.updateName("Lassie","Max");
        kennel1.updateBreed("Max", "Chow");
        kennel1.updateAge("Max", 3);
        kennel1.fetch("Max");
        System.out.println("");
        System.out.println("Fetching a dog name Pepper that is not in the system");
        kennel1.fetch("Pepper");
        
        
        

        
    }
    
}
