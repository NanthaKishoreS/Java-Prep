package Arrays;
import java.util.Arrays;
public class Serach2d {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        int target = 9;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        for(int i = 0; i< arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
