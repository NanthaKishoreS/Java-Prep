package Arrays;
import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(arr[0]);
    }
}
