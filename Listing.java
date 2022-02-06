import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Listing {
    private String name;
    private int age;
        
    public Listing() {
        this.name = " ";
        this.age = 0;
    }
    public Listing(String name, int age) {
        this.name = name;
        this.age = age;
        
    }
    public String toString() {
       return "name: " + this.getName() + " age: " + String.valueOf(this.getAge());
        
    }
    public void input() {
        BufferedReader charles = new BufferedReader (
            new InputStreamReader(System.in));
        try {
        System.out.println("Input Name: ");
        String name = charles.readLine();
        System.out.println("Input Age: ");
        String age = charles.readLine();
        
        this.setName(name);
        this.setAge(age);
        } catch(IOException Derp){}
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String age) {
        this.age = Integer.parseInt(age);
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public static void main(String args[]) {
        Listing George = new Listing();
        System.out.println(George.toString());
 
        Listing Abbey = new Listing("Abbey", 17);
        System.out.println(Abbey.toString());
        
        Listing Amy = new Listing();
        Amy.input();
        System.out.println(Amy.toString());

    }
}
