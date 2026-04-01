import java.util.*;
import java.util.stream.*;

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
        bogieList.add(new Bogie("First Class", 24));

        // Step 2: Calculate total capacity using Stream
        int totalSeats = bogieList.stream()
                .map(b -> b.getCapacity())      // extract capacity
                .reduce(0, Integer::sum);       // sum

        // Step 3: Display result
        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}