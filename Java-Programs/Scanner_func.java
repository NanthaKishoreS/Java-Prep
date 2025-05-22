import java.util.Scanner;
class Subraction{
	int a,b,result;
	public void getdetails(){
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
	}
	public void Sub(){
		result= a-b;
		System.out.println(result);
	}
	public static void main(String []args){
		Subraction s = new Subraction();
		s.getdetails();
		s.Sub();
	}
}