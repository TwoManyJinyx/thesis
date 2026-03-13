import java.util.ArrayList;
import java.util.Scanner;

public class New {

    public static void firstoptions(String[] args){
        System.out.println("*************************************************");
        System.out.println("Welcome to the Inventory Management Library!");
        System.out.println("[1] - Create a new Library/Inventory");
        System.out.println("[2] - Select/Modify a Library/Inventory");
        System.out.println("[3] - Exit the Program");
        System.out.println("*************************************************");
        System.out.println("Please Select an Option: ");
    }

    static class Library{
        String name;
        ArrayList<String> contents;

    }





    public static void main(String[] args) {
        // Scanner
        Scanner myScanner = new Scanner(System.in);

        // ArrayList for the library
        ArrayList<String> Library = new ArrayList<>();

        // variables
        int choice;
        

        // main category loop
        while(true) {
            firstoptions(args);
            choice = myScanner.nextInt();


            // choices
            // Create New Library
            if (choice == 1) {
                System.out.print("Name your new Library/Inventory [type nothing to cancel]: ");
                name = myScanner.nextLine();
                myScanner.nextLine();

                if (name == "") {
                    break;
                } else {
                    Library.add(new String[] name = {""});
                }


            } 
            
            // Select/Modify Library
            else if (choice == 2) {
                System.out.println("Option 1");
            } 
            
            // Exit Program
            else if (choice == 3) {
                System.exit(1);
            }
            
            // Invalid Input
            else {
                System.out.println("Option 1");
            }


        }
    }
    
}
