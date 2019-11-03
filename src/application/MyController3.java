package application;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
public class MyController3 implements Initializable {
	
	@FXML
	   private AnchorPane start;
	

	@FXML
	   private Button backButton1;
	
	@FXML
	   private Button startButton;
	
	
	
	@Override
	   public void initialize(URL location, ResourceBundle resources) {
	 
	       // TODO (don't really need to do anything here).
	      
	   }
	
	public void backFromStart(ActionEvent event) throws IOException {
		   AnchorPane pane = FXMLLoader.load(getClass().getResource("/application/MyScene.fxml"));
		   start.getChildren().setAll(pane);
	}
	public void startGame(ActionEvent event) throws IOException {
		   AnchorPane pane = FXMLLoader.load(getClass().getResource("/application/LevelOption.fxml"));
		   start.getChildren().setAll(pane);
	}
	
	
}


 