import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("This is an Even number");
        } else {
            System.out.println("This is an Odd number");
        }
        
        sc.close();
        
    }
}
