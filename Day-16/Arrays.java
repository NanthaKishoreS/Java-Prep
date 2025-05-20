
import java.util.Arrays;
import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;
    }
}
