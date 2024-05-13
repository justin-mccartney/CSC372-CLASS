public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private Integer integerOfEmployeeID;
    private double salary;
    private double bonus;

    // Constructor
    public Employee() {
        this.salary = 0.0;
    }

    // Setter - first name
    // This will set the first name value to the value entered in main
    // This will also ensure that the first name value is a String
    public void setFirstName(String firstName) {
        if (!(firstName instanceof String)) {
            System.out.println("This value is not a string.");
            this.firstName = "Unavailable";
        } else {
            this.firstName = firstName;
        }

    }

    // Getter - first name
    public String getFirstName() {
        return firstName;
    }

    // Setter - last name
    // This will set the last name value to that of which is entered in main
    // This will also make sure that the last name value is a String
    public void setLastName(String lastName) {
        if (!(lastName instanceof String)) {
            System.out.println("This value is not a string.");
            this.lastName = "Unavailable";
        } else {
            this.lastName = lastName;
        }
    }

    // Getter - last name
    public String getLastName() {
        return lastName;
    }

    // Setter - employee ID
    // This will set the employee ID number to the input value
    // This setter will also make sure that the employee ID entered is an integer
    public void setEmployeeID(int employeeID) {
        integerOfEmployeeID = employeeID;
        if (!(integerOfEmployeeID instanceof Integer)) {
            System.out.println("This value is not a integer.");
            this.employeeID = 0;
        } else {
            this.employeeID = employeeID;
        }
    }

    // Getter - employee ID
    public int getEmployeeID() {
        return employeeID;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    // Print method ...
    public void employeeSummary() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }
}
