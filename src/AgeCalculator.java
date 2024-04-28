import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator extends JFrame implements ActionListener {
    private final JLabel birthDateLabel;
    private final JTextField birthDateTextField;
    private final JButton calculateButton;
    private final JLabel ageLabel;

    public AgeCalculator() {
        super("Age Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(625, 135);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        birthDateLabel = new JLabel("Enter birth date (YYYY-MM-DD):");
        birthDateLabel.setPreferredSize(new Dimension(215, 50));

        birthDateTextField = new JTextField();
        birthDateTextField.setPreferredSize(new Dimension(200, 50));

        calculateButton = new JButton("Calculate Age");
        calculateButton.setPreferredSize(new Dimension(150, 30));

        ageLabel = new JLabel("");

        calculateButton.addActionListener(this);

        JPanel promptPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        promptPanel.add(birthDateLabel);
        panel.add(promptPanel);

        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        inputPanel.add(birthDateTextField);
        panel.add(inputPanel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(calculateButton);
        panel.add(buttonPanel);

        JPanel outputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        outputPanel.add(ageLabel);
        panel.add(outputPanel);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == calculateButton) {
            String birthDateString = birthDateTextField.getText();
            LocalDate birthDate = LocalDate.parse(birthDateString, DateTimeFormatter.ISO_LOCAL_DATE);
            LocalDate currentDate = LocalDate.now();
            Period period = Period.between(birthDate, currentDate);
            ageLabel.setText("Your Age: " + period.getYears() + " Years, " + period.getMonths() + " Months, and "
                                + period.getDays() + " Days.");
        }
    }

    public static void main(String[] args) {
        new AgeCalculator();
    }
}
