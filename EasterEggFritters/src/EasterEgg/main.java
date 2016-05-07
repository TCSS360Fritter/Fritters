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
	public static void print(String theS) {
		System.out.print(" " + theS);
	}

	/**
	 * This is the method to print header information
	 */
	public static void header() {
		System.out.print("We are team Fritters... We are...");
	}
}
