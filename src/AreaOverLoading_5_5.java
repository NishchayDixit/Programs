import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOverLoading_5_5 {

    DecimalFormat DECIMALFORMAT = new DecimalFormat("0.00");

    void area(float radius) {
        System.out.println("Area of circle: " + (DECIMALFORMAT.format(Math.PI * radius * radius)));
    }

    void area(double side) {
        System.out.println("Area of Square: " + (DECIMALFORMAT.format(side * side)));
    }

    void area(double base, double altitude) {
        System.out.println("Area of Triangle: " + (DECIMALFORMAT.format(0.5 * base * altitude)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaOverLoading_5_5 areaOverLoading = new AreaOverLoading_5_5();

        System.out.println("1.Area Of Circle");
        System.out.println("2.Area Of Square");
        System.out.println("3.Area Of Triangle");
        System.out.println("------------------------------");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        System.out.println("------------------------------");
        switch (choice) {
            case 1 -> {
                System.out.print("Enter Radius: ");
                float radius = scanner.nextFloat();
                System.out.println("------------------------------");
                areaOverLoading.area(radius);
            }
            case 2 -> {
                System.out.print("Enter Value Of Side: ");
                double side = scanner.nextDouble();
                System.out.println("------------------------------");
                areaOverLoading.area(side);
            }
            case 3 -> {
                System.out.print("Enter Value Of Base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter Value Of Altitude: ");
                double altitude = scanner.nextDouble();
                System.out.println("------------------------------");
                areaOverLoading.area(base, altitude);
            }
            default -> {
                System.out.println("Invalid Choice!!");
            }
        }
    }
}