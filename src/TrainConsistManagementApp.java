import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

// Bogie class (keep from previous UC - no change)
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

// Main class (as required)
public class TrainConsistManagementApp {

    // Validation methods
    public static boolean isValidTrainID(String trainId) {
        String regex = "TRN-\\d{4}";
        return Pattern.matches(regex, trainId);
    }

    public static boolean isValidCargoCode(String cargoCode) {
        String regex = "PET-[A-Z]{2}";
        return Pattern.matches(regex, cargoCode);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Validation
        if (isValidTrainID(trainId)) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }

        if (isValidCargoCode(cargoCode)) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }

        sc.close();
    }
}