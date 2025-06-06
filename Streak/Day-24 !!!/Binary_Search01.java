package Binary;
//For Arrays in the Ascending Order 
public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,34,56,67,89,95,123};
        int target = 89;
        int index = binary(arr,target);
        System.out.println(index);
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
}
