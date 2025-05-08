package package_one;
import java.util.Scanner;



public class MainClass {
	public static void main(String[]args) {
		int age;
		Scanner scan = new Scanner(System.in);
		try {
			age = scan.nextInt();
			if(age<1) {
				throw new ArithmeticException("Age Should be greater than 1"); 
			}
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}


