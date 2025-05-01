import java.util.Scanner;

class Demo{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int marks1 = scan.nextInt();
		int marks2 = scan.nextInt();
		int marks3 = scan.nextInt();
		int marks4 = scan.nextInt();
		int marks5 = scan.nextInt();
		int Total = marks1+marks2+marks3+marks4+marks5;
		float avg = Total/5;
		System.out.println("the avg is  "+avg);
	}
}