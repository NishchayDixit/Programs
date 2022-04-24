/* WAP to convert Fahrenheit to Celsius. */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Fahrenheit_To_Celsius_2_3 {
	
	// Declaration of DecimalFormat class to get output in "00.00" format.
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Declare Scanner class 
		Scanner scanner = new Scanner(System.in);
		
		// Get the temperature in Fahrenheit at run-time
		System.out.print("Enter the temperature in Fahrenheit: ");
		int fahrenheit = scanner.nextInt();
		
		System.out.println("----------------------------------------------------------");
		
		// Calculate and print final output 
		System.out.println(fahrenheit + "°F Degree Fahrenheit is equal to " + (df.format((fahrenheit - 32) * 0.56)) + "°C Degree Celsius");
		
	}
}