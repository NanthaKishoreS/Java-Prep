//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,54,233,65,2653,236};
        System.out.println(findNumbers(arr));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }

    static boolean even(int i) {
        int count = 0 ;
        while(i>0){
            count++;
            i = i/10;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }
}
