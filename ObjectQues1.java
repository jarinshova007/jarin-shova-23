import java.util.Scanner;

class Number {
    int number;

    boolean isEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an Even Number");
            return true;
        }
            System.out.println(number + " is not an Even Number");
            return false;
    }
    boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
        }
            return true;
    }
    boolean isGoldBatch(int number) {
        if (number <= 4) {
            System.out.println(number + " is not a Gold Batch Number");
            return false;
        }
        if (number > 4 && number % 2 == 0) { 
            for (int i = 2; i <= number / 2; i++) {
                int x = i;
                int y = number - i;
                if (isPrime(x) && isPrime(y)) {
                    System.out.println(number + " is a Gold Batch Number\nbecause " + x + " + " + y + " = " + number + "\nhere, " + x + " and " + y + " are both Prime Numbers");
                    return true;
                }
            }
        } 
            System.out.println(number + " is not a Gold Batch Number");
            return false;
    }
}
    
    public class ObjectQues1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number n = new Number();

        // taking input
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();
        // display info
        n.isEven(number);
        if (n.isPrime(number)) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }
        n.isGoldBatch(number);

        sc.close();
    }
}
