/* WAP to check Whether the given number is positive or negative */

import java.util.Scanner;

public class Positive_Or_Negative_3_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Declare Scanner class
		Scanner scanner = new Scanner(System.in);
		
		// Get the number at runtime
		System.out.print("Enter any Number: ");
		int number = scanner.nextInt();
		
		System.out.println("----------------------------------");
		
		// Check whether the number is greater then zero or less then and print appropriate message 
		if(number > 0) {
			System.out.println("The entered number is Positive....");
		}else if(number < 0) {
			System.out.println("The entered number is Negative....");
		}
	}
}