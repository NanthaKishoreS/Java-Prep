import java.util.Scanner;
class Find{
	double input(){
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();
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
	String evenorodd(double num){
		int intpart  = (int)num;
		if(intpart%2==0){
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