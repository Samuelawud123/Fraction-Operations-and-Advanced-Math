/**
 * The class is to define the fraction object that include properties
 * - Numerator
 * - Denominator
 * The class provided some methods such as:
 * - Addition
 * - Subtraction
 * - Multiplication
 * - Division
 *
 * @author Varik Hoang <varikmp@uw.edu>
 * @author Samuel Awud <samuelawud@seattlecolleges.edu>
 * @version __________
 */

// Class Fraction represents a mathematical fraction
public class Fraction {
    
    // Variables to hold the numerator and denominator of the fraction
    private int numerator;
    private int denominator;

    // Constructor to create a fraction with specified numerator and denominator
    public Fraction(int numerator, int denominator) {
        // Denominator can't be zero, throw an exception if it is
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce(); // simplify the fraction
        adjustSign(); // ensure that the negative sign, if any, is on the numerator
    }

    // Get method for numerator
    public int getNumerator() {
        return this.numerator;
    }

    // Get method for denominator
    public int getDenominator() {
        return this.denominator;
    }

    // Set method for numerator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        reduce(); // simplify the fraction
        adjustSign(); // ensure that the negative sign, if any, is on the numerator
    }

    // Set method for denominator
    public void setDenominator(int denominator) {
        // Denominator can't be zero, throw an exception if it is
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        this.denominator = denominator;
        reduce(); // simplify the fraction
        adjustSign(); // ensure that the negative sign, if any, is on the numerator
    }

    // Convert fraction to decimal
    public double getDecimalValue() {
        return (double) this.numerator / this.denominator;
    }

    // Add another fraction to this fraction
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Subtract another fraction from this fraction
    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Multiply this fraction by another fraction
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Divide this fraction by another fraction
    public Fraction divide(Fraction other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Compute the greatest common factor of two integers
    protected int getGCF(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGCF(b, a % b);
        }
    }

    // Simplify the fraction by dividing both the numerator and denominator by their GCF
    protected void reduce() {
        int gcd = getGCF(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    // Adjust the negative sign to be on the numerator
        protected void adjustSign() {
            if (denominator < 0) {
                numerator *= -1;
                denominator *= -1;
            }
        }
        
    // Convert the fraction to a string representation
       @Override
       public String toString() {
           if (denominator == 1) {
               return "" + numerator;
           } else {
               return numerator + "/" + denominator;
           }
       }
   }