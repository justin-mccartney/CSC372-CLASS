import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Main being used for Module 1 Critical Thinking
        // Employee and Manager Classes ...
        /*
        Employee employee = new Employee();
        employee.setFirstName("Micah");
        employee.setLastName("Ma'a");
        employee.setEmployeeID(1993);
        employee.setBonus(0);
        employee.employeeSummary();
        System.out.println("\n");

        Manager manager = new Manager();
        manager.setFirstName("Zana");
        manager.setLastName("Muno");
        manager.setEmployeeID(1997);
        manager.setDepartment("Excavation");
        manager.setBonus(3200);
        manager.employeeSummary();
        */

        // Main being used for Module 6 Critical Thinking
        // Student, NameComparator, RollnoComparator, and SelectionSort classes are involved

        // Create array list - fill with ten individual students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(10, "Jamie", "123 Bard Avenue"));
        students.add(new Student(2, "Kyle", "1016 Maple Street"));
        students.add(new Student(7, "Patrick", "2020 Wonder Drive"));
        students.add(new Student(3, "Ella", "337 Mayflower Drive"));
        students.add(new Student(8, "Ronnie", "4 Lemon Street Court"));
        students.add(new Student(4, "Orlando", "60204 Traders Way"));
        students.add(new Student(6, "Sammy", "376 Hale Street"));
        students.add(new Student(5, "Bartosz", "1 University Way"));
        students.add(new Student(1, "Franklin", "1200 Salem Street"));
        students.add(new Student(9, "Nicholas", "11 Beverly Avenue"));

        // Print the original list of students
        System.out.println("List in current form: ");
        for(Student stu : students) {
            System.out.println(stu);
        }

        // Sort the list of students by name
        SelectionSort.selectionSort(students, new NameComparator());
        System.out.println("\nList stored by student names: ");
        for(Student stu : students) {
            System.out.println(stu);
        }

        // Sort the list of students by roll number
        SelectionSort.selectionSort(students, new RollnoComparator());
        System.out.println("\nList sorted by roll numbers: ");
        for(Student stu : students) {
            System.out.println(stu);
        }
    }
}
