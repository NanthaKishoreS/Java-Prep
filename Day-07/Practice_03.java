package package_one;

abstract class Animal{
	String name;
	Animal(String name){
		this.name = name;
	}
	abstract void makeSound();
}


class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	void makesound() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal{
	Cat(String name){
		super(name);
	}
	void makeSound() {
		System.out.println("Meow");
	}
}

public class MainClass {
	public static void main(String[]args) {
		Dog d1 = new Dog("Jackie");
		System.out.println(d1.name);
		d1.makesound();
		Cat c1 = new Cat("Kutty");
		System.out.println(c1.name);
		c1.makeSound();
	}
}


