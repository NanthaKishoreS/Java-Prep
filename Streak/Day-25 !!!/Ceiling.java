package Binary;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,23,34,45,56,67,78,89,90};
        int ans = ceil(arr,68);
        System.out.println(ans);

    }
    static int ceil(int[] arr,int target){
        if(target>arr[arr.length -1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
            while(start<=end) {
            int mid = (start+(end-start)/2);
            if(arr[mid]>target){
                end = mid -1;
            }
            else if (arr[mid]<target){
                    start = mid+1;
            }else return mid;

        }
        return start;
    }
}
