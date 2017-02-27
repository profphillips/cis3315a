package week4;

import static week4.Rational.parseExpression;

/**
 * Work with rational numbers.
 *
 * @author John Phillips
 */
public class C13N16Rational {

    public static void main(String[] args) {
        String exp1 = "3/4 + 1/5";
        String exp2 = "3/4 - 1/5";
        String exp3 = "3/4 * 1/5";
        System.out.println(exp1 + " = " + parseExpression(exp1));
        System.out.println(exp2 + " = " + parseExpression(exp2));
        System.out.println(exp3 + " = " + parseExpression(exp3));
    }
}

/**
 * Class to work with rational numbers.
 *
 * @author John Phillips
 */
class Rational {

    int numerator;
    int denominator;

    /**
     * Construct new Rational from String in form of "3/4".
     *
     * @param s
     */
    public Rational(String s) {
        String[] sArray = s.split("/");
        numerator = Integer.parseInt(sArray[0]);
        denominator = Integer.parseInt(sArray[1]);
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Process expression in form of "3/4 + 1/5".
     *
     * @param s
     * @return
     */
    public static Rational parseExpression(String s) {
        String[] sArray = s.split(" ");
        Rational op1 = new Rational(sArray[0]);
        String operator = sArray[1];
        Rational op2 = new Rational(sArray[2]);
        if (operator.equals("+")) {
            return op1.add(op2);
        } else if (operator.equals("-")) {
            return op1.subtract(op2);
        } else if (operator.equals("*")) {
            return op1.multiply(op2);
        }
        return null;
    }

    public Rational add(Rational ra) {
        int commonDenominator = this.denominator;
        int num1Cross = this.numerator;
        int num2Cross = ra.numerator;
        if (this.denominator != ra.denominator) {
            commonDenominator = this.denominator * ra.denominator;
            num1Cross = this.numerator * ra.denominator;
            num2Cross = ra.numerator * this.denominator;
        }
        return new Rational((num1Cross + num2Cross), commonDenominator);
    }

    public Rational subtract(Rational ra) {
        int commonDenominator = this.denominator;
        int numCross1 = this.numerator;
        int numCross2 = ra.numerator;
        if (this.denominator != ra.denominator) {
            commonDenominator = this.denominator * ra.denominator;
            numCross1 = this.numerator * ra.denominator;
            numCross2 = ra.numerator * this.denominator;
        }
        return new Rational((numCross1 - numCross2), commonDenominator);
    }

    public Rational multiply(Rational ra) {
        int top = this.numerator * ra.numerator;
        int bottom = this.denominator * ra.denominator;
        return new Rational(top, bottom);
    }

    @Override
    public String toString() {
        return "" + numerator + "/" + denominator;
    }
}
