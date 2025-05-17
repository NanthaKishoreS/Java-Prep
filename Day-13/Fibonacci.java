import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Value Of n : ");
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        for(int i=0;i<n;i++){
            System.out.println(a);
            int value = a + b;
            a = b;
            b = value;
        }
    }
}
