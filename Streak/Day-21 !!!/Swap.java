package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] a,int index1,int index2){
        int temp= a[index1];
        a[index1]= a[index2];
        a[index2] = temp;
    }
}
