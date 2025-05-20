package practice_java;

class div{
	public void divide() throws Exception {
		int a = 10/0;
		System.out.println(a);
	}
}
public class MainClass {
	public static void main(String[]args) {
		div d1 = new div();
		try{
			d1.divide();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
