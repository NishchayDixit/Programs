import java.util.Scanner;

public class ArraySearch_6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int array_size = scanner.nextInt();
        int[] array = new int[array_size];
        for (int i = 0; i<array.length; i++) {
            System.out.print("Enter [" + (i + 1) + "] element : ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter Number to Search: ");
        int search_element = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search_element) {
                System.out.println("Element Found at: " + (i+1) + " position");
                break;
            }
        }
    }
}
