class Animal{
	String Name;
	int Age;
	void makeSound() {
		System.out.println("Animal Makes Sound");
	}
};
class Dog extends Animal{
	String Breed;
	void makeSound() {
		System.out.println("Dog Barks");
	}
	void fetch() {
		System.out.println("Dog is Fetching ")
	}
};
public class MainClass {
	public static void main(String[]args) {
		Dog d1 = new Dog();
		d1.Name= "abc";
		d1.Age = 12;
		d1.makeSound();
		
	}
}
