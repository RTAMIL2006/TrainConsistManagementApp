import java.util.*;


class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}


class PassengerBogie {
    String name;
    int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}


public class TrainConsistManagementApp {

    public static void main(String[] args) {

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0); // ❌ Invalid

            System.out.println("Bogies created successfully");

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}