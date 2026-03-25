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
            for (int i = 0; i < contents.size(); i++) {
            System.out.println((i + 1) + ". " + contents.get(i));
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
                    System.out.print("Select a library [type 0 to go back]: ");
                    int choice = myScanner.nextInt();
                    
                    if (choice == 0) {
                        break;
                    }
                    else if (choice >= 1 && choice <= libraries.size()) {
                        Library selectedLibrary = libraries.get(choice - 1);
                        System.out.println("Selected: " + selectedLibrary.name);

                        while (true) {
                            selectedLibrary.displayContents();
                            System.out.println("********************************************"); 
                            System.out.println("[1] - Add new content\n[2] - Modify a existing content\n[3] - Delete a existing content\n[4] - Rename the selected library\n[5] - Delete the selected library\n[6] - Back");
                            System.out.println("********************************************");
                            System.out.print("What would you like to do in the selected library?: ");
                            int choice2 = myScanner.nextInt();
                            myScanner.nextLine();
                            

                            if (choice2 == 1) {
                                while (true) { 
                                    System.out.print("Enter the contents of your library: (Type 1 to finish adding your contents): ");
                                    String contents = myScanner.nextLine();
                                    
                                    if (contents.equalsIgnoreCase("1")) {
                                        break;
                                    }

                                    selectedLibrary.addContent(contents);    
                                }
                            } else if (choice2 == 2) {
                                if (selectedLibrary.contents.size() == 0) {
                                    System.out.println("This library is empty. Add a content on it first!");
                                } else {
                                    selectedLibrary.displayContents();

                                    System.out.print("Enter the number of the content you want to modify: ");
                                    int modifyNum = myScanner.nextInt();
                                    myScanner.nextLine();

                                    if (modifyNum >= 1 && modifyNum <= selectedLibrary.contents.size()) {
                                        System.out.print("Enter the new name for the modified content: ");
                                        String newName = myScanner.nextLine();

                                        selectedLibrary.contents.set(modifyNum - 1, newName);

                                        System.out.println("Content Succesfully Modified!");
                                    } else {
                                        System.out.println("Invalid Input. Please Try Again...");
                                    }
                                }
                            } else if (choice2 == 3) {
                                if (selectedLibrary.contents.size() == 0) {
                                    System.out.println("This library is empty. Add a content on it first!");
                                } else {
                                    selectedLibrary.displayContents();

                                    System.out.print("Enter the number of the content you want to modify: ");
                                    int modifyNum = myScanner.nextInt();
                                    myScanner.nextLine();

                                    selectedLibrary.contents.remove(modifyNum - 1);

                                    System.out.println("Content Succesfully Removed!");
                                }
                            } else if (choice2 == 4) {
                                System.out.print("Enter new name for the library: ");
                                String newName = myScanner.nextLine();

                                selectedLibrary.name = newName;

                                System.out.println("Library renamed successfully!");
                                
                            } else if (choice2 == 5) {
                                System.out.print("Are you sure you want to delete this library? (yes/no): ");
                                String confirm = myScanner.nextLine();

                                if (confirm.equalsIgnoreCase("yes")) {
                                libraries.remove(selectedLibrary);
                                System.out.println("Library deleted successfully!");
                                break; 
                                } else {
                                    System.out.println("Deletion cancelled.");
                                }
                                
                            } else if (choice2 == 6) {
                                break;  
                            } else {
                                System.out.println("Invalid Input. Please try again.");
                            }
                        }

                        
                    }
                    else {
                        System.out.println("Invalid Input. Please Try Again...");
                    }

                }
            }
            
            // main exit
            else if (options == 3){
                System.exit(0);
            } else {
                System.out.println("Invalid option.");
            }



        }
        

        
    }
    
}
