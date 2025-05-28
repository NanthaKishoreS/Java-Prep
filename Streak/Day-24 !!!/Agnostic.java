package Binary;

public class Agnostic {
    public static void main(String[] args) {
        int[] arr = {1,2,34,56,67,87,95,123};
        int[] arr2 = {123,4,98,87,56,45,23,12,1,-4,-7,-8};
        int target = 87;
        int ans = 0;
        if(arr[0]<arr[arr.length-1]){
            ans = binary(arr,target);
        }
        else{
            ans = Search(arr,target);
        }
        System.out.println(ans);
    }
    static int binary(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
            int mid = (start+(end-start)/2);
            if(target<arr[mid]){
                end = mid -1;
            } else if(target>arr[mid]){
                start = mid +1 ;
            } else{
                return mid;
            }
        }
        return -1;

    }
    static int Search(int[] arr,int target){
        int start = 0;
        int end = arr.length -1 ;
        while(start<=end){
            int mid = (start+(end-start)/2);
            if(target<arr[mid]){
                start = mid + 1;
            } else if (target>arr[mid]) {
                end = mid - 1;;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
