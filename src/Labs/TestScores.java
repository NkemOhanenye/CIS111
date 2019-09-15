/**
*Author: Nkem Ohanenye
*Date: 3/9/17
*Purpose: Create a program
*using 2 methods that take
*test scores and print the 
*Letter Grade of each.
**/
import java.util.Scanner;
public class TestScores{

private Scanner input;
private double testScore1, testScore2, testScore3, testScore4, testScore5;

   public static void main(String args[]){new TestScores();}
   
   public TestScores(){
      input = new Scanner(System.in);
      System.out.println("Please enter a test score.");
      testScore1 = input.nextDouble();
      System.out.println("Please enter another test score.");
      testScore2 = input.nextDouble();
      System.out.println("Please enter another test score.");
      testScore3 = input.nextDouble();
      System.out.println("Please enter another test score.");
      testScore4 = input.nextDouble();
      System.out.println("Please enter another test score.");
      testScore5 = input.nextDouble();
      calcAverage();
      determineGrade();
   }
   
   public void calcAverage(){
      System.out.println("The test Scores you entered are: " + testScore1 + 
         " " + testScore2 + " " + testScore3 + " " + testScore4 + " " + testScore5);
      System.out.println("The average of the given scores is: " + (testScore1 + 
         testScore2 + testScore3 + testScore4 + testScore5)/5);

   }
   
   public void determineGrade(){
   
      double A = 90, B = 80, C = 70, D = 60;
      
      if(testScore1 >= A){
         System.out.println("Test score 1 " + testScore1 + " :A");
      }
      if(testScore2 >= A){
         System.out.println("Test score 2 " + testScore2 + " :A");
      }
      if(testScore3 >= A){
         System.out.println("Test score 3 " + testScore3 + " :A");
      }
      if(testScore4 >= A){
         System.out.println("Test score 4 " + testScore4 + " :A");
      }
      if(testScore5 >= A){
         System.out.println("Test score 5 " + testScore5 + " :A");
      }
      
      else if(testScore1 >= B || testScore1 < A){
         System.out.println("Test score 1 " + testScore1 + " :B");
      }
      else if(testScore2 >= B || testScore2 < A){
         System.out.println("Test score 2 " + testScore2 + " :B");
      }
      else if(testScore3 >= B || testScore3 < A){
         System.out.println("Test score 3 " + testScore3 + " :B");
      }
      else if(testScore4 >= B || testScore4 < A){
         System.out.println("Test score 4 " + testScore4 + " :B");
      }
      else if(testScore5 >= B || testScore5 < A){
         System.out.println("Test score 5 " + testScore5 + " :B");
      }
      
      else if(testScore1 >= C || testScore1 < B){
         System.out.println("Test score 1 " + testScore1 + " :C");
      }
      else if(testScore2 >= C || testScore2 < B){
         System.out.println("Test score 2 " + testScore2 + " :C");
      }
      else if(testScore3 >= C || testScore3 < B){
         System.out.println("Test score 3 " + testScore3 + " :C");
      }
      else if(testScore4 >= C || testScore4 < B){
         System.out.println("Test score 4 " + testScore4 + " :C");
      }
      else if(testScore5 >= C || testScore5 < B){
         System.out.println("Test score 5 " + testScore5 + " :C");
      }
      
      
      if(testScore1 >= D || testScore1 < C){
         System.out.println("Test score 1 " + testScore1 + " :D");
      }
      if(testScore2 >= D || testScore2 < C){
         System.out.println("Test score 2 " + testScore2 + " :D");
      }
      if(testScore3 >= D || testScore3 < C){
         System.out.println("Test score 3 " + testScore3 + " :D");
      }
      if(testScore4 >= D || testScore4 < C){
         System.out.println("Test score 4 " + testScore4 + " :D");
      }
      if(testScore5 >= D || testScore5 < C){
         System.out.println("Test score 5 " + testScore5 + " :D");
      }
      
      if(testScore1 <= D){
         System.out.println("Test score 1 " + testScore1 + " :F");
      }
      if(testScore2 <= D){
         System.out.println("Test score 2 " + testScore2 + " :F");
      }
      if(testScore3 <= D){
         System.out.println("Test score 3 " + testScore3 + " :F");
      }
      if(testScore4 <= D){
         System.out.println("Test score 4 " + testScore4 + " :F");
      }
      if(testScore5 <= D){
         System.out.println("Test score 5 " + testScore5 + " :F");
      }
   }
}