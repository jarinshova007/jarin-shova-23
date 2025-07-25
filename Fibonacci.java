import java.util.Scanner;

public class Fibonacci {

    public int printFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return printFibonacci(n - 1) + printFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the last number of Fibonacci series: ");
        int lastNum = sc.nextInt();

        Fibonacci f = new Fibonacci(); // object of Fibonacci class

        System.out.println("The Fibonacci series up to " + lastNum + ":");
        for (int i = 0; i < lastNum; i++) {
            System.out.print(f.printFibonacci(i) + " ");
        }

        sc.close();
        
    }
}


