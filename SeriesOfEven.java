import java.util.Scanner;

public class SeriesOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the last number of the series: ");
        int lastNum = sc.nextInt();

        boolean firstNum = true;

        for (int i = 1; i <= lastNum; i++) {
            if (i % 2 == 0) {
                if (!firstNum) {
                    System.out.print(", ");
                }
                System.out.print(i);
                firstNum = false;
            }
        }

        sc.close();
        
    }
}

