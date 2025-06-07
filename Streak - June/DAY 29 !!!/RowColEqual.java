package Binary;
import java.util.Arrays;
public class Search2D {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},
                {11,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 37;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        for(int i = 0;i<arr.length;i++) {
            int index = binary(arr[i],target);
            if(index!=-1){
                return new int[]{i,index};
            }
        }
        return new int[]{-1,-1};
    }
    static int binary(int[] arri,int target){
        int start = 0;
        int end = arri.length-1;
        while(end>=start){
            int mid = start+(end-start)/2;
            if(arri[mid]>target){
                end = mid-1;
            } else if (arri[mid]<target) {
                start = mid +1;
            }else return mid;
        }
        return -1;
    }
}
