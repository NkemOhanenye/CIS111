import java.util.Scanner;

public class PayRollTest {

    /**
     *
     */
    private static final int size = 7;

    public static void main(String[] args) {
        /**
         *
         */
        Scanner input = new Scanner(System.in);
        double pay;
        int hr;
        /**
         *
         */
        PayRoll test = new PayRoll();
        /**
         *
         */
        for (int index = 0; index < size; index++ ) {
            System.out.println("Enter the hours employee "
                    + (index + 1) + " has worked");
            hr = input.nextInt();
            test.setHr(index, hr);
            /**
             *
             */
            while (hr < 0) {
                System.out.println("Please give a number >=0");
                hr = input.nextInt();
            }
        }
        /**
         *
         */
        for (int index = 0; index < size; index++){
            System.out.println("Enter the pay rate for employee "
                    + (index + 1));
            pay = input.nextDouble();
            test.setPay(index, pay);
            /**
             *
             */
            while (pay < 0) {
                System.out.println("Please give a number >= 0");
                pay = input.nextDouble();

            }
        }
        /**
         *
         */
        System.out.println("Employee ID" + "\t " + "  Hours "
                + "\t" + "Pay Rate " + "\t" + "Gross Pay");
        System.out.println
                ("--------------------------------------------------");

        /**
         *
         */
        test.GrossPay();

        /**
         *
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