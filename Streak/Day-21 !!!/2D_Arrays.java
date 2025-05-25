package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Two_dim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] arr = new int[3][3];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr[2]));
    }
}
