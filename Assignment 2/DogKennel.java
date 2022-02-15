/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ditzy
 */
public class DogKennel {
    
    private Dog[] kennel;
    
    public DogKennel (Dog firstDog) {
        this.kennel = new Dog[1];
        this.kennel[0] = firstDog;
        
    }
    
    public void print() {
        for (Dog dog: this.kennel) {
            System.out.println(dog.getName() + "\n" + dog.getBreed() + "\n" + dog.getAge());
            
            
        }
    }
    
    public void insertAtIndex (Dog dog, int position) {
        if (this.kennel.length == 0 && position == 0) {
            this.kennel = new Dog [1];
            this.kennel[0] = dog;
            return;
            
        }
        
        if (position < 0 || position > this.kennel.length) {
            return;
        }
        
        Dog[] newDogKennel = new Dog [this.kennel.length + 1];
        
        for (int i=0; i<this.kennel.length+1; i++) {
            if (i < position) {
                newDogKennel[i] = this.kennel[i];
            }
            
            else if (i>position) {
                newDogKennel[i] = this.kennel[i-1];
            }
            
            else {
                newDogKennel[i] = dog;
            }
            
        }
        
        this.kennel = newDogKennel;
    }
    
    public void insertAtEnd (Dog dog) {
        Dog[] newDogKennel = new Dog [this.kennel.length+1];
        
        for (int i = 0;i < this.kennel.length; i++) {
            newDogKennel[i] = this.kennel[i];
        }
        
        this.kennel = newDogKennel;
        this.kennel[this.kennel.length - 1] = dog;
               
    }
    
    
    public void removeAtIndex (int position) {
        //Cannot remove a book from empty shelf or from an invalid array position
        if (this.kennel.length == 0 && position == 0 || position < 0 || position > this.kennel.length) {
            return;

        }
        Dog[] newDogKennel = new Dog [this.kennel.length - 1];
        for (int i = 0, k = 0; i < this.kennel.length; i++) {
            if (i != position) {
                newDogKennel[k++] = this.kennel[i];
            }
            
            
            
        }
        
        this.kennel = newDogKennel;

        
        
        
    }
    
    public void removeFromEnd () {
        Dog[] newDogKennel = new Dog [this.kennel.length-1];
        for (int i = 0; i < this.kennel.length-1; i++) {
            newDogKennel[i] = this.kennel[i];
        }
        
        this.kennel = newDogKennel;
 
    }
    
    public void fetch (String targetName) {
        for (int i = 0; i < this.kennel.length; i++) {
            if (this.kennel[i].getName() == targetName) {
               System.out.println(this.kennel[i].getName() + "\n" + this.kennel[i].getBreed() + "\n" + this.kennel[i].getAge());
               return;
            }
            
        } 
        System.out.println("The dog " + targetName + " is not in the system.");
        
        
    }
    
    public void updateName (String oldName, String newName) {
        for (int i = 0; i < this.kennel.length; i++) {
            if (this.kennel[i].getName() == oldName) {
                this.kennel[i].setName(newName);
                
            }
            
        }
        System.out.println("The dog " + oldName + " is not in the system.");
        
        
    }
    
    public void updateAge (String name, int newAge) {
        for (int i = 0; i < this.kennel.length; i++) {
            if (this.kennel[i].getName() == name) {
                this.kennel[i].setAge(newAge);
                break;
            }

        }
        System.out.println("The dog " + name + " is not in the system.");
        
        
    }
        
    public void updateBreed (String name, String newBreed) {
        for (int i = 0; i < this.kennel.length; i++) {
            if (this.kennel[i].getName() == name) {
                this.kennel[i].setBreed(newBreed);
                break;
            }

        }
        System.out.println("The dog " + name + " is not in the system.");
        
        
    }
    
    
}
