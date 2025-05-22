package package_one;
class Student{
	static int marks = 0;
}
public class MainClass {
	public static void main(String[]args) {
		Student s1 = new Student();
		Student.marks= 45;
		Student s2 = new Student();
		Student.marks= 89;
		System.out.println(s1.marks);
		
	}
}
