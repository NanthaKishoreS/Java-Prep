import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        char ch = scan.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("It is an Lower Case Letter !!");
        } else if (ch >='A' && ch <= 'Z') {
            System.out.println("It is A Upper Case Letter !!!");
        }
        else{
            System.out.println("Enter A Valid Letter !!!");
        }
    }
}
