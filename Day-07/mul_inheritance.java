package package_one;

interface printable{
	void display();
}
interface showable{
	void display();	
}
class c implements printable,showable{
	public void display() {
		System.out.println("Class C");
	}
}

public class MainClass {
	public static void main(String[]args) {
		c c1 =new c();
		c1.display();
			
	}
}


