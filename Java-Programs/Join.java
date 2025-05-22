package practice_java;
class A extends Thread{
	int j = 0;
	public void run() {
		j=50;		
	}
}

public class MainClass01 {
	public static void main(String[]args) {
		A a1 = new A();
		a1.start();
		try {
			a1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(a1.j);
		
	}

}
