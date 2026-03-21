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
        public void addContent(String content){
            contents.add(content);
        }

        public void addednewContent(String newContent) {
            System.out.print("\nName the new content to add: ");
                myScanner.nextLine();
                newContent = myScanner.nextLine();

                contents.add(newContent);
                System.out.print("\nContent added successfully! >V<\n");    
                
                for (int i = 0; i < contents.size(); i++) {
                    System.out.println((i + 1) + ". " + contents.get(i) + " >V<");
                }
        }

        // displaying the content (for later in option 2, sub option 1)
        public void displayContents() {
            System.out.println("\nContents of " + name + ": ");
            for (int i = 0; i < contents.size(); i++) {
                System.out.println((i + 1) + ". " + contents.get(i) + " >V<");
            }
        }

        public void renameContent() {
            System.out.print("\nEnter the number of the content you want to change: ");
            int oldContent = myScanner.nextInt();
            myScanner.nextLine();
            System.out.print("\nEnter the new name for the content: ");
            String newContentname = myScanner.nextLine();

            if (oldContent >=1 && oldContent <= contents.size()) {
                contents.set(oldContent - 1, newContentname);
                System.out.println("\nContent renamed successfully! >V< ");
            } else {
                System.out.println("\nContent not found. Please enter a valid number of the content.");
            }
        }

        public void deleteContent() {
            System.out.print("\nEnter the number of the content you want to delete: ");
            int deletecontent = myScanner.nextInt();
            myScanner.nextLine();
            if (deletecontent >=1 && deletecontent <= contents.size()) {
                contents.remove(deletecontent - 1);
                System.out.println("\nContent deleted successfully! >V<");
            } else {
                System.out.println("\nContent not found. Please enter a valid number of the content.");
            }
        }
        
    }

    public static void Options1(){
        System.out.println("\n[1] - Create a new library\n[2] - View & Select a library\n[3] - Exit");
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
                System.out.print("\nCreate a name for your library: ");
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

                    System.out.println("\nYour available libraries >V< : ");

                    for (int i = 0; i < libraries.size(); i++) {
                        System.out.println((i + 1) + ". " + libraries.get(i).name);
                    }

                    System.out.println("\n [A] - Back to Main Menu\n [B] - Select Library\n [C] - Rename Library\n [D] - Delete Library\n [E] - Exit");
                    System.out.print("Select an Option: ");
                    myScanner.nextLine();
                    String input = myScanner.nextLine();
                    

                    if (input.equals("A") || input.equals("a")) {
                            break;
                    } 
                    
                    else if (input.equals("B") || input.equals("b")) {
                        int optionLibrary = 0;
                        System.out.print("\nPlease select a library by its number: ");
                        int librarynumber = myScanner.nextInt();
                        myScanner.nextLine(); 

                            if (librarynumber >=1 && librarynumber <= libraries.size()) {
                                Library selectedLibrary = libraries.get(- 1 + librarynumber);
                                selectedLibrary.displayContents();

                                 while (true) {
                                    System.out.println("\n [5] - Add new content\n [6] - Rename content\n [7] - Delete content\n [8] - Back to Library Selection\n");        
                                
                                    System.out.print("\nWhat would you like to do with this library? Select an option:  ");
                                    optionLibrary = myScanner.nextInt();

                                        if (optionLibrary == 5) {
                                            selectedLibrary.addednewContent("");
                                            
                                        } 
                                        
                                        else if (optionLibrary == 6) {
                                            selectedLibrary.renameContent();
                                            selectedLibrary.displayContents();
                                            
                                        }
                                        
                                        else if (optionLibrary == 7) {
                                            selectedLibrary.deleteContent();
                                            selectedLibrary.displayContents();
                                            
                                        }

                                        else if (optionLibrary == 8) {
                                            break;
                                        }

                                        else {
                                             System.out.print("\nInvalid Library number. Please enter a valid one.");
                                             break;
                                        }
                                }
                            }
                    } 
                
                    
                else if (input.equals("C") || input.equals("c")) {
                    
                        System.out.print("\nPlease select a library to rename by its number: ");
                        int renamelibrary = myScanner.nextInt();
                        myScanner.nextLine();

                            if (renamelibrary >=1 && renamelibrary <= libraries.size()) {
                                System.out.print("\nEnter the new name for the library: ");
                                String newLibraryName = myScanner.nextLine();
                                libraries.set(renamelibrary - 1, new Library(newLibraryName));
                                System.out.println("\nLibrary renamed successfully! >V<");
                                for (int i = 0; i < libraries.size(); i++) {
                                    System.out.println((i + 1) + ". " + libraries.get(i).name);
                                }

                            } else {
                                System.out.print("\nInvalid Library number. Please enter a valid one.");
                            }
                    }

                    else if (input.equals("D") || input.equals("d")) {
                        System.out.print("\nPlease select a library to delete by its number: ");
                        int deletelibrary = myScanner.nextInt();
                        myScanner.nextLine();

                            if (deletelibrary >=1 && deletelibrary <= libraries.size()) {
                                libraries.remove(deletelibrary - 1);
                                System.out.println("\nLibrary deleted successfully! >V<");

                                System.out.println("\nUpdated Library List >V< : ");
                                for (int i = 0; i < libraries.size(); i++) {
                                    System.out.println((i + 1) + ". " + libraries.get(i).name);
                                }

                            } else {
                                System.out.print("\nInvalid Library number. Please enter a valid one.");
                            }
                    }

                    else if (input.equals("E") || input.equals("e")) {
                        System.exit(0);
                    } 
                    
                    else {
                        System.out.println("Invalid option. Please select A, B, C, D, or E.");
                    }
                
            } }
            //exit anytime
            else if (options == 3){
                System.exit(0);
            } else {
                System.out.println("Invalid option.");
            }

            // this is not finished yet, i think? pero meron nman nang version sayo kaya here.


        }
    
    }
}
