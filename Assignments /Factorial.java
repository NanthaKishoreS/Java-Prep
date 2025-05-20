import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num = factorial(n);
        System.out.println(num);
    }
    static int factorial(int n){
        if(n == 1||n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
