import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================\n");

        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        trainFormation.add("Sleeper"); 

        System.out.println("Final Train Formation (No duplicates, ordered):");
        System.out.println(trainFormation);
