package package_one;

class Counter{
	static int count;
	int instanceNumber;
	
	Counter(){
		count++;
		instanceNumber++;
	}
	public void print() {
		System.out.println(count);
		System.out.println(instanceNumber);
	}
}

public class MainClass {
	public static void main(String[]args) {
		Counter c1 = new Counter();
		c1.print();
		Counter c2 = new Counter();
		c2.print();
		Counter c3 = new Counter();
		c3.print();
		
	}
}


