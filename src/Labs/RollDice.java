package Labs; /**
 * Author: Nkem Ohanenye
 * Date: 3/7/17
 * Purpose: display a dice
 * roll through 1 and 6
 * then ask the user if they want
 * to roll again
 */
import java.util.Scanner;
import java.util.Random;
//adds random package for random numbers
public class RollDice {

    public static void main(String args[]){
        String again = "y";
        //creates the string "y"
        int die1;
        int die2;
        //creates the ints die1 and die2
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        //creates the random variable

        int die1count = 0;
        int die2count = 0;
        int die3count = 0;
        //creates the counters for the wins

        while (again.equalsIgnoreCase("y")){
            System.out.println("First wins that add up to 10 wins");
            System.out.println("Rolling the dice ...");

            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            //rolls the die

            System.out.println(die1 + " " + die2);
            //prints the numbers

            if(die1 > die2) {
                die1count++;
                //counts the wins
                System.out.println("Die1: won " + die1count + " times");
                //prints the outcome

            }else if(die2 > die1) {
                die2count++;
                System.out.println("Die2: won " + die2count + " times");

            }else {
                die3count++;
                System.out.println("It's a tie! " + die3count);
            }

            if(die1count == 10 || die2count == 10 || die3count == 10){
                //if statement for the counts that reach 10
                return; //ends the program
            }

            System.out.print("Roll them again (y = yes)? ");
            again = input.nextLine();
            //implements pressing y to roll again
        }

        System.out.println("ERROR: That is not y..." +
                "Ending Program.");
    }
}
