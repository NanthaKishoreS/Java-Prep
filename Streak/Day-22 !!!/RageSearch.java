package Search;

public class SearchinIndex {
    public static void main(String[] args) {
        int[] arr = {23,86,23,75,26,89,376,903,3687,21,78};
        int target = 89;
        int start = 2;
        int end = 8;
        int result = indexsearch(arr,start,end,target);
        if(result!=-1){
            System.out.println("The Element is Found at : "+result);
        }
        else System.out.println("Element Not Found");

    }
    static int indexsearch(int[] arr,int sindex,int eindex,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i =sindex;i<eindex+1;i++){
            if(target==arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
