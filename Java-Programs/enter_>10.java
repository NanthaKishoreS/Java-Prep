import java.util.Scanner;

class Demo{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int num = 0;
		do{
			System.out.println("Enter A Number Greater Than 10 !! :");
			num = scan.nextInt();
		}while(num<10);
		
		scan.close();
	}
}