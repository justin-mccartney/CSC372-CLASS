import java.util.List;
import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        // Creating new list
        List<String> list = new ArrayList<>();

        // Adding elements to list
        list.add("Parrot");
        list.add("Humming Bird");
        list.add("Blue Jay");
        list.add("Parrot"); // Duplicate item - still added to list

        // Printing the list and the label
        System.out.println("Contents:");
        for(String bird : list) {
            System.out.println(bird);
        }
    }
}
