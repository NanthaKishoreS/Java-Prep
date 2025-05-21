package practice_java;
import java.io.FileReader;
public class MainClass01 {
	public static void main(String[]args) {
		try{
			FileReader fr = new FileReader("Sample.txt");
			int c = fr.read();
			System.out.println((char)c);
			fr.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}

package practice_java;
import java.io.FileReader;
public class MainClass01 {
	public static void main(String[]args) {
		try{
			FileReader fr = new FileReader("Sample.txt");
			int c = fr.read();
			while(c !=-1) {
				System.out.println((char)c);
				c = fr.read();
			}
			fr.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
//BufferedReader
package practice_java;
import java.io.FileReader;
import java.io.BufferedReader;
public class MainClass01 {
	public static void main(String[]args) {
		try{
			FileReader fr = new FileReader("Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			br.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}

package practice_java;
import java.io.FileReader;
import java.io.BufferedReader;
public class MainClass01 {
	public static void main(String[]args) {
		try{
			FileReader fr = new FileReader("Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line!=null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
