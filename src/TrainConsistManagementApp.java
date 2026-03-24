import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Header
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");

        // Initialize LinkedHashSet
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        System.out.println();
        System.out.println("Attaching bogies to the train...");

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        System.out.println("Attempting to add duplicate bogie (Sleeper)...");
        trainFormation.add("Sleeper"); // duplicate

        // Display final formation
        System.out.println();
        System.out.println("Final Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        System.out.println();
        System.out.println("Note: Duplicate bogies are automatically ignored.");
        System.out.println();
        System.out.println("System ready for operations...");
    }
}