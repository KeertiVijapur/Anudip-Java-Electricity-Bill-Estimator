import java.util.Scanner;

public class ElectricityBillEstimator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double serviceCharge = 50.0;
        double billAmount = 0.0;

        System.out.println("================================");
        System.out.println("    ELECTRICITY BILL ESTIMATOR");
        System.out.println("================================");

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter units consumed: ");
        double units = sc.nextDouble();

        if (units < 0) {
            System.out.println("Error: Units cannot be negative.");
            sc.close();
            return;
        }

        if (units <= 100) {
            billAmount = units * 1.50;
        } else if (units <= 200) {
            billAmount = (100 * 1.50)
                       + ((units - 100) * 2.50);
        } else {
            billAmount = (100 * 1.50)
                       + (100 * 2.50)
                       + ((units - 200) * 4.00);
        }

        double totalBill = billAmount + serviceCharge;

        System.out.println("\n================================");
        System.out.println("       ELECTRICITY BILL");
        System.out.println("================================");
        System.out.println("Customer Name : " + name);
        System.out.println("Units Consumed: " + units);
        System.out.printf("Energy Charges: Rs. %.2f%n", billAmount);
        System.out.printf("Service Charge: Rs. %.2f%n", serviceCharge);
        System.out.println("--------------------------------");
        System.out.printf("Total Bill    : Rs. %.2f%n", totalBill);
        System.out.println("================================");

        sc.close();
    }
}