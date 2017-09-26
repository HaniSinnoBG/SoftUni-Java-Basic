import java.util.Scanner;

/**
 * Created by user on 9/27/2017.
 */
public class leftAndRightSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i <n ; i++) {
            leftSum = leftSum +Integer.parseInt(scan.nextLine());

        }
        for (int i = 0; i <n ; i++) {
            rightSum = rightSum + Integer.parseInt(scan.nextLine());


        }
        if (leftSum == rightSum)
        {
            System.out.println("Yes, sum = " + leftSum);
        }
        else
        {

            System.out.println("No, diff = " + Math.abs(rightSum - leftSum));
        }

    }
}
