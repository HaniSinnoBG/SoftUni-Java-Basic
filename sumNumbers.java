/**
 * Created by user on 9/27/2017.
 */
import java.util.Scanner;
public class sumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        for (int i = 0; i <n ; i++) {

            int num = Integer.parseInt(scan.nextLine());
            sum = sum +num;

        }
        System.out.println(sum);


    }
}
