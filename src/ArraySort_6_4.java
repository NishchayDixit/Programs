import java.util.Arrays;
import java.util.Scanner;

class BubbleSort {
    void sort(int[] array, int array_size) {
        int temp;
        boolean swapped;
        for (int i = 0; i < array_size; i++) {
            swapped = false;
            for (int j = 0; j < array_size - i - 1; j++){
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    void sortedArray(int[] array) {
        System.out.println("-----------------------------------------------------");
        System.out.println("After Sort: " + Arrays.toString(array));
        System.out.println("-----------------------------------------------------");
    }
}

public class ArraySort_6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int array_size = scanner.nextInt();
        int[] array = new int[array_size];
        for (int i = 0; i<array.length; i++) {
            System.out.print("Enter [" + (i + 1) + "] element : ");
            array[i] = scanner.nextInt();
        }
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array, array_size);
        bubbleSort.sortedArray(array);
    }
}
