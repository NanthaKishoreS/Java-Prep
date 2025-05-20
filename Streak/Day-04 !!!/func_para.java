class Store{
	int soaprate,chocorate,total;
	void getsoap(int money){
		soaprate = money;
		System.out.println(money);
		System.out.println("The Soap Is Purchased !!!");
	}

	void chocolate(int money){
		chocorate = money;
		System.out.println(money);
		System.out.println("The Chocolate is Purchased !!!");
	}
	void total(){
		total = soaprate+chocorate;
		System.out.println("The Total Amount is :  "+total);		
	}
	public static void main(String []args){
		Store s  = new Store();
		s.getsoap(20);
		s.chocolate(40);
		s.total();
	}
}