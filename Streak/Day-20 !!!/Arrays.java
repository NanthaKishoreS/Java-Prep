package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Code {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i <arr.length; i++){
            arr[i]=scan.nextInt();
        }
        for (int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        for(int num : arr){
            System.out.println(num + " ");
        }
        scan.nextLine();
        System.out.println(Arrays.toString(arr));
    }
}
