//Even or odd using functions
import java.util.Scanner;
class Find{
	int input(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		return n;
		
	}
	
	
	String evenorodd(int num){
		if(num%2==0){
			return "Yes";
		}
		else{
			return "No";
		}
	}
	public static void main(String []args){
		Find f = new Find();
		String Result = f.evenorodd(f.input());
		System.out.println(Result);
	}
}