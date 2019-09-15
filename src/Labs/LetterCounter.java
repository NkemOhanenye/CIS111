/**
* Name: Nkem Ohanenye
* Date: 2/23/17
* Purpose File Letter Counter
*/
import java.util.Scanner;
import java.io.*;
public class LetterCounter{
   public static void main(String args[]) throws IOException{
      Scanner keyboard = new Scanner (System.in);
      //ask the user for a filename to read
      System.out.println("Type in a filename");
      String name = keyboard.nextLine();
      //open up file that they told us to
      File file = new File(name);
      if (!file.exists()){
         System.out.println("That file does not exist");
         System.exit(0);
      }
      System.out.println("Which character do you want me to count?");
      char ch = keyboard.nextLine().charAt(0);
      //set up file to Read input
      Scanner inputFile = new Scanner(file);
      //read 1 line at a time
      int count = 0; //running total of occurrnces of character 
      while (inputFile.hasNext()){ //check if there is a line
         String Line = inputFile.nextLine();
         //go through line 1 character at a time
         for (int i=0; i<Line.length(); i++){
            if (Line.charAt(i) == ch)
               count++;
         }
      }
      System.out.println("Character " + ch +
            " Appeared in file " + count +
            " times.");
            
      //make sure to close file
      inputFile.close();
   }
}