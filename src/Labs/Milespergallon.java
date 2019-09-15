//imports the Java packages
import javax.swing.*;

public class Milespergallon extends JFrame{
   //creates the labels
   private JLabel lbl;
   private JLabel lbl2;
   private JLabel lbl3;
   //creates the panel
   private JPanel panel;
   //creates the textfields
   private JTextField  miles;
   private JTextField  gallons;
   private JTextField mpg;
   //creates the button
   private JButton calc;
   public Milespergallon(){
      //creates the panels
      panel =new JPanel();
      //sets the title of the frame
      setTitle("MPG Calculator");
      //sets the frame size
      setSize(500,500);
      //stops the frame from being resized
      setResizable(false);
      //closes the frame when closed
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
      //creates the labels
      lbl = new JLabel("Miles: ");
      lbl2 = new JLabel("Gallons: ");
      lbl3 = new JLabel("MPG: ");
      
      //creates the miles, gallons, calc and mpg variables
      miles = new JTextField(10);
      gallons = new JTextField(10);
      calc = new JButton("Calculate");
      calc.addActionListener(e -> calcClick());
      mpg = new JTextField(10);
      
      //sets the finalamt from being editable
      mpg.setEditable(false);
      
      //adds the variables to the panel
      panel.add(lbl);
      panel.add(miles);
      panel.add(lbl2);
      panel.add(gallons);
      panel.add(calc);
      panel.add(lbl3);
      panel.add(mpg);
      //adds the panel to the frame
      add(panel);
      
      //sets the frame visible
      setVisible(true);
   }
   
   public void calcClick(){
      //get the text in the miles
      String s = miles.getText();
      //convert it to a number
      double milesamt = Double.parseDouble(s);
      //get the text in the gallons
      String s2 = gallons.getText();
      //convert it to a number
      double gallonsamt = Double.parseDouble(s2);
         
      //calculate the mpg
      double finalamt =
         milesamt / gallonsamt;
      //grab the value of the finalamt
      String s3 = String.valueOf(finalamt);
      //set the string to mpg
      mpg.setText(s3); 

   }
   
   public static void main(String args[]){new Milespergallon();}
}