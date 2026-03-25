import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagement {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================\n");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG104");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display bogie IDs
        System.out.println("Bogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        // Display total unique bogies
        System.out.println("\nTotal unique bogies: " + bogieIds.size());

        System.out.println("\nProgram execution continues...");
    }
}
