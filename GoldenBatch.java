import java.util.Scanner;

public class GoldenBatch {

        public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        boolean isGolden = false;
        if (num > 4 && num % 2 == 0) {
            for (int i = 2; i <= num / 2; i++) {
                    int x = i;
                    int y = (num - i);

                    if (isPrime(i) && isPrime(num-i)) {
                        System.out.println(num + " is a Golden Batch number\nbecause " + x + " + " + y + " = " + num + "\n" + x + " and " + y + " are Prime Numbers");
                        isGolden = true;
                        break;
                    }
                }
            } else {
                System.out.println(num + " is not a Golden Batch number");
            }

            sc.close();

        }
}

