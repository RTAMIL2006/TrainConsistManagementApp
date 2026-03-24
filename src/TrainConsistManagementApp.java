import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp{

    public static void main(String[] args) {

        // Header
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");

        // Initialize train consist
        List<String> trainConsist = new ArrayList<>();

        // Display messages
        System.out.println();
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);
        System.out.println();
        System.out.println("System ready for operations...");
    }
}
