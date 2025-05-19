//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum();
    }
        static void sum(){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Number 1 :");
            int num1 = scan.nextInt();
            System.out.print("Enter Number 2 :");
            int num2 = scan.nextInt();
            int sum = num1+num2;
            System.out.println("The Sum is "+sum);
        }

}