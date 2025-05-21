package practice_java;
import java.util.Scanner;

public class DivisionExample {
	int Result = 0;
	public void divideNumbers(int num,int dem) {
		try {
			Result = num/dem;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println(Result);
		}
	}
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int dem = scan.nextInt();
		DivisionExample d1 = new DivisionExample();
		d1.divideNumbers(num,dem);
	}

}
