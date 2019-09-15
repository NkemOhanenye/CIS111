import javax.swing.*;
import java.awt.event.*;

public class GUIPractice 
         extends JFrame implements ActionListener{
   private JButton God;
   private int clickCount = 0;
   public GUIPractice(){
      this.setSize(500, 500);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("Look GUI");
      God = new JButton("I am God!");
      God.addActionListener(this);
      JPanel panel = new JPanel();
      panel.add(God);
      this.add(panel);
      this.setVisible(true);
   }
   public static void main(String args[]){new GUIPractice();}
   
   public void actionPerformed(ActionEvent e){ //forgot down
      if(e.getSource()==God){
         clickCount++;
         if(clickCount==1)
            God.setText("Call me God!");
         else
            God.setText("You called me God "
                     + clickCount + " times!");//lower mine own input
         //if(clickCount==100)
            //God.setText("You are truly loyal");
         if(clickCount%100 == 0)
            God.setText("You are truly loyal");
         //if(clickCount==1000)
            //God.setText("ALL HAIL ME!");
         if(clickCount%1000 == 0)
            God.setText("ALL HAIL ME!");
      }
   }
}