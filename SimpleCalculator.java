import java.util.Scanner;

class Calculator {
    float num1;
    float num2;

    // method
    // addition
    public void add(float num1, float num2) {
        System.out.println("Summation = " + (num1 + num2));
    }
    // subtraction
    public float sub(float num1, float num2) {
        return (num1-num2);
    }
    // 3. multiplication
    public void multiply(float num1, float num2) {
        System.out.println("Multiply = " +  (num1 * num2));
    }
    public float divide(float num1, float num2) {
     // division
        float result = (num1 / num2); 
        System.out.println("Division = " + result);
        return result;
    }
    // remainder
    public float modulo(float num1, float num2) {
        float result = num1 % num2;
        System.out.println("Remainder = " + result);
        return result;
    }
    // power (Math.pow returns double value)
    public double power(float num1, float num2) {
        return (Math.pow(num1, num2));
    }
    // square root
    public void squareRoot(float num1) {
        System.out.println("Square Root Of Number1 = " + (Math.pow(num1, 0.5)));
    }
    // factorial
    public long factorial(int num1) {
        if (num1 == 0 || num1 == 1) {
            return 1;
        }

        long factorialnum1M1 = factorial(num1-1);
        long factorialnum1 = (factorialnum1M1 * num1);
        return factorialnum1;     
    }
    // inverse
    public void inverse(float num1) {
        System.out.println("Inverse Of Number1 = " + (1.0 / num1));
    }
    // percentage
    public float percentage(float num1) {
        float result = (float)num1 / 100;
        return result;
    }
    // e base logarithm
    public double logarithm1(float num1) {
        double result1 = Math.log((double)num1);
        return result1;
    }
    // 12. 10 base log
    public double logarithm2(float num1) {
        double result2 = Math.log10((double)num1);
        return result2;
    }
}
public class SimpleCalculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Calculator casio = new Calculator();

        // taking input
        System.out.print("number1: ");
        casio.num1 = sc.nextFloat();
        System.out.print("number2: ");
        casio.num2 = sc.nextFloat();

        // method call
        // addition
        casio.add(casio.num1, casio.num2);

        // subtraction
        float sub = casio.sub(casio.num1, casio.num2);
        System.out.println("Subtraction = " + sub);

        // multiply
        casio.multiply(casio.num1, casio.num2);

        // divide
        casio.divide(casio.num1, casio.num2);

        // remainder
        casio.modulo(casio.num1, casio.num2);

        // square root
        casio.squareRoot(casio.num1);

        // power
        double power = casio.power(casio.num1, casio.num2);
        System.out.println("Power = " + power);

        // factorial
        long fact = (casio.factorial((int)(casio.num1)));
        System.out.println("Factorial Of Number1 = " + fact);

        // inverse
        casio.inverse(casio.num1);

        // percentage
        float percentage = casio.percentage(casio.num1);
        System.out.println("Percentage Of Number1 = " + percentage);

        // normal logarithm
        double result1 = casio.logarithm1(casio.num1);
        System.out.println("Normal Logarithm Of Number1 = " + result1);

        // base 10 logarithm
        double result2 = casio.logarithm2(casio.num1);
        System.out.println("Base 10 Logarithm Of Number1 = " + result2);

        sc.close();

    }
}