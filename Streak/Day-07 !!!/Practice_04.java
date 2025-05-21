package package_one;

abstract class  Vehicle{
	abstract void drive();
	final void startEngine() {
		System.out.println("Engine Started !!");
	}
	static String getVehicleType() {
		return "Generic Vehicle";
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Driven With Streering Wheel");
	}
	
}
class Motorcycle extends Vehicle{
	void drive() {
		System.out.println("Driven With HandleBar");		
	}
	
}

public class MainClass {
	public static void main(String[]args) {
		Car c1 = new Car();
		c1.startEngine();
		System.out.println(Vehicle.getVehicleType());	
			
	}
}


