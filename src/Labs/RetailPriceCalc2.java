/**
 * Author: Nkem Ohanenye
 * Date: 4/6/17
 * Purpose: This GUI program
 * will be a retail price 
 * calculator.
 * Chap 12, Prog Challange #1 (p.845)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *MAKE YOURSELF A JFRAME, so you get all the JFrame's methods
 */
public class RetailPriceCalc2 extends JFrame{
   /**
    * instance variables
    */
   private JPanel pnlTop, pnlBottom;
   private JLabel lblWholesale, lblMarkup, lblRetail;
   private JTextField txtWholesale, txtMarkup, txtRetail;
   private JButton btnCalculate;
   
   public RetailPriceCalc2(int width, int height){
      /**
       * call JFrame method to set title
       */
      setTitle("Retail Price Calculator");
      setSize(width, height);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      createTopPanel();
      createBottomPanel();
      //add panels to frame
      setLayout(new BorderLayout());
      add(pnlTop, BorderLayout.CENTER);
      add(pnlBottom, BorderLayout.SOUTH);
      setVisible(true);
   }
   
   public void createTopPanel(){
      pnlTop = new JPanel();
      lblWholesale = new JLabel("Type in wholesale cost."); 
      lblMarkup = new JLabel("Type in markup percentage."); 
      lblRetail = new JLabel("Final RetailCost.");
      txtWholesale= new JTextField(10); 
      txtMarkup = new JTextField(10); 
      txtRetail = new JTextField(10);
      txtRetail.setEditable(false); //read only
      
      //USE THE FLOW LAYOUT BY DEFAULT
      //1st row
      pnlTop.add(lblWholesale);
      pnlTop.add(txtWholesale);
      //2nd row
      pnlTop.add(lblMarkup);
      pnlTop.add(txtMarkup);
      //3rd row
      pnlTop.add(lblRetail);
      pnlTop.add(txtRetail);
   }//end of createTopPanel
   
   public void createBottomPanel(){
      pnlBottom = new JPanel();
      btnCalculate = new JButton("Calculate");
      btnCalculate.setBackground(Color.yellow);
      btnCalculate.setForeground(Color.blue);
      //when click on Calculate, goes to CalcButtonListener
      btnCalculate.addActionListener(new CalcButtonListener());
      pnlBottom.setBackground(Color.red);
      pnlBottom.add(btnCalculate);
   }
   //INNER CLASS -- see a sample on p.839-840
   private class CalcButtonListener implements ActionListener{
      //REQUIRED METHOD
      public void actionPerformed(ActionEvent e){
         //do your studd on button click
         //read in wholesale cost 
         String s = txtWholesale.getText();
         //convert ut to a number
         double wholesaleCost = Double.parseDouble(s);
         //read in markup percent
         String s2 = txtMarkup.getText();
         //convert it to a number
         double markupPct = Double.parseDouble(s2);
         
         //calculate retail
         double finalCost =
               wholesaleCost + (wholesaleCost * (markupPct/100));
               
         //write out final retail cost 
         //convert the number to a string
         //String s3 = Double.toString(finalCost);
         String s3 = String.valueOf(finalCost);
         txtRetail.setText(s3); 
      }//end of actionPerformed method
   }//end of inner class
   
   
   //TEST METHOD
   public static void main(String args[]){
   //creating a JFrame that is a Retail Price Calculator
   new RetailPriceCalc2(300, 200);
   }
}