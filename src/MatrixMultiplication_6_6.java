import java.util.Scanner;

public class MatrixMultiplication_6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size for Matrix's row: ");
        int matrix_size_r = scanner.nextInt();
        System.out.print("Enter Size for Matrix's column: ");
        int matrix_size_c = scanner.nextInt();
        int[][] first_matrix = new int[matrix_size_r][matrix_size_c];
        int[][] second_matrix = new int[matrix_size_r][matrix_size_c];
        int[][] product = new int[matrix_size_r][matrix_size_c];
        int[][] sum = new int[matrix_size_r][matrix_size_c];

        System.out.println("--------------------------------------");
        System.out.println("\t\t  Enter First Matrix");
        System.out.println("--------------------------------------");
        for (int i = 0; i < matrix_size_r; i++) {
            for (int j = 0; j < matrix_size_c; j++) {
                first_matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("\t\t Enter Second Matrix");
        System.out.println("--------------------------------------");
        for (int i = 0; i < matrix_size_r; i++) {
            for (int j = 0; j < matrix_size_c; j++) {
                second_matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix_size_r; i++) {
            for (int j = 0; j < matrix_size_c; j++) {
                sum[i][j] = first_matrix[i][j] + second_matrix[i][j];
            }
        }

        for (int i = 0; i < matrix_size_r; i++) {
            for (int j = 0; j < matrix_size_c; j++) {
                product[i][j] = 0;
                for (int k = 0; k < matrix_size_c; k++) {
                    product[i][j] += first_matrix[i][k] * second_matrix[k][j];
                }
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("\t\t    MATRIX ADDITION");
        System.out.println("--------------------------------------");
        for (int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");
        System.out.println("\t\t MATRIX MULTIPLICATION");
        System.out.println("--------------------------------------");
        for (int[] row : product) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
    }
}
