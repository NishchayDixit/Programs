import java.util.Scanner;

public class Sum_Of_Even_And_Odd_4_6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int positive_even_sum = 0;
		int negative_odd_sum = 0;
		while(true) {
			System.out.print("Enter any real number(R): ");
			int number = scanner.nextInt();
			
			if(number%2 == 0 && number > 0) {
				positive_even_sum += number;
			}
			
			if(number%2 != 0 && number < 0) {
				negative_odd_sum += number;
			}
			
			if(number == 0) {
				break;
			}
		}
		System.out.println("----------------------------------------");
		System.out.println("The sum of positive even numbers is: " + positive_even_sum);
		System.out.println("The sum of negative odd numbers is: " + negative_odd_sum);
	}
}
