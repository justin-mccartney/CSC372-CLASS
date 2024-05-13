import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MenuInterface extends Component {
    private JFrame frame;
    private JTextArea textArea;

    public MenuInterface() {
        frame = new JFrame("Example Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Creating the menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem item1 = new JMenuItem("Print date and time");
        JMenuItem item2 = new JMenuItem("Write to file");
        JMenuItem item3 = new JMenuItem("Change background color");
        JMenuItem item4 = new JMenuItem("Exit");

        // Action listeners for menu
        item1.addActionListener(new ActionListener() {
            @Override
            // This section is allowing for the first menu item to display the date and time upon
            // the users click
            public void actionPerformed(ActionEvent e) {
                printDateAndTime();
            }
        });
        item2.addActionListener(new ActionListener() {
            @Override
            // This section is allowing for the second menu item to write the current text area information
            // upon the users click
            public void actionPerformed(ActionEvent e) {
                writeToLogFile();
            }
        });
        item3.addActionListener(new ActionListener() {
            @Override
            // This section is allowing for the third menu item to change the background color upon
            // the users click
            public void actionPerformed(ActionEvent e) {
                changeBackgroundColor();
            }
        });
        item4.addActionListener(new ActionListener() {
            @Override
            // This section is allowing for the fourth menu item to quit the program upon
            // the users click
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Adding items to menu
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        menuBar.add(menu);

        // Adding menu bar to frame
        frame.setJMenuBar(menuBar);

        // Creating text area for output display
        textArea = new JTextArea();
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Setting sizes and visibility
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    private void printDateAndTime() {
        // This section is implemented in order to set the date and time formatting for the user
        // ... allowing for a better understanding of how the date is formatter for the user
        // ... gathering the current date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        // This is setting the date and time to current - preparing for output to the user
        String dateTime = dateFormat.format(new Date());
        // This area is used to display the date and time to the user
        textArea.append(dateTime + "\n");
    }

    private void writeToLogFile() {
        try {
            // This first line is creating a writer - which is able to write to external files
            FileWriter writer = new FileWriter("log.txt", true);
            // This second line is preparing for current text area to be writted to an external file
            writer.write(textArea.getText());
            // Closing the writer
            writer.close();
            // Telling the user that the information in the text area had been written to the external file
            textArea.append("Contents written to log.txt\n");
        } catch(IOException e) {
            // Providing the user with a more conscise message which displays what the error was during writing
            JOptionPane.showMessageDialog(this, "An error occured while writing to the log file: "
            + e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void changeBackgroundColor() {
        // This first line is creating a new random number generator, so to speak
        Random random = new Random();
        // This second line is generating a random number between 65 and 165, setting it to the green
        // category in the color pallet which will provide different shades or orange
        int greens = random.nextInt(101) + 65;
        // Setting the color - which will in turn be a random shade of oragne due to the modular green caregory
        Color color = new Color(255, greens, 0);
        // Setting the background color to the random shade of orange
        textArea.setBackground(color);
        // Repainting the background, updates instantly
        textArea.repaint();
        // Displaying the color to the user, letting them know that the change was complete
        textArea.append("Background set to: " + color + "\n");
    }

    public static void main(String[] args) {
        new MenuInterface();
    }
}