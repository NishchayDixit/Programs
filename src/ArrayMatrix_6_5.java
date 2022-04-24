import java.util.Scanner;

public class ArrayMatrix_6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size of two-dimension array: ");
        int array_size = scanner.nextInt();
        int[][] array = new int[array_size][array_size];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("\t\tTWO-DIMENSIONAL ARRAY");
        System.out.println("-------------------------------------");
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
