import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Header
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");

        // Initialize LinkedList
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println();
        System.out.println("Adding bogies to the train...");

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Display initial consist
        System.out.println("Initial Train Consist : " + trainConsist);

        System.out.println();
        System.out.println("Inserting Pantry Car at position 2...");

        // Insert at index 2
        trainConsist.add(2, "Pantry");

        System.out.println("After Insertion : " + trainConsist);

        System.out.println();
        System.out.println("Removing first and last bogie...");

        // Remove first and last
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Final consist
        System.out.println("Final Train Consist : " + trainConsist);

        System.out.println();
        System.out.println("System ready for operations...");
    }
}