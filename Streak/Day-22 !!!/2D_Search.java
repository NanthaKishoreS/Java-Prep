package Search;
import java.util.*;
public class Two_DimSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,0}
        };
        int target = 0;
        int[] result  = Twodim(arr,target);
        int max = Max(arr);
        System.out.println("The Maximum Element is :  "+ max);
        System.out.println(Arrays.toString(result));
    }

    static int[] Twodim(int[][] arr, int target) {
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(target==arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
    static int Max(int[][] arr) {
        int max = arr[0][0];
        if(arr.length==0){
            return -1;
        }
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;

    }
}
