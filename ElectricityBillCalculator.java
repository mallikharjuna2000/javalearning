
import java.util.Scanner;

public class ElectricityBillCalculator {
	private static final double RATE_SLAB_1 = 2.00;// 1-100 UNITS
	private static final double RATE_SLAB_2 = 3.50;// 101-200 UNITS
	private static final double RATE_SLAB_3 = 5.00;// 201-300 UNITS
	private static final double RATE_SLAB_4 = 7.00;// above 300 UNITS
	private static final double FIXED_CHARGE = 50.00;
	private static final double SURCHARGE_PCT = 0.02;
	private static final double SURCHARGE_THRESHOLD = 500.00;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=====================================================");
		System.out.println("       Electricity Bill Calculator ==================");
		System.out.println("=====================================================");
		System.out.println();
		System.out.print("Enter Consumer Name");
		String name = scanner.nextLine();
		System.out.print("Enter Consumer Number ");
		String consumerNumber = scanner.nextLine();
		System.out.println("Enter Units Consumed");
		int units = scanner.nextInt();
		System.out.println();
		if (units < 0) {
			System.out.println("Error : units consumed cannot be negative");
		} else {
			double unitCharge;
			if (units <= 100) {
				unitCharge = units * RATE_SLAB_1;
			} else {
				if (units <= 200) {
					unitCharge = (100 * RATE_SLAB_1) + ((units - 100) * RATE_SLAB_2);
				} else {
					if (units <= 300) {
						unitCharge = (100 * RATE_SLAB_1) + (100 * RATE_SLAB_2) + ((units - 200) * RATE_SLAB_3);
					} else {
						unitCharge = (100 * RATE_SLAB_1) + (100 * RATE_SLAB_2) + (100 * RATE_SLAB_3)
								+ ((units - 300) * RATE_SLAB_4);
					}
				}
			}
			double subtotal = unitCharge + FIXED_CHARGE;
			double surcharge = 0;
			if (subtotal > SURCHARGE_THRESHOLD) {
				surcharge = subtotal * SURCHARGE_PCT;
			} else {
				surcharge = 0;
			}
			double totalBill = subtotal + surcharge;

			// Display Bill
			System.out.println("===================================================");
			System.out.println("            Electricity Bill                       ");
			System.out.println("===================================================");
			System.out.printf("%-20s :%s%n", "Consumer Name ", name);
			System.out.printf("%-20s :%s%n", "Consumer Number ", consumerNumber);
			System.out.printf("%-20s :%d%n", "units Consumed  ", units);
			System.out.println("---------------------------------------------------");
			System.out.printf("%-20s : Rs. %8.2f%n", "Unit Charges", unitCharge);
			System.out.printf("%-20s : Rs. %8.2f%n", "Fixed Charge", FIXED_CHARGE);
			if (surcharge > 0) {
				System.out.printf("%-20s : Rs. %8.2f%n", "Late Surcharge (2%)", surcharge);
			} else {
				System.out.printf("%-20s : %s%n", "Late Surcharge", "NIL");
			}
			System.out.println("-----------------------------------------------------");
			System.out.printf("%-20s : Rs. %8.2f%n", "TOTAL BILL", totalBill);
			System.out.println("==========================================");

		}
		scanner.close();
	}

}
