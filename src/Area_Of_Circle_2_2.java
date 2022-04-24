/* WAP to calculate Area of Circle */

import java.util.Scanner;

public class Area_Of_Circle_2_2 {
	
	// Declare PI as Global and Static variable
	static double PI = 3.14;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Declare Scanner Class
		Scanner scanner = new Scanner(System.in);
		
		// Get the value of radius at run time
		System.out.print("Enter the value of Radius: ");
		double radious = scanner.nextDouble();
		
		System.out.println("-----------------------------------------");
		
		// Calculate and print the final result
		System.out.println("The Area Of Circle is: " + (PI * radious * radious));
	}
}
