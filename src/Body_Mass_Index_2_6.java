/* Body Mass Index (BMI) is a measure of health on weight. It can be calculate by taking your Weight in kilograms and dividing by the square of your
   Height in meters. WAP that prompts the user to enters a weight in pounds and height in inches and displays the BMI */

import java.util.Scanner;

public class Body_Mass_Index_2_6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Declare the Scanner class
		Scanner scanner = new Scanner(System.in);
		
		// Get User's Weight in pounds 
		System.out.print("Enter your Weight in pounds: ");
		double weight = scanner.nextDouble();
		
		// Convert weight into kilograms
		weight = weight * 0.45359237;
		
		// Get User's height in inches 
		System.out.print("Enter your Height in inches: ");
		double height = scanner.nextDouble();
		
		// Convert height in meters
		height = height * 0.0254;
		
		System.out.println("------------------------------------------");
		
		// Calculate and display Body Mass Index
		System.out.print("Your Body Mass Indix is: " + (weight/(height*height)));
	}
}
