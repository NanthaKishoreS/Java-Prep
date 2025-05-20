import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Enter Any valid Operator To Perform Calculations Or Enter 'X' to Exit : ");
            char op = scan.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter the First For Performing the Operation : ");
                int num1 = scan.nextInt();
                System.out.print("Enter the Second For Performing the Operation : ");
                int num2 = scan.nextInt();
                int ans = 0;
                if(op == '+'){
                    ans = num1+num2;
                    System.out.println("The Answer is : " +ans);
                } else if (op == '-') {
                    ans = num1-num2;
                    System.out.println("The Answer is : " +ans);
                }else if (op == '*') {
                    ans = num1*num2;
                    System.out.println("The Answer is : " +ans);
                }else if (op == '/') {
                    if(num2!=0){
                        ans = num1/num2;
                        System.out.println("The Answer is : " +ans);
                    }
                    else{
                        System.out.println("Division By Zero Error !!!");
                    }
                }else if (op == '%') {
                    ans = num1%num2;
                    System.out.println("The Answer is : " +ans);
                }
            } else if (op == 'X' || op == 'x'){
                System.out.println("Calculator Ended ");
                break;
            }
            else{
                System.out.println("Enter Valid Operator Or 'X' to Exit !!!");
            }
        }
    }
}



/*Ouput
Enter the First For Performing the Operation : 12
Enter the Second For Performing the Operation : 0
Division By Zero Error !!!
Enter Any valid Operator To Perform Calculations Or Enter 'X' to Exit : -
Enter the First For Performing the Operation : 12
Enter the Second For Performing the Operation : 2
The Answer is : 10
Enter Any valid Operator To Perform Calculations Or Enter 'X' to Exit : x

Process finished with exit code 0*/