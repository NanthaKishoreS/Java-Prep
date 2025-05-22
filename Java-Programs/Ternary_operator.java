import java.util.Scanner;

class Demo{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		String rain = scan.nextLine();
		System.out.println(rain.equalsIgnoreCase("Yes")?"Take an Umbrella !!":"enjoy the Sunlight !!!");
	}
}