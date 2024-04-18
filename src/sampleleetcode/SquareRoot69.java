package sampleleetcode;

public class SquareRoot69 {
	public static double calculateSquareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root of a negative number is undefined");
        }

        double guess = x / 2.0;
        double epsilon = 1e-15; // Tolerance for precision

        while (Math.abs(guess * guess - x) > epsilon * x) {
            guess = 0.5 * (guess + x / guess);
        }

        return guess;
    }

    public static void main(String[] args) {
        double number = 25.0; // Example number
        double squareRoot = calculateSquareRoot(number);

        System.out.println("Square root of " + number + " is approximately: " + squareRoot);
    }
}
