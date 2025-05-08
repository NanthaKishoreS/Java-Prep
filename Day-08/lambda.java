package package_one;

interface a{
	void disp();
}

public class MainClass {
	public static void main(String[]args) {
		a a1 = new a() {
			public void disp() {
				System.out.println("Hello World");
			}
		};
		a1.disp();
	}
}


