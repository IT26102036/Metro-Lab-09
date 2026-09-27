import java.util.Scanner;

public class IT26102036Lab9Q2 {

    // Method to calculate the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Call circleArea method and display result
        double area = circleArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        scanner.close();
    }
}