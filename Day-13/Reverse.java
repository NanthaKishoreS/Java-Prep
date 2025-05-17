import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        //Print the Reverse of the Input Number
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number That is to  be Reversed : ");
        int num = scan.nextInt();
        int reverse = 0;
        int mul = 1;
        while(num>0){
            int rem = num % 10;
            reverse = reverse*10 + rem;
            num = num/10;
        }
        System.out.println(reverse);
    }
}
