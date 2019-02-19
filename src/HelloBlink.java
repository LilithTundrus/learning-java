
// Import statements
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloBlink {
    public static void main(String[] args) {
        // Create a new JFrame to add the custom JComponent
        JFrame frame = new JFrame("HelloJava2");
        // Add a new instance of the JComponent to the window fram with the given text
        frame.add(new HelloComponent4("AAAAAAA"));
        // Set a default operation when the close button on the window is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the view size of the window frame
        frame.setSize(300, 300);
        // Make sure the window actually shows up on screen
        frame.setVisible(true);
    }
}

// Here. implementing the Runnable interface means we intend to have a run() method for running a thread
class HelloComponent4 extends JComponent implements MouseMotionListener, ActionListener, Runnable {

    // String container to hold the string message
    String theMessage;

    // Message x/y coordinates
    int messageX = 125;
    int messageY = 95;

    JButton button;

    // Variable to hold the current color index for the class
    int colorIndex;

    // Array of colors to choose from for the button-based color change
    static Color[] colors = { Color.red, Color.green, Color.blue, Color.magenta };

    // State bool for whether or not the text is currently blinking
    boolean blinkState;

    // Class's constructor function
    public HelloComponent4(String message) {
        theMessage = message;
        button = new JButton("Change Color!");
        // Set the local message to that of the `theMessage` variable (this DOES NOT
        // have to be used in Java)
        this.theMessage = message;

        // Use the class variable button to create a new button
        button = new JButton("Change the color");

        // use the Jcomponent setLayout function (inherited from base class)
        setLayout(new FlowLayout());

        // Add the button to the window (inherited function)
        add(button);
        // Add an action listener to the button, passing this component
        button.addActionListener(this);

        // Add a mouse motion listener, passing this component
        addMouseMotionListener(this);

        // Create a new thread for this component (uses the method named run() in the class by default
        Thread t = new Thread(this);
        // Start the thread!
        t.start();
    }

    public void paintComponent(Graphics g) {
        // Ternary operater, if blinking get the background color, else call the current color method
        g.setColor(blinkState ? getBackground() : currentColor());
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
        // Empty, doesn't have to be handled for this example
    }

    public void actionPerformed(ActionEvent e) {
        // Was the button pressed?
        if (e.getSource() == button) {
            changeColor();
        }
    }

    synchronized private void changeColor() {
        // Awkwardly change the color to the next index
        if (++colorIndex == colors.length) {
            colorIndex = 0;
        }
        setForeground(currentColor());
        // Call a screen repaint on a separate thread
        repaint();
    }

    synchronized private Color currentColor() {
        // Return the current color at the current colorIndex variable
        return colors[colorIndex];
    }

    public void run() {
        try {
            while(true) {
                blinkState = !blinkState;
                repaint();
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {

        }
    }
}