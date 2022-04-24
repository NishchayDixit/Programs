/* WAP that reads a number in meters, converts it to feet, and display the result */

import java.util.Scanner;

public class Meter_To_Feet_2_5 {
	public static void main(String[] args) {
		
		// To avoid unused resource warning
		try (Scanner scanner = new Scanner(System.in)) {
			
			// Get the value of meters at runtime
			System.out.print("Enter the value in meters: ");
			double meters = scanner.nextDouble();
			
			System.out.println("-------------------------------");
			
			// Calculate and display the final result
			System.out.println(meters + " Meters is " + (meters * 3.281) + " Feets");
			
		}catch (Exception e) {
			
			// If the Exception occurs then this message will be displayed
			System.out.println("Unused resource 'scanner'");
		}
	}
}
