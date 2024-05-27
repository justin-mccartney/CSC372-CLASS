import java.util.Comparator;

public class RollnoComparator implements Comparator<Student> {
    @Override
    // Parameters are two individul students - the students to be compared
    public int compare(Student s1, Student s2) {
        // Comparing the roll number for the two students involved in comparison
        return Integer.compare(s1.rollno, s2.rollno);
    }
}