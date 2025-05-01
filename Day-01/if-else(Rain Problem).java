import java.util.Scanner;

class Demo{
	public static void main(String [] args){
		Scanner a = new Scanner(System.in);
		System.out.println("Is it Raining ?!");
		String user = a.nextLine();
		boolean rain = user.equalsIgnoreCase("yes");
		if(rain){
			System.out.println("Take An Umbrella !!");
		}
		if(rain){
			System.out.println("Enjoy the Sunlight");
		}
		else{
			System.out.print("Kindly Enter Yes or No !!!");
		}
	}	
}