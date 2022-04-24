import java.util.Scanner;

public class Reverse_Order_4_5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int original_number = scanner.nextInt();
		int reversed_number = 0;
		while(original_number > 0) { //(original_number != 0)
			int digit = original_number%10;
			reversed_number = (reversed_number * 10) + digit;
			original_number /= 10;
		}
		System.out.println("--------------------------------------------");
		System.out.println("Reverse of given number is: "+reversed_number);
	}
}
