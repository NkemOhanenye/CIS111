/**
   Author: Nkem Ohanenye
   Date: 3/7/17
   Purpose:This program
      will create a retail price
      calculator
**/
import java.util.Scanner;
//creates scanner
public class RetailPriceCalc{
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      //creates the Scanner input
      System.out.println("Please type in wholesale cost.");
      double wholesale = input.nextDouble();
      //creates the wholesale cost variable
      System.out.println("Please type in markup percentage.");
      double markupPct = input.nextDouble();
      //creates the markup percentage variable
      double itemCost = calculateRetail(wholesale, markupPct);
      //calculates the results of the inputs
      System.out.printf("item has wholesale cost = $%.sf \n", wholesale);
      System.out.printf("item has markup percent = %.2f %% \n", markupPct);
      System.out.printf("Final Cost = $%.2f \n", itemCost);
      //prints out the results
   }
/**
   calculateRetail
   @param wholesale amount seller bought it for
   @param markupPct percentage that seller marks it up
   @return finalCost final cost of product with markup
**/
   public static double calculateRetail(double wholesale, double markupPct){
      double finalCost = 0;
      double markupCost = (markupPct / 100) * wholesale;
      
      finalCost = wholesale + markupCost;
      return finalCost;
   }
}