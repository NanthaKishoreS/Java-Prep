package package_one;
import java.util.Scanner;



public class MainClass {
	public static void main(String[]args) {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		try {
			a = scan.nextInt();
			b = scan.nextInt();
			c = a/b;
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Hi I am Finally !!!");
		}
		
		
		
	}
}


