import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

// Main class (as required)
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create list
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("Sleeper", 70));
        bogieList.add(new Bogie("First Class", 24));

        // Step 2: Group using Stream
        Map<String, List<Bogie>> groupedBogies =
                bogieList.stream()
                        .collect(Collectors.groupingBy(Bogie::getName));

        // Step 3: Display grouped result
        System.out.println("Grouped Bogies:");
        for (String key : groupedBogies.keySet()) {
            System.out.println("\nType: " + key);
            for (Bogie b : groupedBogies.get(key)) {
                b.display();
            }
        }
    }
}