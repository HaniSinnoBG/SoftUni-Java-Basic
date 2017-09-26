import java.util.Scanner;

/**
 * Created by user on 9/27/2017.
 */
public class vowelsSum {

    public class hani {
        public  void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int sum = 0;
            String s = scan.nextLine();
            for (int i = 0; i <s.length() ; i++) {
                switch (s.charAt(i)) {
                    case 'a':
                        sum += 1;
                        break;
                    case 'e':
                        sum += 2;
                        break;
                    case 'i':
                        sum += 3;
                        break;
                    case 'o':
                        sum += 4;
                        break;
                    case 'u':
                        sum += 5;
                        break;
                }

            }
            System.out.println("Vowels sum =" + sum);


        }
    }
}
