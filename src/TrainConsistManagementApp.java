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

    public static void main(String[] args) {

        GoodsBogie rectangularBogie = new GoodsBogie("Rectangular");
        GoodsBogie cylindricalBogie = new GoodsBogie("Cylindrical");

        cylindricalBogie.assignCargo("Petroleum");
        rectangularBogie.assignCargo("Petroleum");
        rectangularBogie.assignCargo("Coal");

        System.out.println("Program continues safely after exception handling.");
    }
}