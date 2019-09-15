/*
Name: Nkem Ohanenye
Date: 2/16/17
Purpose: Input a number between 
1 and 10 and print  out the 
Roman Numeral eqivalent 
QuickCheck9
*/
import java.util.Scanner; //imports the scanner
public class ConverttoRoman{
   public static void main(String args[]){
      Scanner input = new Scanner (System.in); //creates the scanner
      System.out.println("Please type in a number from 1-10");
      //gives the user directions
      int num = input.nextInt(); //initiates the variable and scanner
      String romanNum = ""; //creates string name
      switch(num){ //validates use of Int Scanner num
         case 1: //creates the roman numerals
            romanNum = "I";
            break;
         case 2:
            romanNum = "II";
            break;
         case 3:
            romanNum = "III";
            break;
         case 4:
            romanNum = "IV";
            break;
         case 5:
            romanNum = "V";
            break;
         case 6:
            romanNum = "VI";
            break;
         case 7:
            romanNum = "VII";
            break;
         case 8:
            romanNum = "VIII";
            break;
         case 9:
            romanNum = "IX";
            break;
         case 10:
            romanNum = "X";
            break;
         default:
            romanNum = "ERROR";
            //gives error if incorrect number is given
      }
      if (romanNum.equals("ERROR")) 
         System.out.println("ERROR: Number " + num +
                        " is NOT between 1 and 10");
         //if Error will not print roman numeral
      else
         System.out.println("Number = " + num +
                        "\nRomanNumber = " + romanNum);
         //prints the roman numeral
   }
}