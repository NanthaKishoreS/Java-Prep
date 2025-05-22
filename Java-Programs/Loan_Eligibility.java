import java.util.Scanner;

class Demo{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int a = scan.nextInt();
		int loan = scan.nextInt();

		if(s>20000 || a<25){
			if(loan<50000){
				System.out.println("You are eligible to get the loan");
			}
			else{
				System.out.println("The Maximum Loat Amount is 50000");
			}
		}
		else{
			System.out.println("You are Not Elgible to get Loan");
		}
	}
}