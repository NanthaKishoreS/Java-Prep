package package_one;

class Person{
	public String name;
	protected int age;
	private int socialSecurityNumber;
	String Address;
	
	
	
	Person(String name,int age,int socialSecurityNumber ,String Address){
		this.name = name;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
		this.Address = Address;
	}
	
	public void Display() {
		System.out.println(socialSecurityNumber);
				
	}
}

class Employee extends Person{
	Employee(String name,int age,int socialSecurityNumber ,String Address){
		super(name,age,socialSecurityNumber,Address);
		System.out.println("Hello Employee");
	}
	
}

public class MainClass {
	public static void main(String[]args) {
		Employee e1 = new Employee("Nantha Kishore S",18,1283,"Ramapuram");
		System.out.println(e1.name);
		System.out.println(e1.age);
		e1.Display();
		System.out.println(e1.Address);
	}
}
