
// Import statements
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Declare the class as the same as the file name
public class HelloJava2 {

    // Main function
    public static void main(String[] args) {
        // Create a new JFrame to add the custom JComponent
        JFrame frame = new JFrame("HelloJava2");
        // Add a new instance of the JComponent to the window fram with the given text
        frame.add(new HelloComponent2("AAAAAAA"));
        // Set a default operation when the close button on the window is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the view size of the window frame
        frame.setSize(300, 300);
        // Make sure the window actually shows up on screen
        frame.setVisible(true);
    }
}

// The class is marked as implementing MouseMotionListener, meaning this class MUST
// have the required MouseMotionListener methods
// Interfaces are contracts between the developer and compiler where we agree to implement the methods required
class HelloComponent2 extends JComponent implements MouseMotionListener {

    // String container to hold the string message
    String theMessage;

    // Message x/y coordinates
    int messageX = 125;
    int messageY = 95;

    // Constructor function (always names the same as the class)
    public HelloComponent2(String message) {

        // The two variables below are called `instance` variables
        // Set the local message to that of the `theMessage` variable (this DOES NOT
        // have to be used in Java)
        this.theMessage = message;
        // Add a listener for mouse motion to this class
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e) {
        // Move the x of the message to the mouse's X
        messageX = e.getX();
        // Move the y of the message to the mouse's Y
        messageY = e.getY();
        // Call the UI repaint method to repaint the window (on its own thred)
        repaint();
    }

    public void mouseMoved(MouseEvent e) {

    }
}