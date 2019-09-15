/**
 * Created by Nkem Ohanenye on 2/20/17.
 */
import javax.swing.*;
import java.awt.event.*;


public class HelloWorld extends JFrame implements ActionListener{
    private JButton button1;
    public static void main(String args[]){new HelloWorld();}
    public HelloWorld() {
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("HelloButton");
        JPanel panel = new JPanel();
        button1 = new JButton("Click Me!");
        panel.add(button1); //adds the button to a panel
        this.add(panel);
        this.setVisible(true);
        button1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button1) {
            button1.setText("You clicked!");
        }
    }
}