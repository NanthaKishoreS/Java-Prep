package practice_java;

class a extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello Hi...");		
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

class b extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Okay bye...");	
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MainClass01 {
	public static void main(String[]args) {
		a a1 = new a();
		b b1 = new b();
		b1.setPriority(10);
		a1.setPriority(2);
		a1.start();
		b1.start();
		
	}

}
