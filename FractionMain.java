import java.util.Scanner;

/**
 * The class is to run the main workflow.
 *
 * @author Varik Hoang <varikmp@uw.edu>
 * @author Samuel Awud <samuelawud@seattlecolleges.edu>
 * @version 
 */
public class FractionMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Fraction program");
        System.out.println("===============================");
        Scanner console = new Scanner(System.in);
        char tryAgain = runWorkflow(console);
        while (tryAgain == 'y' || tryAgain == 'Y')
            tryAgain = runWorkflow(console);
        System.out.println("===============================");
        System.out.println("Thank you for using the program");
    }
 // This method handles the main workflow of the program
    public static char runWorkflow(Scanner console) {
        System.out.print("Enter the numerator for the 1st fraction: ");
        int num1 = console.nextInt();
        System.out.print("Enter the denominator for the 1st fraction: ");
        int den1 = console.nextInt();

        System.out.print("Enter the numerator for the 2nd fraction: ");
        int num2 = console.nextInt();
        System.out.print("Enter the denominator for the 2nd fraction: ");
        int den2 = console.nextInt();

        Fraction f1 = new Fraction(num1, den1);
        Fraction f2 = new Fraction(num2, den2);

        System.out.println("f1 == " + f1);
        System.out.println("f2 == " + f2);

        System.out.printf(f1 + " == %.4f\n", f1.getDecimalValue());
        System.out.printf(f2 + " == %.4f\n", f2.getDecimalValue());

        Fraction f3 = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + f3);

        f3 = f1.divide(f2);
        System.out.println(f1 + " / " + f2 + " = " + f3);

        f3 = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + f3);

        f3 = f1.subtract(f2);
        System.out.println(f1 + " - " + f2 + " = " + f3);

        System.out.print("Would you like to try again ['Y' or 'y']? ");
        return console.next().charAt(0);
    }
}
