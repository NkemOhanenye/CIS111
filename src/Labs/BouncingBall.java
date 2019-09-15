/**
 * Name: Nkem Ohanenye
 * Date: 4/13/17
 * Purpose: create a bouncing ball
 * application, QuickCheck#23
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
   This application uses a Timer object to animate
   a bouncing ball.
*/
//TO CHANGE FROM APPLET TO APPLICATION
//Step 1: extend from JFrame instead of Applet
//Step 2: get rid of init() method and make it constructor method and set up frame
//Step 3: add a main() method so you can create the bouncing ball
public class BouncingBall extends JFrame
{
   private int x = 109;         // Ball's X coordinate
   private int WIDTH = 40;      // Ball's width
   private int HEIGHT = 40;     // Ball's height
   private final int TIME_DELAY = 300; // Time delay
   private final int MOVE = 20;       // Pixels to move ball
   private final int MINIMUM_Y = 50;  // Max height of ball
   private final int MAXIMUM_Y = 400; // Min height of ball
   private int y = 400;               // Ball's Y coordinate
   private boolean goingUp = true;    // Direction indicator
   private Timer timer;               // Timer object

               
   /**
      constructor method
   */

   public BouncingBall()
   {
      setTitle("Bouncing Ball App");
      setSize(500,500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      timer = new Timer(TIME_DELAY, new TimerListener());
      timer.start();
      
      setVisible(true);
   }
   
   /**
      paint method
      @param g The applet's Graphics object.
   */
      
   public void paint(Graphics g)
   {
      // Call the superclass paint method.
      //CLEARS OUT THE SCREEN SO I CAN DRAW
      super.paint(g);
      
      // Set the drawing color to red.
      g.setColor(Color.red);
      
      // Draw the ball.
      g.fillOval(x, y, WIDTH, HEIGHT);
      
      g.setColor(Color.GREEN);
      g.fillOval(x+50,y+50,WIDTH+10,HEIGHT+10);
   }

   /**
      Private inner class that handles the Timer object's
      action events.
   */
   
   private class TimerListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Update the ball's Y coordinate.
         if (goingUp)
         {
            if (y > MINIMUM_Y)
               y -= MOVE;
            else{
            //hits the top and then goes down
               goingUp = false;
               //WHEN HITS TOP OF WINDOW, MOVES OVER 20 PIXLES TO RIGHT
               x += 20;
            }
         }
         else
         {
            if (y < MAXIMUM_Y)
               y += MOVE;
            else
               goingUp = true;
         }
            
         // Force a call to the paint method.
         repaint();
      }
   }
   
   public static void main(String args[]){new BouncingBall();}
}