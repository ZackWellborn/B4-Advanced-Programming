//Zachary Wellborn 9/16/24
//B4 Advanced Computer Programming at Skyline High School - Complex Apps 4 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
// import java.util.HashMap;
// import java.util.Map; (lmao)
import java.util.Scanner;

public class NoteTakingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          // I was gonna try hashmaps but nahhhh bro aint no way ;-;
          // Map<String, Scanner> scanners = new HashMap<>();
          
          //current directory stuff so that this program can run on any computer/in any folder (i think) cuz yk 
        File currentDirectory = new File( System. getProperty("user.dir"));

        System.out.println("Welcome to my note-taking application!");
        System.out.println("With this application, you can create .txt files to use for notes and edit/read them for future use :D");
        //loops so that this program is actually repeatable! to get out of this loop the user can
        //pick the (4th) quit option in the case switch statement which terminates the program (and closes scanner for safety)
        while (true) {
            // try/catch statement so that if the user inputs smth other than 1-4 the system tells them and loops back
            try {
        System.out.println("Would you like to \n 1) Make a new note file \n 2) Read an existing note file \n 3) Add to an existing note file or \n 4) quit");
        int choice = Integer.parseInt(scanner.nextLine());    
        switch(choice) {
            
            case 1: 
             // StringBuilder to store multiple lines of input
        StringBuilder userInput = new StringBuilder();
        System.out.println("Enter as many notes or lines of text as you want (type ':save' to save and exit):");

        // Keeps reading lines until the user types ":save"
        while (true) {
            String line = scanner.nextLine();
            // Checks if the user typed the save command
            if (line.equals(":save")) {
                break;
            }
            // (if the user hasn't typed ":save") append the line to the StringBuilder, including a line break
            userInput.append(line).append("\n");
        }
        System.out.println("Please enter a file name to save as");
        // prompt the user for a file name to save as, then stores this file within the directory for later use
        String filename = scanner.nextLine() + ".txt";
        // Use FileWriter to write the user input to the file ("true" means append mode instead of overriding)
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(userInput.toString());  // write all input at once and create the new file
            System.out.println("Your note has been saved to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        break;
        //case 2 is appending to a file (editing any line was too complicated sorry T-T)
            case 2: 
            System.out.println("Which note file would you like to add to?");

            //"currentDirectory" is used so that this program can actually function on any computer lmao
            File[] files =  currentDirectory.listFiles(); 
            System.out.println("Files are:"); 
  
            // Display the names of the files 
            for (int i = 0; i < files.length; i++) { 
                System.out.println(files[i].getName()); 
            } 

            //attempt to get a filename, then create a scanner based off of the file name from the 
            //If the user attempts to input a file name that doesnt exist then they are presented with an error message and the program loops back :p
            String currentFilename = scanner.nextLine();
            File fileObj = new File(currentFilename);
            System.out.println("This is the notes you have saved on this file right now.");
            try (Scanner currentScanner = new Scanner(fileObj)) {
            while (currentScanner.hasNextLine()) {
                String i = currentScanner.nextLine();
                System.out.println(i);
                }
            } catch(Exception e) {
                System.out.println("Please input the file name exactly as it appears, including the '.txt' extension.");
                break;
            }
            break;
            //if the user would like to edit the file
            case 3: 
            System.out.println("Pick which file you would like to edit:");
            File[] tfiles =  currentDirectory.listFiles(); 
            System.out.println("Files are:"); 
            StringBuilder tuserInput = new StringBuilder();

            // Display the names of the files 
            for (int i = 0; i < tfiles.length; i++) { 
                System.out.println(tfiles[i].getName()); 
            } 

            String tcurrentFilename = scanner.nextLine();
            File tfileObj = new File(tcurrentFilename);

            System.out.println("This is the note file that you have so far:");
            try (Scanner currentScanner = new Scanner(tfileObj)) {
                while (currentScanner.hasNextLine()) {
                    String i = currentScanner.nextLine();
                    System.out.println(i);
                    }
                } catch(Exception e) {
                    System.out.println("Please input the file name exactly as it appears, including the '.txt' extension.");
                }

            System.out.println("Write as many lines/notes as you wish to add to the note file, and type ':save' to save and finish.");
            
            while (true) {
                String line = scanner.nextLine();
    
                // Checks if the user typed the save command
                if (line.equals(":save")) {
                    break;
                }
    
                // (if the user hasn't typed ":save") append the line to the StringBuilder, including a line break
                tuserInput.append(line).append("\n");
            }
            // Use FileWriter to write the user input to the file ("true" means append mode instead of overriding)
            try (FileWriter writer = new FileWriter(tcurrentFilename, true)) {
                writer.write(tuserInput.toString());  // write all input at once and create the new file
                System.out.println("Your note has been saved to " + tcurrentFilename);
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
            break;
            case 4:
            //scanner closes when you exit cuz system security matters :D
            scanner.close();
            System.exit(0);
            break;
        }
    } catch(Exception e) {
        System.out.println("Please only type a number 1, 2, 3, or 4, thank you :D");
    }
    }
}
}

//brackets are not, unfortunately, supplied by Micah Tien 
