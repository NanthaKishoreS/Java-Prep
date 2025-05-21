package practice_java;
import java.io.FileWriter;
public class MainClass {
	public static void main(String[]args) {
		try{
			FileWriter fw = new FileWriter("Sample.txt",true);
			fw.append("Hello World");
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
