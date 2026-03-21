import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class New {

    // public variables
    static Scanner myScanner = new Scanner(System.in);
    static int choice;
    static ArrayList<String> libraries = new ArrayList<>();  // the libraries it self
    public static void main(String[] args) {
        // Scanner
        

        // ArrayList for the library
        

        
        
        

        // main category loop
        while(true) {
            firstoptions();             // displaying the mentioned before first options
                                            


            // choices
            // Create New Library
            if (choice == 1) {
                System.out.print("Name your new Library/Inventory [type nothing to cancel]: ");
                String name = myScanner.nextLine();
                myScanner.nextLine();

                Library newLibrary = new Library(name);


                System.out.print("New Library Created!");
                System.out.print("Type in the contents of the library [type 1 if you are done]: ");
                while(true) {
                    String contents = myScanner.nextLine();
                    if (contents.equalsIgnoreCase("1")) {
                        break;
                    }
                    newLibrary.addContent(contents);
                }
                libraries.add(newLibrary);
                


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
                System.out.println("Invalid Input. Please try again");
            }


        }
    }

    

    // class for displaying the first three options
    public static void firstoptions(){
        System.out.println("*************************************************");
        System.out.println("Welcome to the Inventory Management Library!");
        System.out.println("[1] - Create a new Library/Inventory");
        System.out.println("[2] - Select/Modify a Library/Inventory");
        System.out.println("[3] - Exit the Program");
        System.out.println("*************************************************");
        System.out.print("Please Select an Option: ");
        choice = myScanner.nextInt();                                               // Scanner, for putting in the choice (ps. pwede na siya isama sa firstoption class, but idk... you decide if you want to put this line on the class aswell :> )
        System.out.println("*************************************************");
    }


    // creating the library and its contents, also for handling the name
    static class Library{
        String name;                    // for naming the library
        ArrayList<String> contents;     // for putting contents on the library

        Library(String name){
            this.name = name;
            this.contents = new ArrayList<>();
        }

        public String getname(){
            return name;
        }

        public void addContent(String item){
            contents.add(item);
        }

        public void viewlibrary(){
            System.out.println("Contents of " + name + ": ");
            for (String item : contents) {
                System.out.println("- " + item);
            }
        }

    // main class
    
    
    }
}