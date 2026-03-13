import java.util.ArrayList;
import java.util.Scanner;

public class New {


    // class for displaying the first three options
    public static void firstoptions(String[] args){
        System.out.println("*************************************************");
        System.out.println("Welcome to the Inventory Management Library!");
        System.out.println("[1] - Create a new Library/Inventory");
        System.out.println("[2] - Select/Modify a Library/Inventory");
        System.out.println("[3] - Exit the Program");
        System.out.println("*************************************************");
        System.out.println("Please Select an Option: ");
    }


    // creating the library and its contents
    static class Library{
        String name;                    // for naming the library
        ArrayList<String> contents;     // for putting contents on the library

    }

    // main class
    public static void main(String[] args) {
        // Scanner
        Scanner myScanner = new Scanner(System.in);

        // ArrayList for the library
        ArrayList<String> Library = new ArrayList<>();  // the libraries it self

        // variables
        int choice;
        

        // main category loop
        while(true) {
            firstoptions(args);             // displaying the mentioned before first options
            choice = myScanner.nextInt();   // Scanner, for putting in the choice (ps. pwede na siya isama sa firstoption class, but idk... you decide if you want to put this line on the class aswell :> )


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
