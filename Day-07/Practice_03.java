package package_one;

abstract class Animal{
	abstract void makeSound();
}


class Dog extends Animal{
	void makesound() {
		System.out.println("Barking");
	}
}

class Cat extends Animal{
	void makeSound() {
		System.out.println("Meow");
	}
}

public class MainClass {
	public static void main(String[]args) {
		Dog d1 = new Dog();
		d1.makesound();
		Cat c1 = new Cat();
		c1.makeSound();
	}
}


