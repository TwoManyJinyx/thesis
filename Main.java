import java.util.*;

public class Main {

    static class Library{

        String name;
        ArrayList<String> contents;

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

        public void displayContents() {
            System.out.println("Contents of " + name + ": ");
            for (String item : contents) {
                System.out.println("- " + item);
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        ArrayList<Library> libraries = new ArrayList<>();

        // create different array libraries, make a name for it with user input and put individual values on it
        while (true) {
            System.out.println("Current selected library: " + "none");
            System.out.println("[1] - Create a new library\n[2] - View & Select a library\n[3] - Exit");
            System.out.print("Select an Option: ");
            int option = myScanner.nextInt();
            myScanner.nextLine();

            if (option == 1) {
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
            
            
            
            //exit anytime
            else if (option == 3){
                System.exit(0);
            } else {
                System.out.println("Invalid option.");
            }



        }
        

        
    }
    
}
