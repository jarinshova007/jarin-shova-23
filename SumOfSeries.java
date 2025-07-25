import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the last number of the series : ");
        int num = sc.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print(i);

            if (i < num) {
                System.out.print(" + ");
            }
            sum = sum + i;
        }

        System.out.println(" = " + sum);

        sc.close();
        
    }
}
