/*
 Name: Nkem Ohanenye
 Date: 2/14/17
 Purpose: to write a program to
 display the grades of students.
 */
import java.util.Scanner;
public class Lab2 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in); //creating the main scanner
        System.out.println("Give me the name of three students.");
        String Student1 = input.nextLine(); //creates the name of the students
        String Student2 = input.nextLine();
        String Student3 = input.nextLine();
        System.out.println("Please type the scores for: " + Student1 +" "+ Student2 + " and " + Student3);
        //prints the name of the students
        double Student1TS1 = input.nextDouble(); //uses doubles to produce the numbers for the tests
        double Student2TS1 = input.nextDouble();
        double Student3TS1 = input.nextDouble();
        System.out.println("The scores for the three students are: " + Student1TS1 +" "+ Student2TS1 + " and " + Student3TS1);
        //prints the tests
        System.out.println("Now give me a second set of test scores for the three students");
        double Student1TS2 = input.nextDouble(); //uses doubles for the second tests
        double Student2TS2 = input.nextDouble();
        double Student3TS2 = input.nextDouble();
        System.out.println("The scores for the three students are: " + Student1TS2 +" "+ Student2TS2 + " and " + Student3TS2);
        //prints the second tests
        System.out.println("The average test score for " + Student1 + " is: " + ((Student1TS1+Student1TS2)/2));
        System.out.println("The average test score for " + Student2 + " is: " + ((Student2TS2+Student2TS2)/2));
        System.out.println("The average test score for " + Student3 + " is: " + ((Student3TS1+Student3TS2)/2));
        //prints the averages of the tests for each student
        System.out.println("The class average is: " + (((Student1TS1+Student1TS2)/2) + ((Student2TS2+Student2TS2)/2) + ((Student3TS1+Student3TS2)/2))/3);
        //prints the class average
    }
}
