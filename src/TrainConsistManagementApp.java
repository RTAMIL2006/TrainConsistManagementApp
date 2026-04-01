import java.util.*;

// Main class (as required)
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create ArrayList
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display after insertion
        System.out.println("Passenger Bogies after adding:");
        System.out.println(passengerBogies);

        // Step 4: Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Step 5: Check existence
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper exist? " + exists);

        // Step 6: Final list
        System.out.println("Final Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}