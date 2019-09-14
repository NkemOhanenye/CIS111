package Labs.Lab7;

import java.util.Scanner;

public class PayRollTest {

    /**
     * creates a static int that can be used anywhere in the file
     */
    private static final int size = 7;

    public static void main(String[] args) {
        /**
         * he variables to be used in the file
         */
        Scanner input = new Scanner(System.in);
        double pay;
        int hr;
        /**
         * makes the PayRoll class a variable to use the getters and
         * setters
         */
        PayRoll test = new PayRoll();
        /**
         * takes the index of the and uses it to set the Hr and use
         * it later in the file
         */
        for (int index = 0; index < size; index++ ) {
            System.out.println("Enter the hours employee "
                    + (index + 1) + " has worked");
            hr = input.nextInt();
            test.setHr(index, hr);
            /**
             * makes only positive numbers able to be used
             */
            while (hr < 0) {
                System.out.println("Please give a number >=0");
                hr = input.nextInt();
            }
        }
        /**
         * takes the index of the and uses it to set the Pay and use
         * it latter in the file
         */
        for (int index = 0; index < size; index++){
            System.out.println("Enter the pay rate for employee "
                    + (index + 1));
            pay = input.nextDouble();
            test.setPay(index, pay);
            /**
             * makes only positive numbers able to be used
             */
            while (pay < 0) {
                System.out.println("Please give a number >= 0");
                pay = input.nextDouble();

            }
        }
        /**
         * prints the title of the file being created
         */
        System.out.println("Employee ID" + "\t " + "  Hours "
                + "\t" + "Pay Rate " + "\t" + "Gross Pay");
        System.out.println
                ("--------------------------------------------------");

        /**
         * takes the class variable and uses the method for the getters
         */
        test.GrossPay();

        /**
         * prints all the indexes and uses the grosspay to get the getter 
         * of the wage, making it the grosspay
         */
        for (int index = 0; index < size ; index++ )
        {
            System.out.println(test.getID(index) + "\t\t   "
                    + test.getHr(index) + "\t\t"
                    + test.getPay(index) + "\t\t"
                    + test.getWage(index));
        }

    }
}
