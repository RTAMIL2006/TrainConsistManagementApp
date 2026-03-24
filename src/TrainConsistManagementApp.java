import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Header
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");

        // Initialize HashMap
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        System.out.println();
        System.out.println("Mapping bogies to their capacities...");

        // Insert values (Bogie → Capacity)
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 40);

        // Display all entries
        System.out.println();
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }

        System.out.println();
        System.out.println("System ready for operations...");
    }
}