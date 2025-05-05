public class Demo {
	int marks;
	String name;
	Demo(){
		marks = 10;
		name = "Nantha Kishore S";
	}
	Demo(int tm,String tn){
		marks = tm;
		name = tn;
	}
	public static void main(String[]args) {
		Demo d = new Demo(100,"NK");
		System.out.println(d.marks);
		System.out.println(d.name);
	}

}