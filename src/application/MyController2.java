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
public class MyController2 implements Initializable {
	
	@FXML
	   private AnchorPane mainPane2;
	
	
	
	
	@Override
	   public void initialize(URL location, ResourceBundle resources) {
	 
	       // TODO (don't really need to do anything here).
	      
	   }
	
	public void backtoMainMenu(ActionEvent event) throws IOException {
		   AnchorPane pane = FXMLLoader.load(getClass().getResource("/application/MyScene.fxml"));
		   mainPane2.getChildren().setAll(pane);
	}
	
}