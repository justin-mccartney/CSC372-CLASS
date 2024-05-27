import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {
    public static void selectionSort(ArrayList<Student> studentList, Comparator<Student> comparator) {
        int n = studentList.size();
        for(int i = 0; i < (n - 1); i++) {
            int minIndex = i;
            for(int j = (i + 1); j < n; j++) {
                if(comparator.compare(studentList.get(j), studentList.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            // Swapping the minimum element with minIndex element
            Student temp = studentList.get(minIndex);
            studentList.set(minIndex, studentList.get(i));
            studentList.set(i, temp);
        }
    }
}
