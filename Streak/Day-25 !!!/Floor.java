package Binary;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {1,23,34,45,56,67,78,89,90};
        int ans = floor(arr,77);
        System.out.println(ans);
    }
    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int mid = (start+(end-start)/2);
            if(arr[mid]>target){
                end  = mid -1;
            } else if (arr[mid]<target) {
                start = mid +1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
