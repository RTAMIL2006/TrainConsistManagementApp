import java.util.Arrays;

public class TrainConsistManagementApp {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        private String shape;
        private String cargoType;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        public void assignCargo(String cargo) {
            try {
                System.out.println("Attempting to assign cargo: " + cargo);

                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe: Petroleum cannot be assigned to Rectangular bogie!"
                    );
                }

                this.cargoType = cargo;
                System.out.println("Cargo assigned successfully: " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("ERROR: " + e.getMessage());

            } finally {
                System.out.println("Cargo assignment process completed.\n");
            }
        }

        public String getCargoType() {
            return cargoType;
        }
    }

    static class PassengerBogieSorter {
        public static void bubbleSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void display(int[] arr) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    static class BogieNameSorter {
        public static void sortNames(String[] names) {
            Arrays.sort(names);
        }
    }

    static class BogieSearch {

        public static boolean linearSearch(String[] ids, String key) {
            for (String id : ids) {
                if (id.equals(key)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {

        GoodsBogie rectangularBogie = new GoodsBogie("Rectangular");
        GoodsBogie cylindricalBogie = new GoodsBogie("Cylindrical");

        cylindricalBogie.assignCargo("Petroleum");
        rectangularBogie.assignCargo("Petroleum");
        rectangularBogie.assignCargo("Coal");

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting Capacities:");
        PassengerBogieSorter.display(capacities);

        PassengerBogieSorter.bubbleSort(capacities);

        System.out.println("After Sorting Capacities:");
        PassengerBogieSorter.display(capacities);

        String[] bogieNames = {"Sleeper","AC Chair","First Class","General","Luxury"};

        System.out.println("Before Sorting Names:");
        System.out.println(Arrays.toString(bogieNames));

        BogieNameSorter.sortNames(bogieNames);

        System.out.println("After Sorting Names:");
        System.out.println(Arrays.toString(bogieNames));

        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};
        String searchKey = "BG309";

        boolean found = BogieSearch.linearSearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }

        System.out.println("Program continues safely after all operations.");
    }
}