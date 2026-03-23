

import java.util.Scanner;

public class DayNameProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("===============================================");
		System.out.println("      Day Name Program                        ");
		System.out.println("===============================================");
		System.out.println();
		System.out.print("Enter Day Number(1=monday,7=sunday) : ");
		int dayNumber = scanner.nextInt();//5
		System.out.println();
		if (dayNumber < 1 || dayNumber > 7) {
			System.out.println("Error : Day Number must be betwween 1 and 7");
		} else {
			String dayName;
			String dayType;
			switch (dayNumber) {
			case 1:
				dayName = "Monday";
				break;
			case 2:
				dayName = "Tuesday";
				break;
			case 3:
				dayName = "Wednesday";
				break;
			case 4:
				dayName = "Thursday";
				break;
			case 5:
				dayName = "Fridday";
				break;
			case 6:
				dayName = "Saturday";
				break;
			case 7:
				dayName = "Sunday";
				break;
			default:
				dayName = "Unknown";
				break;
			}
			if (dayNumber == 6 || dayNumber == 7) {
				dayType = "Weekend";
			} else {
				dayType = "WeekDay";
			}
			System.out.println("==================================================");
			System.out.printf("Day %d is %s (%s)%n", dayNumber, dayName, dayType);
			System.out.println("==================================================");
		}
		scanner.close();
	}

}
