/* WAP to find the percentage of five subjects */

import java.util.Scanner;
//import java.util.Arrays;

public class Calculate_Percentage_Of_Subjects_2_4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Declare scanner class
		Scanner scanner = new Scanner(System.in);
		
		// Declare and initialize one-dimensional array to store the marks of five subjects
		int mark_of_subjects[] = new int[5];
		
		// Get the marks of subjects at runtime
		System.out.print("Enter the marks of subjects: ");
		for(int i = 0; i < mark_of_subjects.length; i++) {
			mark_of_subjects[i] = scanner.nextInt();
		}
		
		// initialize total
		int total = 0;
		
		// Calculate the total of five subject's marks
		for(int i = 0; i < mark_of_subjects.length; i++) {
			total += mark_of_subjects[i];
		}
		
		// System.out.println(Arrays.toString(mark_of_subjects));
		// System.out.println(total);
		
		System.out.println("-------------------------------------------");
		
		// Calculate the percentage and print it
		System.out.println("The Percentage of five subjects is: " + ((total / 500.00) * 100) + "%");
	}
}