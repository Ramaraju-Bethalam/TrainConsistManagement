import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 * Description:
 * Models passenger bogies as objects and sorts them by capacity using Comparator.
 */
public class TrainConsistManagement {

    // Inner class to model Bogie
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("==========================================\n");

        // Create List of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies with their capacities
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display before sorting
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Sort bogies by capacity (ascending order)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display after sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nUC7 sorting completed...");
    }
}