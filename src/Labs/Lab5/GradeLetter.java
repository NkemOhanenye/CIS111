package Labs.Lab5; /**
 * Author: Nkem Ohanenye
 * Date: 3/9/17
 * Purpose: take the user
 * inputted test scores and
 * give them a grade using
 * methods.
 */
import java.util.Scanner;
//imports the Scanner package
public class GradeLetter {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        //creates the scanner
        System.out.println("Please enter a test score.");
        //asks the user for input
        double testScore1 = input.nextDouble();
        //waits for the user to input
        System.out.println("Please enter another test score.");
        double testScore2 = input.nextDouble();

        System.out.println("Please enter another test score.");
        double testScore3 = input.nextDouble();

        System.out.println("Please enter another test score.");
        double testScore4 = input.nextDouble();

        System.out.println("Please enter another test score.");
        double testScore5 = input.nextDouble();

        calcAverage(testScore1, testScore2, testScore3, testScore4, testScore5);
        //creates a new method and passes the arguments to the method
        determineGrade(testScore1, testScore2, testScore3, testScore4, testScore5);
    }

    public static void calcAverage(double testScore1, double testScore2, double testScore3,
                                   double testScore4, double testScore5){
        //includes the arguments as a double for the method
        System.out.println("The test Scores you entered are: " + testScore1 +
                " " + testScore2 + " " + testScore3 + " " + testScore4 + " " + testScore5);
        //prints the entered scores
        System.out.println("The average of the given scores is: " + (testScore1 +
                testScore2 + testScore3 + testScore4 + testScore5)/5);
        //prints the average of the scores
    }

    public static void determineGrade(double testScore1, double testScore2, double testScore3,
                                      double testScore4, double testScore5){

        double A = 90, B = 80, C = 70, D = 60;
        //creates the score arguments
        if(testScore1 >= A){

            System.out.println("Test score 1 " + testScore1 + " :A");
            //prints the test score
        }else if(testScore1 >= B && testScore1 < A){
            //only if it is above B but bellow A will you get a B
            System.out.println("Test score 1 " + testScore1 + " :B");

        }else if(testScore1 >= C && testScore1 < B){
            //only if it is above C but bellow B will you get a C
            System.out.println("Test score 1 " + testScore1 + " :C");

        }else if(testScore1 >= D && testScore1 < C){
            //only if it is above D but bellow C will you get a D
            System.out.println("Test score 1 " + testScore1 + " :D");

        }else {
            //if all the other arguments failed
            System.out.println("Test score 1 " + testScore1 + " :F");

        }

        if(testScore2 >= A){

            System.out.println("Test score 2 " + testScore2 + " :A");

        }else if(testScore2 >= B && testScore2 < A){

            System.out.println("Test score 2 " + testScore2 + " :B");

        }else if(testScore2 >= C && testScore2 < B){

            System.out.println("Test score 2 " + testScore2 + " :C");

        }else if(testScore2 >= D && testScore2 < C){

            System.out.println("Test score 2 " + testScore2 + " :D");

        }else{

            System.out.println("Test score 2 " + testScore2 + " :F");

        }

        if(testScore3 >= A){

            System.out.println("Test score 3 " + testScore3 + " :A");

        }else if(testScore3 >= B && testScore3 < A){

            System.out.println("Test score 3 " + testScore3 + " :B");

        }else if(testScore3 >= C && testScore3 < B){

            System.out.println("Test score 3 " + testScore3 + " :C");

        }else if(testScore3 >= D && testScore3 < C){

            System.out.println("Test score 3 " + testScore3 + " :D");

        }else{

            System.out.println("Test score 3 " + testScore3 + " :F");

        }

        if(testScore4 >= A){

            System.out.println("Test score 4 " + testScore4 + " :A");

        }else if(testScore4 >= B && testScore4 < A){

            System.out.println("Test score 4 " + testScore4 + " :B");

        }else if(testScore4 >= C && testScore4 < B){

            System.out.println("Test score 4 " + testScore4 + " :C");

        }else if(testScore4 >= D && testScore4 < C){

            System.out.println("Test score 4 " + testScore4 + " :D");

        }else{

            System.out.println("Test score 4 " + testScore4 + " :F");

        }

        if(testScore5 >= A){

            System.out.println("Test score 5 " + testScore5 + " :A");

        }else if(testScore5 >= B && testScore5 < A){

            System.out.println("Test score 5 " + testScore5 + " :B");

        }else if(testScore5 >= C && testScore5 < B){

            System.out.println("Test score 5 " + testScore5 + " :C");

        }else if(testScore5 >= D && testScore5 < C){

            System.out.println("Test score 5 " + testScore5 + " :D");

        }else{

            System.out.println("Test score 5 " + testScore5 + " :F");

        }
        //the arguments for the test needed to pass for the prints
    }
}
