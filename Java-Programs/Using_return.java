class Demo{
	int rem;
	int Sub(int a,int b){
		rem = a- b;
		return rem;
	}

	public static void main(String []args){
		Demo d = new Demo();
		int rem = d.Sub(23, 17);
		System.out.println(rem);
	}
}
//Get name using return
class Demo{
	String getname(String s1){
		return s1;
	}
	public static void main(String []args){
		Demo d = new Demo();
		String name = d.getname("Nantha Kishore S");
		System.out.println(name);
	}
}