import java.io.Serializable;

public class Scholar implements Serializable {
    private String name;
    private String address;
    private double GPA; // Grade point average

    // Setter for all three variables - will fill / update with values present for name, address, and GPA
    public Scholar(String name, String address, double GPA) {
        this.name = name;
        this.address = address;
        this.GPA = GPA;
    }

    // Getter for name - will return the name value when necessary
    public String getName() {
        return name;
    }

    // Getter for address...
    public String getAddress() {
        return address;
    }

    // Getter for GPA...
    public double getGPA() {
        return GPA;
    }

    // Section to create a single output of all three variables: name, address, and GPA
    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", GPA: " + GPA;
    }
}
