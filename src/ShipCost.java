import java.util.Scanner;

public class ShipCost {


    public static void main(String[] args) {
        double shippingTotal;
        double totalSale = 0;
        double initialSale;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter total for the sale: ");

        initialSale = in.nextDouble();
        totalSale = initialSale;

        if (totalSale >= 100) {
            totalSale = initialSale;
            System.out.println("Your total cost is:" + totalSale);

        }
        else if (totalSale < 100) {
            shippingTotal = initialSale * 1.2;
            System.out.println("Your total cost is:" + shippingTotal);
        }
    }
}