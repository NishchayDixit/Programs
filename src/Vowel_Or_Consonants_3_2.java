/* WAP that prompts the user to enter a letter and check whether a letter is a vowel or consonants */

import java.util.Scanner;

public class Vowel_Or_Consonants_3_2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Declare Scanner Class
		Scanner scanner = new Scanner(System.in);
		
		// Get a character from user at runtime
		System.out.print("Enter a character: ");
		char character = scanner.next().charAt(0);
		
		System.out.println("----------------------------------");
		
		// Core logic
		if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
		   character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
			
			System.out.println("The entered character is Vowal");
			
		}else {
			
			System.out.println("The entered character is Consonant");
			
		}
	}
}