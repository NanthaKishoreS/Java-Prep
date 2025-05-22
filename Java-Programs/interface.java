package package_one;

interface Playable{
	void play();
	
}
class Guitar implements Playable{

	@Override
	public void play() {
		System.out.println("Playing Guitar");
		
	}
	
}
class Piano implements Playable{

	@Override
	public void play() {
		System.out.println("Playing Piano");
		
	}
	
}
public class MainClass {
	public static void main(String[]args) {
		Guitar g1 = new Guitar();
		g1.play();
		Piano p1 = new Piano();
		p1.play();
			
	}
}


