import java.util.Scanner;

public class Largest_Number_Using_Conditional_Op_3_5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int first_number = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int second_number = scanner.nextInt();
		System.out.print("Enter the third number: ");
		int third_number = scanner.nextInt();
		
		System.out.println("--------------------------");
		
		int largest_number = (first_number>=second_number)?((first_number>=third_number)?first_number:third_number):((second_number>=third_number)?second_number:third_number);
		
		System.out.println("The Largest number is: " + (largest_number));
	}
}
