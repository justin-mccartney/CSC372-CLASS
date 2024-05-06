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

public class MenuInterface {
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
            public void actionPerformed(ActionEvent e) {
                printDateAndTime();
            }
        });
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writeToLogFile();
            }
        });
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeBackgroundColor();
            }
        });
        item4.addActionListener(new ActionListener() {
            @Override
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
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        String dateTime = dateFormat.format(new Date());
        textArea.append(dateTime + "\n");
    }

    private void writeToLogFile() {
        try {
            FileWriter writer = new FileWriter("log.txt", true);
            writer.write(textArea.getText());
            writer.close();
            textArea.append("Contents written to log.txt\n");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private void changeBackgroundColor() {
        // This is a WIP right now
        Random random = new Random();
        int greens = random.nextInt(101) + 65;
        Color color = new Color(255, greens, 0);
        textArea.setBackground(color);
        textArea.repaint();
        textArea.append("Background set to: " + color + "\n");
    }

    public static void main(String[] args) {
        new MenuInterface();
    }
}