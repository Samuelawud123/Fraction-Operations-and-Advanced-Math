
/**
 * The class is to calculate exponential and factorial
 *
 * @author Varik Hoang <varikmp@uw.edu>
 * @author Samuel Awud <samuelawud@seattlecolleges.edu>
 * @version __________
 */
public class ExtraCredit {
    public static void main(String[] args) {
        double e = Math.E;
        System.out.printf("Math.E = %.6f%n", e);

        for (int n = 0; n <= 9; n++) {
            double exponential = calculateExponential(n);
            System.out.printf("exponential(%d) = %.6f%n", n, exponential);
        }
    }
// This function calculates sum of series 1/n! from 0 to n
    public static double calculateExponential(int n) {
        double sum = 0.0;

        for (int i = 0; i <= n; i++) {
            double term = 1.0 / factorial(i);
            sum += term;
        }

        return sum;
    }
// This function calculates factorial of n
    public static int factorial(int n) {
        int result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}