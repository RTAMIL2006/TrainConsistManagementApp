import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Header
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");

        // Initialize passenger bogie list
        List<String> passengerBogies = new ArrayList<>();

        System.out.println();
        System.out.println("Adding passenger bogies...");

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("Current Passenger Bogies : " + passengerBogies);

        System.out.println();
        System.out.println("Removing a bogie (AC Chair)...");

        // Remove bogie
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("After Removal : " + passengerBogies);

        System.out.println();
        System.out.println("Checking if Sleeper bogie exists...");

        // Check existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present in the train.");
        }

        // Final state
        System.out.println();
        System.out.println("Final Passenger Bogies : " + passengerBogies);
        System.out.println();
        System.out.println("System ready for operations...");
    }
}
