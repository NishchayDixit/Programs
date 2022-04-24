import java.util.Scanner;

public class RowColumnSum_6_8 {
    @SuppressWarnings({"ForLoopReplaceableByForEach", "CommentedOutCode"})
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size for Matrix's row: ");
        int matrix_size_r = scanner.nextInt();
        System.out.print("Enter Size for Matrix's column: ");
        int matrix_size_c = scanner.nextInt();
        int[][] matrix = new int[matrix_size_r][matrix_size_c];

        System.out.println("--------------------------------------");
        System.out.println("\t\t    Enter The Matrix");
        System.out.println("--------------------------------------");
        for (int i = 0; i < matrix_size_r; i++) {
            for (int j = 0; j < matrix_size_c; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        // int sum_rows = 0;
        // int sum_columns = 0;

        System.out.println("--------------------------------------");
        System.out.println("\t\t\t  SUM OF ROWS");
        System.out.println("--------------------------------------");
        for (int i = 0; i < rows; i++) {
            int sum_rows = 0;
            for (int j = 0; j < columns; j++) {
                sum_rows += matrix[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " row: " + sum_rows);
        }

        System.out.println("--------------------------------------");
        System.out.println("\t\t\tSUM OF COLUMNS");
        System.out.println("--------------------------------------");
        for (int i = 0; i < columns; i++) {
            int sum_columns = 0;
            for (int j = 0; j < rows; j++) {
                sum_columns += matrix[j][i];
            }
            System.out.println("Sum of " + (i + 1) + " column: " + sum_columns);
        }
    }
}
