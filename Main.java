import java.util.*;

public class Main {

    static Scanner myScanner = new Scanner(System.in);
    static ArrayList<Library> libraries = new ArrayList<>();

    // PUBLIC CLASS FOR LIBRARY (ESSENENTIALLY FOR MAKING A NEW LIBRARY AND ASSIGNING A NAME FOR IT)
    static class Library{

        String name;
        ArrayList<String> contents;

        // For putting the name and contents of the library/array
        Library(String name){
            this.name = name;
            this.contents = new ArrayList<>();
        }

        // for returning the name after assigning it at a library/array
        public String getname(){
            return name;
        }

        // adding content inside the said library
        public void addContent(String item){
            contents.add(item);
        }

        // displaying the content (for later in option 2, sub option 1)
        public void displayContents() {
            System.out.println("Contents of " + name + ": ");
            for (String item : contents) {
                System.out.println("- " + item);
            }
        }
        
    }

    public static void Options1(){
        System.out.println("[1] - Create a new library\n[2] - View & Select a library\n[3] - Exit");
        System.out.print("Select an Option: ");
        }

    // main 
    public static void main(String[] args) {
        

        // create different array libraries, make a name for it with user input and put individual values on it
        while (true) {
            Options1();
            int options = myScanner.nextInt();
            myScanner.nextLine();

            

            if (options == 1) {
                System.out.print("Create a name for your library: ");
                String name = myScanner.nextLine();

                Library newLibrary = new Library(name);

                // Adding new library and contents inside        
                while (true){
                    System.out.print("Enter the contents of your library: (Type 1 to finish adding your contents): ");
                    String contents = myScanner.nextLine();

                    if (contents.equalsIgnoreCase("1")) {
                        break;
                    }

                    newLibrary.addContent(contents);

                }

                libraries.add(newLibrary);
                System.out.print("Library '" + name + "' created successfully!\n");
                
            } 
            else if (options == 2) {
                while(true) {
                    for (int i = 0; i < libraries.size(); i++) {
                        System.out.println((i + 1) + ". " + libraries.get(i).name);
                    }
                    System.out.println("Select a library [type / to go back]: ");
                    int choice = myScanner.nextInt();
                    
                    
                    if (choice == 1) {
                        System.out.print("Test");
                    }
                    
                }
            }
            
            
            
            //exit anytime
            else if (options == 3){
                System.exit(0);
            } else {
                System.out.println("Invalid option.");
            }



        }
        

        
    }
    
}
