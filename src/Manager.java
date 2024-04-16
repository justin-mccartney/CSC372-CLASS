public class Manager extends Employee {
    private String department;

    // Setter - department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter - department
    public String getDepartment() {
        return department;
    }

    @Override public void employeeSummary() {
        super.employeeSummary();
        System.out.println("Department: " + department);
    }
}
