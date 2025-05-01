mport java.util.Scanner;

class Demo{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();

	if(num%3==0 && num%5==0){
		System.out.println("It is Divisible By 3 and 5");
	}
	else{
		System.out.println("It is not Divisible by 3 and 5");
	}
	}
}