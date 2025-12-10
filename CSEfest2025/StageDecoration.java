package CSEfest2025;

import java.util.Scanner;

public class StageDecoration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // upper half
        for (int i = 1; i <= N; i++) {
            // spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // lower half
        for (int i = N - 1; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
