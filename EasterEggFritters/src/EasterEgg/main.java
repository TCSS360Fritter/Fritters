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
		println("Yunhang Jiang,");
		println("Chenwei qiu,");
		println("Xufang guo,");
		println("Tzu-Chien Lu,");
		println("Isaiah Forward.");
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