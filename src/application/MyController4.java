package application;


import javafx.application.Application;


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
import javafx.stage.Stage;


// Level selection
public class MyController4 implements Initializable {
	
	@FXML
	   private AnchorPane level;
	

	@FXML
	   private Button backButton1;
	
	@FXML
	   private Button startButton;
	
	Stage stage;
	
	
	public void setStage(Stage stage){
		this.stage=stage;
		}
	
	@Override
	   public void initialize(URL location, ResourceBundle resources) {
	 
	       // TODO (don't really need to do anything here).
	      
	   }
	
	public void level1Start(ActionEvent event) throws IOException {
		/*
		   AnchorPane pane = FXMLLoader.load(getClass().getResource("/application/MyScene.fxml"));
		   level.getChildren().setAll(pane);
		   */
		Stage stage = (Stage) level.getScene().getWindow();
		Main2 s=new Main2(1);
		s.start(stage);
		//this.level2Start(event);
		
	}
	
	
	public void level2Start(ActionEvent event) throws IOException {
		Stage stage = (Stage) level.getScene().getWindow();
		Main2 s=new Main2(2);
		s.start(stage);
		
		
	}
	
	public void level3Start(ActionEvent event) throws IOException {
		Stage stage = (Stage) level.getScene().getWindow();
		Main2 s=new Main2(3);
		s.start(stage);
	}
	public void level4Start(ActionEvent event) throws IOException {
		Stage stage = (Stage) level.getScene().getWindow();
		Main2 s=new Main2(4);
		s.start(stage);
	}
	
	public void level5Start(ActionEvent event) throws IOException {
		Stage stage = (Stage) level.getScene().getWindow();
		Main2 s=new Main2(5);
		s.start(stage);
	}


	
	
}


 