/* WAP to print addition of two numbers (with scanner). */

import java.util.Scanner;

public class Addition_Of_Two_Number_2_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		// Declare Scanner class
		Scanner scanner = new Scanner(System.in);
		
		// Get first number from user at runtime
		System.out.print("Enter the first number: ");
		int first_number = scanner.nextInt();
		
		// Get second number from user at runtime
		System.out.print("Enter the second number: ");
		int second_number = scanner.nextInt();
		
		System.out.println("-----------------------------");
		
		// Calculate addition and print it
		System.out.println("The sum of two number is: " + (first_number + second_number));
	}
}
