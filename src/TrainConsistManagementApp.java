import java.util.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
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

        // Create List
        List<Bogie> bogieList = new ArrayList<>();

        // Add passenger bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        // Sort using Comparator
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display sorted bogies
        System.out.println("Bogies sorted by capacity (Ascending):");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}