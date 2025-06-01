import java.util.Scanner;
public class D1Q2 {
    public static void main(String[] args) {
        System.out.print("Enter a Number to Find the Factorial : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(factorial(num));
    }
    static int factorial(int num) {
        int product = 1;
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        return product;
    }
}
