
import java.sql.SQLOutput;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Print from i to n
        int n = scan.nextInt();
//        for(int i=1;i<=n;i++) {
//            System.out.println(i);
//        }
        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num++;
        }
    }
}
 