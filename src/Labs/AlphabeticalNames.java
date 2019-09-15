/**
 * Name: Nkem Ohanenye
 * Date: 2/21/17
 * Purpose: to have the program
 * take user inputted names and
 * print the random order in
 * alphabetical order.
 */
import java.util.Scanner;
public class AlphabeticalNames{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //creates the scanner
        System.out.println("Print the name of a student.");
        String Student1 = input.nextLine();
        System.out.println("Print the name of another student.");
        String Student2 = input.nextLine();
        System.out.println("Print the name of another student.");
        String Student3 = input.nextLine();
        System.out.println("Print the name of another student.");
        String Student4 = input.nextLine();
        //creates the variables
        System.out.println("The name of the students you" +
                " typed are: " + Student1 + ", " + Student2 + ", "
                + Student3 + " and " + Student4 + ".");
        //displays the typed names
        String First = " ";
        String Second = " ";
        String Third = " ";
        String Fourth = " ";
        //creates strings First - Fourth
        if (Student1.compareToIgnoreCase(Student2) < 0 &&
                (Student1.compareToIgnoreCase(Student3) < 0) &&
                (Student1.compareToIgnoreCase(Student4) < 0)) {
            First = Student1;
        } else if (Student2.compareToIgnoreCase(Student3) < 0 &&
                Student2.compareToIgnoreCase(Student4) < 0) {
            First = Student2;
        } else if (Student3.compareToIgnoreCase(Student4) < 0) {
            First = Student3;
        } else {
            First = Student4;
        }
        //sets variables in order to have them all reach first
        //Finding Second
        //First is Student1
        if (First == Student1) {
            if (Student2.compareToIgnoreCase(Student3) < 0 &&
                    Student2.compareToIgnoreCase(Student4) < 0) {
                Second = Student2;
            } else if (Student3.compareToIgnoreCase(Student4) < 0) {
                Second = Student3;
            } else {
                Second = Student4;
            }
        }
        //First is Student2
        else if (First == Student2) {
            if (Student1.compareToIgnoreCase(Student3) < 0 &&
                    Student1.compareToIgnoreCase(Student4) < 0) {
                Second = Student1;
            } else if (Student3.compareToIgnoreCase(Student4) < 0) {
                Second = Student3;
            } else {
                Second = Student4;
            }
            //First is Student3
        } else if (First == Student3) {
            if (Student1.compareToIgnoreCase(Student2) < 0 &&
                    Student1.compareToIgnoreCase(Student4) < 0) {
                Second = Student1;
            } else if (Student2.compareToIgnoreCase(Student4) < 0) {
                Second = Student2;
            } else {
                Second = Student4;
            }
        }
        //First is Student4
        else if (First == Student4) {
            if (Student1.compareToIgnoreCase(Student2) < 0 &&
                    Student1.compareToIgnoreCase(Student3) < 0) {
                Second = Student1;
            } else if (Student2.compareToIgnoreCase(Student3) < 0) {
                Second = Student2;
            } else {
                Second = Student3;
            }
        }//end
        if (First == Student2 && Second == Student1 || Second == Student2 && First == Student1 ) {
            // gives order of bothe variables or the reverse of them
            if (Student3.compareToIgnoreCase(Student4) < 0) {
                Third = Student3;
                Fourth = Student4;
            } else {
                Third = Student4;
                Fourth = Student3;
            }
        }
        //First is Student2)
       else if (First == Student3 && Second == Student4 || First == Student4 && Second == Student3 ) {
            if (Student2.compareToIgnoreCase(Student1) < 0) {
                Third = Student2;
                Fourth = Student1;
            } else {
                Third = Student1;
                Fourth = Student2;
            }
            //First is Student3)
        } else if (First == Student1 && Second == Student3 || First == Student3 && Second == Student1) {
            if (Student2.compareToIgnoreCase(Student4) < 0) {
                Third = Student2;
                Fourth = Student4;
            } else {
                Third = Student4;
                Fourth = Student2;
            }
        }        //First is Student3)
        else if (First == Student2 && Second == Student4 || First == Student4 && Second == Student2) {
            if (Student3.compareToIgnoreCase(Student1) < 0) {
                Third = Student3;
                Fourth = Student1;
            } else {
                Third = Student1;
                Fourth = Student3;
            }
        } else if (First == Student1 && Second == Student4 || First == Student4 && Second == Student1) {
            if (Student2.compareToIgnoreCase(Student3) < 0) {
                Third = Student2;
                Fourth = Student3;
            } else {
                Third = Student3;
                Fourth = Student2;
            }
        } else if (First == Student2 && Second == Student3 || First == Student3 && Second == Student2) {
            if (Student4.compareToIgnoreCase(Student1) < 0) {
                Third = Student4;
                Fourth = Student1;
            } else {
                Third = Student1;
                Fourth = Student4;
            }
        }
        System.out.println("Names in Alphabetical Order");
        System.out.println("First " + First);
        System.out.println("Second " + Second);
        System.out.println("Third " + Third);
        System.out.println("Fourth " + Fourth);
        //prints the outcomes
    } //main
} //class