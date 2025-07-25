import java.util.Scanner;

public class Factorial {

    public long printFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i; // factorial *= i;
        }

        System.out.println("The factorial of " + num + " is " + factorial);
        return factorial;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int _num =  sc.nextInt();

        if (_num < 0) {

            System.out.println("Factorial is not defined for negative numbers");

        } else { 
            Factorial f = new Factorial(); //making an object as the printFactorial method is non-static
            f.printFactorial(_num); //method call
        }
        
        sc.close();

    }
}


