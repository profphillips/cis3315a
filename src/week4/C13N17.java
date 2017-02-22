package week4;

/**
 * Class to work with complex numbers.
 *
 * @author John Phillips
 */
public class C13N17 {
    public static void main(String[] args) {
        Complex c1 = new Complex(3.5, 5.5);
        
    }
}

class Complex implements Cloneable {

    // a + bi
    private double a; // real part
    private double b; // imaginary part

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Complex add(Complex c) {
        return new Complex((a+c.getA()),(b+c.getB()));
    }
    
    public Complex sub(Complex c) {
        return new Complex((a-c.getA()), (b-c.getB()));
    }

}
