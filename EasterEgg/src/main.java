package EasterEgg;

/**
 * This is for team Fritters EasterEgg project
 * @author Yunhang
 */
public class main {
	/**
	 * Here is the main calss to make sure print our team name and members name
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		header();
		print("Yunhang Jiang,");
		print("Chenwei qiu,");
		print("Xufang guo,");
		print("Tzu-Chien Lu,");
		print("Isaiah Forward.");
	}
	
	/**
	 * This is the method to print everyone's name
	 */
	public void print(String theS) {
		System.out.print(" " + theS);
	}

	/**
	 * This is the method to print header information
	 */
	public void header() {
		System.out.println("We are team Fritters... We are...");
	}
}
