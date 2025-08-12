// A boy named Sarzil has a garden where trees are planted every 2 meters apart in both the length and width directions. Count the total number of trees.
import java.util.Scanner;

public class SarzilsGarden {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length = ");
        int length = sc.nextInt();
        System.out.print("width = ");
        int width = sc.nextInt();

        int treeNumLength = 0;       // in a different logic:
        int treeNumWidth = 0;        //int treeNumLength = (length / 2) + 1; & int treeNumWidth = (width / 2) + 1;

        for (int i = 0; i <= length; i += 2) {
            treeNumLength = treeNumLength + 1;
        }
        for (int j = 0; j <= width; j += 2) {
            treeNumWidth += 1;
        }
        int totalTreeNum = treeNumLength * treeNumWidth;
        System.out.println("Total number of tree = " + totalTreeNum);

        sc.nextLine();

    }
}