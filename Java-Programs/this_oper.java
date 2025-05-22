public class Teacher {
	String myname;
	Teacher(){
		System.out.println("The Constructor is Called !!");
	}
	void setdetails(String myname) {
		this.myname = myname;
	}

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setdetails("Nantha Kishore S");
		System.out.println(t.myname);
		
	}

}
