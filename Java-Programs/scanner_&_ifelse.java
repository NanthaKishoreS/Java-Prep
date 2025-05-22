import java.util.Scanner;

class Demo{
	public static void main(String []args){
		call();
	}
	public static void call(){
		Scanner scan = new Scanner(System.in);
		String RCB = scan.nextLine();

		if(RCB.equalsIgnoreCase("win"))
		{
			System.out.println("Ee sala cup Namde !!");
		}
		else if(RCB.equalsIgnoreCase("loose"))
		{
			System.out.println("cup illa!!");
		}
		else{
			System.out.println("Enter Win Or Loose !!!");
			call();
		}
	}
}