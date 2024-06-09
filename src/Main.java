import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating new linked list for storing scholars - students
        LinkedList<Scholar> scholars = new LinkedList<>();

        // Creating new scanner to scan input values
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a students name, OR type 'done' to finish adding students: ");

            // Creating name variable, and tempName variable for checking purposes
            String name = null;
            String tempName = scanner.nextLine();

            // Checking to see if the user has entered a proper input - being a String with alpha characters and spaces...
            if (tempName != null && tempName.matches("[a-zA-Z ]+")) {
                name = tempName;
            } else {
                System.out.println("Something went wrong, input for name is incorrect! Exiting...");
                System.exit(0);
            }

            // Checking for exit string - seeing if the user has entered either 'exit', or 'Exit'
            if (name.equalsIgnoreCase("done") || name.equalsIgnoreCase("Done")) {
                break;
            }

            // Prompting user for an address, then filling address variable
            System.out.println("Please enter the students address: ");
            String address = null;
            String tempAddress = scanner.nextLine();

            // Checking to see if address input is proper - numeric characters, alpha characters, and spaces...
            if(tempAddress != null && tempAddress.matches("[a-zA-Z0-9 ]+")) {
                address = tempAddress;
            } else {
                System.out.println("Something went wrong, improper input address. Exiting...");
                System.exit(0);
            }

            double GPA = -1;
            while(GPA < 0 || GPA > 4.0) {
                System.out.println("Enter the students GPA on a scale between 0.0 - 4.0");
                try {
                    GPA = Double.parseDouble(scanner.nextLine());
                    if(GPA < 0 || GPA > 4.0) {
                        System.out.println("Invalid GPA, please enter a value between 0.0 and 4.0: ");
                    }
                } catch(NumberFormatException e) {
                    System.out.println("Invalid input, please enter a numeric value for GPA: ");
                }
            }

            scholars.add(new Scholar(name, address, GPA));
        }

        // Sorting students by name
        Collections.sort(scholars, Comparator.comparing(Scholar::getName));

        // Writing the sorted list to an external file
        // Try - catch block to ensure that info has been properly written to file
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("scholars.txt"))) {
            for(Scholar scholar : scholars) {
                writer.write(scholar.toString());
                writer.newLine();
            }
            System.out.println("Student information has been written to file. File Name: scholars.txt");
        } catch(IOException e) {
            System.out.println("Something went wrong when trying to print to file. Stack Trace: ");
            e.printStackTrace();
        }

        scanner.close();
    }
}
