import java.util.Scanner;
import java.util.Random;
import java.io.Console;
import java.io.File;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
//import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.lang.ref.Cleaner;

class Main{

    public static void main(String args[]) throws IOException{
        try (Scanner k = new Scanner(System.in)) {
            String userInput = "";
            boolean command = true;
            String title="\nWebSending";
            String directory = "";
            String newFile = "C:" + File.separator + "myFile.txt";
            File myFile = new File(newFile);
            int cookieAmt = 0;
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/YYYY HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();
            Random rand = new Random(); 
    while(command == true){
        for(int score = 0; score < 1; score++){
            if(userInput.equals(score)){
                    //System.out.println("nil, please try again or type 'search' for a list of all commands.");
                }else{
             
    System.out.println(title + " : ");
    userInput = k.nextLine();
    }
if(userInput.equals("help")){
   System.out.println("Welcome to WebSending! you used command: help. to exit, type: quit. to search all commands, type: search.");
}
if(userInput.equals("search")){
   System.out.println("\nList of commands: \n__________________________" + "\nabout: Display information about WebSending." + "\ncd: Current Directory." + "\nhelp: if you get stuck, help is there." + "\nnewfile: create a new file in a specified directory." + "\nreadfile: Reads contents from a file." + "\ntitle: renames the session." + "\nquit: If you're done using WebSending, you may quit the program." + "\nversion: Check the current version of WebSending" + "\n__________________________");
}
if(userInput.equals("quit")){
   System.out.println("Exiting...");
   System.exit(0);
}
if(userInput.equals("cd")){
   System.out.println("File directory: ");
    directory = k.nextLine();
    title = directory;
}
if(userInput.equals("version")){
   System.out.println("Current version is 1.0.");
}
if(userInput.equals("about")){
   System.out.println("Creator: DHotspot" + "\nVersion: 1.0" + "\nCreation Date: 1/12/23");
}
if(userInput.equals("date")){
   System.out.println("The current date and time: " + dtf.format(now));
}
if(userInput.equals("givecookies")){
   System.out.println("How many cookies are you giving today? :");
   cookieAmt = k.nextInt();
   k.nextLine();
   System.out.println("Gave a random person " + cookieAmt + " cookies.");
}
if(userInput.equals("time")){
   System.out.println("The currenttime date and time: " + dtf.format(now));
}
if(userInput.equals("title")){
   System.out.println("Rename this page : ");
   title = k.nextLine();
}
if(userInput.equals("newfile")){
   System.out.println("File path: ");
   newFile = k.nextLine();
   try{
      myFile.createNewFile();
   }catch (Exception e){
      System.out.println("Could not create " + myFile.getPath());
   }
   System.out.println("Created " + myFile.getPath());
}
if(userInput.equals("clear")){
   for(int i=0; i < 10; i++){
   System.out.println("\f");
   }
            }

         }
      }

            }
         }
      }     