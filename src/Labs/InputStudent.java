/* 
   Name: Nkem Ohanenye
   Date: 2/7/17
   Purpose: Quickcheck #6
*/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class InputStudent{
   public static void main (String args[]){
      Scanner input = new Scanner (System.in);
      System.out.println("Please type in a student name");
      String student1 = input.nextLine();
      System.out.println("Please type in test score for " + student1);
      double student1TestScore1 = input.nextDouble();
      System.out.println("Student 1 = " + student1 +
                          " Test score 1 = " + student1TestScore1);
      String student2 =
         JOptionPane.showInputDialog("Please type in a student name ");
      String studentTest =
         JOptionPane.showInputDialog("Please type in a test score ");
      double student2TestScore1 = Double.parseDouble(studentTest);
      JOptionPane.showMessageDialog(null, "Student 1 = " +
         student2 + "\n Test score 1 = " + student2TestScore1);
   }
}