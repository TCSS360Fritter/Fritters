package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Stage myPrimaryStage;
	
	private static BorderPane myPane;
	
	private int myWidth;
	
	private int myHeight;
	
//	private RadioButton myEvent1;
//	
//	private RadioButton myEvent2;
//
//	private RadioButton myEvent3;
//	
//	private RadioButton myEvent4;
//	
//	private RadioButton myEvent5;
	
	public static int myEvent1Count;
	
	public static int myEvent2Count;
	
	public static int myEvent3Count;
	
	public static int myEvent4Count;
	
	public static int myEvent5Count;
	
	
	public static void main(String[] args) {
		launch(args);
		
	}

	/**
	 * Initialize
	 */
	public void init() {
		myWidth = 700;
		myHeight = 700;
		myEvent1Count = 0;
		myEvent2Count = 0;
		myEvent3Count = 0;
		myEvent4Count = 0;
		myEvent5Count = 0;
		
	}
	
	@Override
	public void start(Stage thePrimaryStage) throws IOException {
		myPrimaryStage = thePrimaryStage;
		myPrimaryStage.setTitle("Vote");
		showMainView();
		
	}

	/**
	 * Show main view
	 * @throws IOException 
	 */
	private void showMainView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/VoteView.fxml"));
		
		myPane = loader.load();
		Scene scene = new Scene(myPane);
		myPrimaryStage.setScene(scene);
		myPrimaryStage.show();
		
	}
	
	/**
	 * Show item view
	 * 
	 * @throws IOException
	 */
	public static void showResultView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/ResultView.fxml"));
		
//		BorderPane bp = loader.load();
//		myPane.setCenter(bp);
		
		myPane = loader.load();
		Scene scene = new Scene(myPane);
		myPrimaryStage.setScene(scene);
		myPrimaryStage.show();
	}
	
	
	
	
	public static void showMain() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/VoteView.fxml"));
		
		myPane = loader.load();
		Scene scene = new Scene(myPane);
		myPrimaryStage.setScene(scene);
		myPrimaryStage.show();
	}
	
	
	public static void count1() {
		++myEvent1Count;
		printVote();
	}
	
	public static void count2() {
		++myEvent2Count;
		printVote();
	}
	
	public static void count3() {
		++myEvent3Count;
		printVote();
	}
	
	public static void count4() {
		++myEvent4Count;
		printVote();
	}
	
	public static void count5() {
		++myEvent5Count;
		printVote();
	}
	
	private static void printVote() {
		System.out.println("BBQ = " + myEvent1Count + ", Camping = " + myEvent2Count 
				+ ", Swimming = " + myEvent3Count + ", Dancing = " + myEvent4Count 
				+ ", Study Group = " + myEvent5Count);
		
			
	}
	
	
	/**
	 * Set width
	 * 
	 * @param theWidth
	 */
	public void setWidth(int theWidth) {
		myWidth = theWidth;
	}
	
	/**
	 * Set height
	 * 
	 * @param theHeight
	 */
	public void setHeight(int theHeight) {
		myHeight = theHeight;
	}
	
}
