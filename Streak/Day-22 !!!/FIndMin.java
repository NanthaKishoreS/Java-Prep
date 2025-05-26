package Search;

public class FindMIn {
    public static void main(String[] args) {
        int[] arr= {23,76,243,78,46,964,376,94,8531,456};
        int result = Min(arr);
        System.out.println("The Minimun Number in the Array is "+result);

    }
    static int Min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
