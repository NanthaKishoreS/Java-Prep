package package_one;
import java.util.Scanner;

class NotValidException extends Exception{
	NotValidException(String s){
		super(s);
	}
}

public class MainClass {
	public static void main(String[]args) {
		int age = 0;
		Scanner scan = new Scanner(System.in);
		try {
			age = scan.nextInt();
			if(age<18) {
				throw new NotValidException("The Age Should Be Above 18 !!");				
			}
			
		}
		catch(NotValidException e) {
			System.out.println(e);
		}
		
		
		
	}
}


