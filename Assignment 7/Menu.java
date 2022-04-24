import java.util.Scanner;

public class Menu {
    public void runMenu(StudentNode node) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which option you wish to use:");
        System.out.println("1: View Student Data");
        System.out.println("2: Update Student Data");
        System.out.println("3: Delete Student Data");
        System.out.println("4: Add new Student");
        System.out.println("5: View Student List");
        System.out.println("6: Exit");
        int i = sc.nextInt();
        
        if (i == 1) {
            System.out.println("Enter the name of the student you wish to view:");
            String target = sc.next();
            node.viewStudent(target);
            reRun(node);

        }
        else if(i == 2) {
            System.out.println("Enter the name of the student you wish to update:");
            String target = sc.next();
            System.out.println("Enter the updated ID of the student:");
            int newId = sc.nextInt();
            System.out.println("Enter the updated GPA of the student:");
            double newGPA = sc.nextDouble();
            node.Update(target, newId, newGPA);
            reRun(node);
        }
        else if(i == 3) {
            System.out.println("Enter the name of the student you wish to delete:");
            String target = sc.next();
            node.Delete(target);
            reRun(node);
        }
        else if (i == 4) {
            System.out.println("Enter the name of the new Student");
            String studentName = sc.next();
            System.out.println("Enter the ID number of the new Student:");
            int studentID = sc.nextInt();
            System.out.println("Enter the GPA of the new Student:");
            double studentGPA = sc.nextDouble();
            node.Insert(new Student(studentName, studentID, studentGPA));
            reRun(node);
            
        }
        else if (i==5) {
            node.Output();
            reRun(node);
        }
        
        else if (i==6) {
            System.exit(0);
            reRun(node);
        }
        
        else {
            System.out.println("That is not a valid input, please try again.");
            runMenu(node);
            
        }
    }
    public void reRun(StudentNode node) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to return to the Main Menu?");
        System.out.println("1: Return to Main Menu");
        System.out.println("2: Exit");
        int choice = sc.nextInt();
        if (choice == 1) {
            runMenu(node);
        
        }
        else if (choice == 2) {
            System.exit(0);
        }
        else {
            System.out.println("That is not a valid option, please try again.");
            reRun(node);
        }
    }

}
