class Demo{
	int rem;
	int Sub(int a,int b){
		rem = a- b;
		return 100;
	}

	public static void main(String []args){
		Demo d = new Demo();
		int rem = d.Sub(23, 17);
		System.out.println(rem);
	}
}