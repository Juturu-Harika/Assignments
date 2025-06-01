package Practice.CarCustomization;
import java.util.Scanner;

class Car {
    String manufacturer;
    String model;
    String transmission;
    String fuelType;
    String color;
    String location;

    public Car(String manufacturer, String model, String transmission,
               String fuelType, String color, String location) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.color = color;
        this.location = location;
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nYour Car Details Summary: \n");
        sb.append("Manufacturer: ").append(manufacturer).append("\n");

        if (manufacturer.equalsIgnoreCase("Mahindra")) {
            sb.append("Model: ").append(model).append("\n");
        }

        sb.append("Transmission: ").append(transmission).append("\n");
        sb.append("Fuel Type: ").append(fuelType).append("\n");
        sb.append("Color: ").append(color).append("\n");
        sb.append("Delivery Location: ").append(location).append("\n");

        return sb.toString();
    }
}

public class CarTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String manufacturer = "";
        while (true) {
            System.out.println("Select Car Manufacturer: ");
            System.out.println("1. Mahindra");
            System.out.println("2. Tata");
            System.out.println("3. Maruti");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> manufacturer = "Mahindra";
                case 2 -> manufacturer = "Tata";
                case 3 -> manufacturer = "Maruti";
                default -> {
                    System.out.println("Invalid manufacturer choice. Try again.");
                    continue;
                }
            }
            break;
        }

        String model = "";
        if (manufacturer.equals("Mahindra")) {
            while (true) {
                System.out.println("Select Model (for Mahindra): ");
                System.out.println("1. Scorpio");
                System.out.println("2. Thar");
                System.out.println("3. Scorpio N");
                System.out.println("4. XUV 700");
                int modelChoice = scanner.nextInt();
                scanner.nextLine();
                switch (modelChoice) {
                    case 1 -> model = "Scorpio";
                    case 2 -> model = "Thar";
                    case 3 -> model = "Scorpio N";
                    case 4 -> model = "XUV 700";
                    default -> {
                        System.out.println("Invalid model choice. Try again.");
                        continue;
                    }
                }
                break;
            }
        }

        String transmission = "";
        while (true) {
            System.out.println("Select Transmission Variant: ");
            System.out.println("1. Manual");
            System.out.println("2. Automatic");
            int transChoice = scanner.nextInt();
            scanner.nextLine();
            switch (transChoice) {
                case 1 -> transmission = "Manual";
                case 2 -> transmission = "Automatic";
                default -> {
                    System.out.println("Invalid transmission choice. Try again.");
                    continue;
                }
            }
            break;
        }

        String fuelType = "";
        while (true) {
            System.out.println("Select Fuel Type: ");
            System.out.println("1. Diesel");
            System.out.println("2. Petrol");
            System.out.println("3. CNG");
            int fuelChoice = scanner.nextInt();
            scanner.nextLine();
            switch (fuelChoice) {
                case 1 -> fuelType = "Diesel";
                case 2 -> fuelType = "Petrol";
                case 3 -> fuelType = "CNG";
                default -> {
                    System.out.println("Invalid fuel type. Try again.");
                    continue;
                }
            }
            break;
        }

        String color = "";
        while (true) {
            System.out.println("Select Color: ");
            System.out.println("1. Silver");
            System.out.println("2. Blue");
            System.out.println("3. Yellow");
            int colorChoice = scanner.nextInt();
            scanner.nextLine();
            switch (colorChoice) {
                case 1 -> color = "Silver";
                case 2 -> color = "Blue";
                case 3 -> color = "Yellow";
                default -> {
                    System.out.println("Invalid color choice. Try again.");
                    continue;
                }
            }
            break;
        }

        String location = "";
        while (true) {
            System.out.println("Select Location: ");
            System.out.println("1. Delhi");
            System.out.println("2. Bangalore");
            System.out.println("3. Hyderabad");
            System.out.println("4. Chennai");
            int locationChoice = scanner.nextInt();
            scanner.nextLine();
            switch (locationChoice) {
                case 1 -> location = "Delhi";
                case 2 -> location = "Bangalore";
                case 3 -> location = "Hyderabad";
                case 4 -> location = "Chennai";
                default -> {
                    System.out.println("Invalid location choice. Try again.");
                    continue;
                }
            }
            break;
        }

        Car customCar = new Car(manufacturer, model, transmission, fuelType, color, location);

        System.out.println(customCar.getDetails());
    }
}
