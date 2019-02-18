
// Import statements
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloButton {
    public static void main(String args[]) {
        // Create a new JFrame to add the custom JComponent
        JFrame frame = new JFrame("HelloJava2");
        // Add a new instance of the JComponent to the window fram with the given text
        frame.add(new HelloComponent3("AAAAAAA"));
        // Set a default operation when the close button on the window is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the view size of the window frame
        frame.setSize(300, 300);
        // Make sure the window actually shows up on screen
        frame.setVisible(true);
    }
}

class HelloComponent3 extends JComponent implements MouseMotionListener, ActionListener {

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

    // Constructor function (always names the same as the class)
    public HelloComponent3(String message) {
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
}