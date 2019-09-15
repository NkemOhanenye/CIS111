/**
 *Author: Nkem Ohanenye
 *Date: 03/28/17
 *Purpose a Rainfall class
 *that stores 12 months of
 *rainfall amounts in an array
 * methods to get total, average
 * most and least often.
 *Programming challenge #1 
 *(Chap 7, p.468)
 */
 import java.util.Scanner;
 public class Rainfall{
   //instance variables / data numbers
   double[] rainAmt; //each month's rain amount
   
   //constructor method
   public Rainfall(double[] amount){
      //create Array of doubles 
      rainAmt = new double[amount.length];
      
      //COPY 1 ARRAY TO ANOTHER
      for(int i = 0; i<amount.length; i++){
         rainAmt[i] = amount[i];
      }
   }
   //setter method 
   //use this to0 set an individual item in an array
   public void setAmount(int index, double amount){
      rainAmt[index] = amount;
   }
   //getter method
   public double getAmount(int index){
      return rainAmt[index];
   }
   //other methods 
   public double getTotal(){
      double total = 0;
      for(int i = 0; i<rainAmt.length; i++){
         total += rainAmt[i]; 
      }
      return total;
   }
   public double getAverage(){
      double average = 0;
      average = getTotal()/ rainAmt.length;
      return average;
   }
   public double mostRain(){
      double most = rainAmt[0];
      for(int i = 0; i<rainAmt.length; i++){
         if(rainAmt[i] > most)
            most = rainAmt[i];
      }
      return most;
   }
   public double leastRain(){
      double least = rainAmt[0];
      for(int i = 0; i < rainAmt.length; i++){
         if(rainAmt[i] < least)
            least = rainAmt[i];
      }
      return least;
   }
  //TEST the Rainfall class
 public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   
   double[] myArray = new double[12];
   //fill my array by asking user for numbers
   for (int i = 0; i<myArray.length; i++){
      //ask user for number
      System.out.println("Please type in rainfall for Month " + (i+1));
      myArray[i] = input.nextDouble();
      //INPUT VALIDATION...making sure it is a number >=0
      while(myArray[i] < 0){
         //ask again
         System.out.println("Please give me a number >= 0");
         myArray[i] = input.nextDouble();
      }
   }//end of for
   
   //create the rainfall object
   Rainfall phillyRainfall = new Rainfall(myArray);
   //test out rainfall methods
   System.out.println("Total is " + phillyRainfall.getTotal());
   System.out.println("Average is " + phillyRainfall.getAverage());
   System.out.println("Most is " + phillyRainfall.mostRain());
   System.out.println("Least is " + phillyRainfall.leastRain());
   
 }//end of main
 } 
 
