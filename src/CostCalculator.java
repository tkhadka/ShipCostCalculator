import java.util.Scanner;

/*
Pseudocode:
- Create a Scanner object to read input from the console.
- Ask the user to enter the price of an item.
- Read the item's price.
- Initialize variables for the shipping charge and the total cost.
- If the item's price is $100 or more, shipping is free.
- Otherwise, calculate shipping as 2% of the item's price.
- Calculate the total cost as the sum of the item price and the shipping charge.
- Display the shipping charge and the total cost to the user.80
*/

public class CostCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the item price: ");
        double priceOfItem = inputScanner.nextDouble();

        double shippingCharge;
        double totalCost;

        if (priceOfItem >= 100.0) {
            shippingCharge = 0.0;
        } else {
            shippingCharge = 0.02 * priceOfItem;
        }

        totalCost = priceOfItem + shippingCharge;

        System.out.println("Shipping Charge: $" + shippingCharge);
        System.out.println("Total Cost: $" + totalCost);

    }
}
