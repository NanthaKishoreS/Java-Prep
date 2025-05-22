package Functions;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Num :");
        int num = scan.nextInt();
        System.out.println(isprime(num));
    }
    static boolean isprime(int num){
        int c = 2;
        while(c<num){
            if(num%c==0){
                return false;
            }
            c=c+1;
        }
        return true;
    }
}
