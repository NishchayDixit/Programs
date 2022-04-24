/* WAP to find out largest number from given three numbers without using logical operator */

import java.util.Scanner;

public class Largest_Number_3_3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Declare scanner class
		Scanner scanner = new Scanner(System.in);
		
		// Get first number
		System.out.print("Enter the first number: ");
		int first_number = scanner.nextInt();
		
		// Get second number
		System.out.print("Enter the second number: ");
		int second_number = scanner.nextInt();
		
		//Get second number
		System.out.print("Enter the third number: ");
		int third_number = scanner.nextInt();
		
		System.out.println("---------------------");
		
		// core logic
		if(first_number >= second_number) {
			if(first_number >= third_number) {
				System.out.println(first_number + " is largest number");
			}else {
				System.out.println(third_number + " is largest number");
			}
		}else {
			if(second_number >= third_number) {
				System.out.println(second_number + " is largest number");
			}else {
				System.out.println(third_number + " is largest number");
			}
		}
	}
}
