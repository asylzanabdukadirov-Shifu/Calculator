import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter delivery distance in km: ");
        double distanceKm = scanner.nextDouble();

        if (distanceKm < 0) {
            System.out.println("Distance cannot be negative.");
            scanner.close();
            return;
        }

        DeliveryCalculator calculator =
                new DeliveryCalculator(new StandardDeliveryStrategy());

        int choice;
        do {
            System.out.println("\nChoose a delivery method:");
            System.out.println("1. Standard delivery");
            System.out.println("2. Express delivery");
            System.out.println("3. Pickup (free)");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculator.setStrategy(new StandardDeliveryStrategy());
                    System.out.println("Standard delivery selected.");
                    System.out.println("Cost: " + calculator.calculateCost(distanceKm));
                    break;
                case 2:
                    calculator.setStrategy(new ExpressDeliveryStrategy());
                    System.out.println("Express delivery selected.");
                    System.out.println("Cost: " + calculator.calculateCost(distanceKm));
                    break;
                case 3:
                    calculator.setStrategy(new PickupStrategy());
                    System.out.println("Pickup selected.");
                    System.out.println("Cost: " + calculator.calculateCost(distanceKm));
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 0, 1, 2, or 3.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
