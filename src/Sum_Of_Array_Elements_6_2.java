import java.util.Scanner;

public class Sum_Of_Array_Elements_6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        int array_length = scanner.nextInt();
        int[] array_of_numbers = new int[array_length];
        for(int i = 0; i < array_of_numbers.length; i++) {
            array_of_numbers[i] = scanner.nextInt();
        }
        int sumofelements = 0;
        for (int array_of_number : array_of_numbers) {
            if (array_of_number % 3 == 0 || array_of_number % 5 == 0) {
                sumofelements += array_of_number;
            }
        }
        System.out.println("The sum of numbers which divisible by 3 or by 5: " + sumofelements);
    }
}
