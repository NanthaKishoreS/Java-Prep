package Arrays;
import java.util.Arrays;

public class PassinginFunc {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] a){
        a[0]=99;
    }
}
