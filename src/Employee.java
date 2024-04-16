public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private double salary;

    // Constructor
    public Employee() {
        this.salary = 0.0;
    }

    // Setter - first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter - first name
    public String getFirstName() {
        return firstName;
    }

    // Setter - last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter - last name
    public String getLastName() {
        return lastName;
    }

    // Setter - employee ID
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    // Getter - employee ID
    public int getEmployeeID() {
        return employeeID;
    }

    // Print method ...
    public void employeeSummary() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}
