import javax.swing.*;
import java.awt.*;

public class SimpleGUI {
    public static void main(String[] args) {
    // Beginning phases
        // Creating the frame
        JFrame frame = new JFrame("Example GUI");

        // Setting the frame size
        frame.setSize(300, 200);

        // Setting the close operation - how / when to close
        // The frame will exit when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Panel and label operations
        // Creating a new panel
        JPanel panel = new JPanel();

        // Creating a label
        JLabel label = new JLabel("Example Label!");

        // Adding label to the panel
        panel.add(label);

    // Setting layout and visibility
        // Setting layout of frame - to incorporate the panel and label
        frame.setLayout(new CardLayout());

        // Adding panel to frame
        frame.getContentPane().add(panel);

        // Making the frame visible - displaying it
        frame.setVisible(true);
    }
}
