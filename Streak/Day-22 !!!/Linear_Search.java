package Search;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.print("Enter The Number Of Search in the Array : ");
        int num = scan.nextInt();
        int result = Linear(arr,num);
        if(result!=-1){
            System.out.println("The Element is present in the index : "+result);
        }
        else
            System.out.println("Element Not found !!");

    }
    static int Linear(int a[],int n){
        if(a.length ==0) return -1;
        for(int i = 0;i<a.length;i++){
            if (a[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
