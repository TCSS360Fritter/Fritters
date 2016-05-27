/**
 * 
 */
package application.view;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

/**
 * @author zac
 *
 */
public class MainController {
	
//	private Main m;
	
	@FXML
	private RadioButton rb1;
	
	@FXML
	private RadioButton rb2;
	
	@FXML
	private RadioButton rb3;
	
	@FXML
	private RadioButton rb4;
	
	@FXML
	private RadioButton rb5;
	
	@FXML
	private Button b1;
	
	
	@FXML
	private void goResult() throws IOException {
		Main.showResultView();
	}

	@FXML
	private void goHome() throws IOException {
		Main.showMain();
	}
	
	@FXML
	private void count() throws IOException {
//		Main.countVote();
		
		if (rb1.isSelected()) Main.count1();
		
		else if (rb2.isSelected()) Main.count2();
		
		else if (rb3.isSelected()) Main.count3();
		
		else if (rb4.isSelected()) Main.count4();
		
		else if (rb5.isSelected()) Main.count5();
		
		Main.showResultView();

	}
	
}
