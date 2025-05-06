package package_one;
import package_two.Teacher2;

public class Student extends Teacher2 {
	public static void main(String[]args) {
		Student s = new Student();
		System.out.println(s.S);
	}
}
package package_two;

public class Teacher2 {
	protected int S  = 1000;

}
