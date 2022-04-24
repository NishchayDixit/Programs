import java.util.Scanner;

public class Prime_4_3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number = scanner.nextInt();
		
//		if(number == 1) {
//			System.out.println("The given number is Prime");
//		}
		
		int prime_number = 0;
		for(int i = 2; i < number; i++) {
			if(number%i == 0) {
//				System.out.println("The given number is NonPrime");
				prime_number = 1;
			}
//			else {
//				System.out.println("The given number is Prime");
//			}
		}
		
		System.out.println("-----------------------------");
		
		if(prime_number == 1) {
			System.out.println("The given number is Non-Prime");
		}else {
			System.out.println("The given number is Prime");
		}
	}
}
