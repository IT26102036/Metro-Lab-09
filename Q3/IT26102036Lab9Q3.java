public class IT26102036Lab9Q3 {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to square an integer
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        // Expression i: (3 * 4 + 5 * 7)^2
        int term1 = multiply(3, 4);
        int term2 = multiply(5, 7);
        int sum1 = add(term1, term2);
        int result1 = square(sum1);

        // Expression ii: (4 + 7)^2 + (8 + 3)^2
        int sum2 = add(4, 7);
        int sum3 = add(8, 3);
        int square1 = square(sum2);
        int square2 = square(sum3);
        int result2 = add(square1, square2);

        // Display results matching expected output format
        System.out.println("Result of (3*4+5*7)^2 : " + result1);
        System.out.println("Result of (4+7)^2+(8+3)^2 : " + result2);
    }
}