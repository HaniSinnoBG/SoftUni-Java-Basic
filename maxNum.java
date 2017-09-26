import java.util.Scanner;

/**
 * Created by user on 9/27/2017.
 */
public class maxNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int largest = -1000000000;
        for (int i = 0; i <n ; i++) {
            int number = Integer.parseInt(scan.nextLine());

            if (number >= largest)
            {
                largest =number;
            }
        }
        System.out.println(largest);

    }
}
