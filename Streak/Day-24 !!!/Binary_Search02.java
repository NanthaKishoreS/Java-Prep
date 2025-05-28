package Binary;

public class DesendingSearch {
    public static void main(String[] args) {
        int[] arr = {123,4,98,87,56,45,23,12,1,-4,-7,-8};
        int target = 87;
        int index = Search(arr,target);
        System.out.println(index);

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