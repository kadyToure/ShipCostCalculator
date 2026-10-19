import java.util.Scanner;

public class ShipCostCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the price of the item: ");
            double price = scanner.nextDouble();

            double shippingCost;
            if (price >= 100.0)
            {
                shippingCost = 0.0;
            } else
            {
                shippingCost = price * 0.02;
            }

            double totalPrice = price + shippingCost;

            System.out.printf("Shipping Cost: $%.2f%n", shippingCost);
            System.out.printf("Total Price:   $%.2f%n", totalPrice);

            scanner.close();
        }
    }
