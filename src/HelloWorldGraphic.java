
// Import statements

// Import java's swing GUI API
import javax.swing.*;
// Import Graphics class
import java.awt.*;

// All Java files are classes

public class HelloWorldGraphic {

    // Main function declaration, looks a lot like C++
    public static void main(String[] args) {

        // Create a new window frame
        JFrame frame = new JFrame("Hello World!");
        // Create a new label for the window
        JLabel label = new JLabel("Hello World!", JLabel.CENTER);
        frame.add(new HelloComponent());

        // Set the size of the window frame
        frame.setSize(300, 300);
        // Make the frame visible on screen
        frame.setVisible(true);
    }
}

class HelloComponent extends JComponent {

    public void paintComponent(Graphics g) {
        g.drawString("Hello Java", 125, 95);
    }
}