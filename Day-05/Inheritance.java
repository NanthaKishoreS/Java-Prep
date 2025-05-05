package practice_java;
class Dad{
	int money =1000;
}
class Son extends Dad{}

public class MainClass {
	

	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.money);
		

	}

}
