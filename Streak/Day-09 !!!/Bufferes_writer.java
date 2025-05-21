package practice_java;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class MainClass {
	public static void main(String[]args) {
		try{
			FileWriter fw = new FileWriter("Sample.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Heyy Mann");
			bw.newLine();
			bw.write("How are you !!?");
			bw.close();
			System.out.println("File Modified");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
