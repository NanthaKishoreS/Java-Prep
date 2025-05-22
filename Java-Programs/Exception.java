public class MainClass {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		try {
			int a = scan.nextInt();			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}

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
		
		
		
	}
}


