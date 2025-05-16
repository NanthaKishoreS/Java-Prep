import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GPT_Calculator {
    public static void main(String[] args) {
        float ans = 0;
        Scanner scan = new Scanner(System.in);
        //get two Numbers as Input and one operator
        System.out.print("Enter The First Number For Performing the Calculations :");
        float num1 = scan.nextFloat();
        System.out.print("Enter The Second Number For Performing the Calculations : ");
        float num2 = scan.nextFloat();
        System.out.print("Enter An Operator For Performing Calculation ('+','-','*','/') :");
        String operator = scan.next();

        //Create an else if statement while checking the checking the user input
        if(operator.equals("+")){
            System.out.println("You are Willing to Perform Addition of two Numbers ");
            ans = num1+num2;
            System.out.println("The Answer is " + ans);
        } else if (operator.equals("-")) {
            System.out.println("You Have Chosen to Subtract two Numbers ");
            System.out.println("The Answer Is :"+ ((num1>num2)?num1-num2:num2-num1));
        } else if (operator.equals("*")) {
            System.out.println("You Have Chosen to Perform Multiplication Of two Numbers ");
            ans = num1*num2;
            System.out.println("The Answer is :" + ans);
        } else if (operator.equals("/")) {
            System.out.println("You have Chosen to Divide the Two Numbers");
            if(num1!=0 && num2!=0){
                ans = num1/num2;
                System.out.println("The Answer is :" + ans);
            }
            else{
                System.out.println("Division By Zero Error !!");
            }
        }
        else {
            System.out.println("Enter Valid Operator !!!");
        }
    }

}
