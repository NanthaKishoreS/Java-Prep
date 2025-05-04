class Sum{
	int result,a1,b1;
	void add(int a,int b){
		a1 = a;
		b1 = b;
		System.out.println(a1);
		System.out.println(b1);
		result = a+b;
		System.out.println(result);
	}
	public static void main(String []args){
		Sum s1 = new Sum();
		s1.add(12, 23);	
	}
}