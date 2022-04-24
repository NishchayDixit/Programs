import java.util.Scanner;

public class Finding_Tringle_3_7 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first side of tringle: ");
		int first_side = scanner.nextInt();
		System.out.print("Enter second side of tringle: ");
		int second_side = scanner.nextInt();
		System.out.print("Enter third side of tringle: ");
		int third_side = scanner.nextInt();
		
		System.out.println("------------------------------------");
		
		if(first_side == second_side && second_side == third_side) {
			System.out.println("The tringle is Equilateral Trinagle");
		}else if(first_side == second_side || second_side == third_side || third_side == first_side) {
			System.out.println("The tringle is Isosceles Triangle");
		}else if((first_side * first_side) + (second_side * second_side) == (third_side * third_side)) {
			System.out.println("The triangle is Right Angle Triangle");
		}else {
			System.out.println("The triangle is Scalene Triangle");
		}
	}
}