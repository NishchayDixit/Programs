import java.util.Arrays;
import java.util.Scanner;

public class Counter_for_Odd_And_Even_6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        int array_length = scanner.nextInt();
        int[] array_of_numbers = new int[array_length];
        for(int i = 0; i < array_of_numbers.length; i++) {
            array_of_numbers[i] = scanner.nextInt();
        }
        int even_counter = 0;
        int odd_counter = 0;
        for (int array_of_number : array_of_numbers) {
            if (array_of_number % 2 == 0) {
                even_counter++;
            } else {
                odd_counter++;
            }
        }
        System.out.println("---------------------------------");
        System.out.println(Arrays.toString(array_of_numbers));
        System.out.println("---------------------------------");
        System.out.println("The number of even digits are: " + even_counter);
        System.out.println("The number of odd digits are: " + odd_counter);
    }
}
