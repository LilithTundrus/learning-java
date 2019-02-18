
// Import statements
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava2 {

    // Main function
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloJava2");
        frame.add(new HelloComponent2("AAAAAAA"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

class HelloComponent2 extends JComponent implements MouseMotionListener {

    // String container to hold the string message
    String theMessage;

    // Message x/y coordinates
    int messageX = 125;
    int messageY = 95;

    public HelloComponent2(String message) {
        theMessage = message;
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e) {
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
        
    }
}