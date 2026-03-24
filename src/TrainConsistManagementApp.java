import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {


        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");

        Set<String> bogieIds = new HashSet<>();

        System.out.println();
        System.out.println("Adding bogie IDs...");


        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");
        bogieIds.add("BG102");


        System.out.println("Bogie IDs entered (with duplicates): [BG101, BG102, BG103, BG101, BG102]");

        System.out.println();
        System.out.println("Unique Bogie IDs in the train:");

        System.out.println(bogieIds);

        System.out.println();
        System.out.println("Note: Duplicate IDs are automatically ignored.");
        System.out.println();
        System.out.println("System ready for operations...");
    }
}