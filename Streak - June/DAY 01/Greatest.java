import java.util.Scanner;
public class D1Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Value for A :");
        int a = scan.nextInt();
        System.out.print("Enter Value for B :");
        int b = scan.nextInt();
        System.out.print("Enter Value for C :");
        int c = scan.nextInt();
        find(a,b,c);
    }
    static void find(int a,int b,int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("A is the Greatest number !!!");
            } else {
                System.out.println("C is the Greatest Number !!!");
            }
        } else {
            if (b > c) {
                System.out.println("B is the Greatest Number !!!");
            } else {
                System.out.println("C is the Greatest Number !!!");
            }
        }
    }
}
