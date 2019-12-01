package application;

import java.io.IOException;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



// To enter backyard name
public class MyController3 implements Initializable {
	
	@FXML
	   private AnchorPane start;
	

	@FXML
	   private Button backButton1;
	
	@FXML
	   private Button startButton;
	
	@FXML
	private TextField nameText;
	
	
	@Override
	   public void initialize(URL location, ResourceBundle resources) {
	 
	       // TODO (don't really need to do anything here).
	      
	   }
	
	public void backFromStart(ActionEvent event) throws IOException {
		   AnchorPane pane = FXMLLoader.load(getClass().getResource("/application/MyScene.fxml"));
		   start.getChildren().setAll(pane);
	}
	public void startGame(ActionEvent event) throws IOException {
			
		String name = nameText.getText();
		   
		Stage stage = (Stage) start.getScene().getWindow();
		int level = 1;
		
		
		try {
			Main2 s=new Main2(level,name);
			s.start(stage);
			
		} catch (Exception e) {
			
			level++;
		}
		
		
		
	}
	
	
}


 