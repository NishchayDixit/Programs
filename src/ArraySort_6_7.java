import java.util.Arrays;
import java.util.Scanner;

class Selection_Sort {
    void sort(int[] array) {
        int temp;
        boolean swapped;
        for (int i = 0; i < array.length; i++) {
            swapped = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
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
public class ArraySort_6_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int array_size = scanner.nextInt();
        int[] array = new int[array_size];
        for (int i = 0; i<array.length; i++) {
            System.out.print("Enter [" + (i + 1) + "] element : ");
            array[i] = scanner.nextInt();
        }

        Selection_Sort selection_sort = new Selection_Sort();
        selection_sort.sort(array);
        selection_sort.sortedArray(array);
    }
}
