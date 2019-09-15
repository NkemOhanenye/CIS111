/**
 * Name: Nkem Ohanenye
 * Date: 4/18/17
 * Purpose: create eyes that
 * watch the mouse.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WatchMe extends JFrame {
   private int pupilx = 200;
   private int pupily = 200;
   private int eyex = 200;
   private int eyey = 200;
   private int HEIGHT = 30;
   private int WIDTH = 30;
   public WatchMe(){
      //sets the title of the frame
      setTitle("WatchMe!");
      //sets the size of the frame
      setSize(500,500);
      //closes the Jframe when the window is closed
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //adds MouseMotionListener to the JFrame
      addMouseMotionListener(new MotionListener());
      //sets the Frame visible to the user
      setVisible(true);
   }
   public void paint(Graphics g){
      // Call the superclass paint method.
      //CLEARS OUT THE SCREEN SO I CAN DRAW
      super.paint(g);
      
      //Creates the white background of the eye
      g.setColor(Color.white);
      //fills the Oval
      g.fillOval(eyex-15, eyey-20, WIDTH+30, HEIGHT+40);
      
      //creates the black border around the eye
      g.setColor(Color.black);
      //draws the border
      g.drawOval(eyex-15, eyey-20, WIDTH+30, HEIGHT+40);
      
      // Set the drawing color to black.
      g.setColor(Color.black);//left
      // Draw the pupil.
      g.fillOval(pupilx, pupily, WIDTH, HEIGHT);
      //set color of line
      g.setColor(Color.black);
      //makes line of glasses
      g.drawLine(eyex+45, eyey+20, WIDTH+250, HEIGHT+190);

      //Creates the white background of the eye
      g.setColor(Color.white);
      //fills the Oval
      g.fillOval(eyex+65, eyey-20, WIDTH+30, HEIGHT+40);
      
      //creates the black border around the eye
      g.setColor(Color.black);
      //draws the border
      g.drawOval(eyex+65, eyey-20, WIDTH+30, HEIGHT+40);
      
      g.setColor(Color.black);
      //sets the oval 80 pixels away from the other pixel
      g.fillOval(pupilx+80,pupily,WIDTH,HEIGHT);
      
   }
   private class MotionListener implements ActionListener, MouseMotionListener{
      @Override
      public void actionPerformed(ActionEvent arg0) {
         // TODO Auto-generated method stub

      }
      
      @Override
      public void mouseDragged(MouseEvent arg0) {
         // TODO Auto-generated method stub

      }
      @Override
      public void mouseMoved(MouseEvent arg0) {
        // TODO Auto-generated method stub
        //sets the pupils to move up and down 
        if(arg0.getY() > 182 && arg0.getY() < 218)
                pupily = arg0.getY();
        //repaints the eyes to move
        repaint();
        //sets the pupils to move left and right
        if(arg0.getX() > 190 && arg0.getX() < 210)
                pupilx = arg0.getX();
        repaint();        
      }
      
   }
   public static void main(String args[]){new WatchMe();}
}
