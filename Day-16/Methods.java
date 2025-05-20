
import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        System.out.print("Enter You Name : ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        Greeting(name);
    }
    static void Greeting(String naam){
        System.out.println("Welcome Back "+naam);
    }
}
/*There is no Pass By Reference in java And There is only Pass By Value and the Value only passed in the function
To Explain it more ------> i am storing the String inside this variable called name and the name variable will be 
pointing to the String inside it , then we creating a function the parameter is also pointing to the same String 
as that of the Variable in the Main Function Did...
Therefore,When we try to change the String inside the function the naam Variable will be changed and not the variable
in the main Function..*/
