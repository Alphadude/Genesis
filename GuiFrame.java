
package genesis;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;


public class GuiFrame extends JFrame{
    
    public static void main(String []args){
        JFrame first= new JFrame("First Frame");
        first.setDefaultLookAndFeelDecorated(true);
        first.setSize(250, 250);
        first.setVisible(true);
        first.setLocation(100,80);
        first.setBackground(Color.yellow);
        first.show();
        
        JLabel greeting = new JLabel("Good day");
        first.add(greeting);
        greeting.setForeground(Color.red);
        greeting.setLocation(100, 50);
        greeting.setBounds(50, 100, 20, 50);
//        JButton button = new JButton("push me");
//        first.add(button);
    }
    
}
