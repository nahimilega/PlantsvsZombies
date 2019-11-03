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
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
 
public class MyController implements Initializable {
 
	
   @FXML
   private AnchorPane mainPane;
   @FXML
   private Button loadGameButton;
   @FXML
   private Button exitButton;
   @FXML
   private Button showInstructionsbutton;
   @FXML
   private Button startGameButton;
   
   @FXML
   private Button backButton;
   
   @FXML
   private Button backtomenuButton;
   
   @FXML
   private Image background;
   
   
  
   @Override
   public void initialize(URL location, ResourceBundle resources) {
 
       // TODO (don't really need to do anything here).
      
   }
 
   // When user click on myButton
   // this method will be called.
   public void startGame(ActionEvent event) throws IOException {
	   AnchorPane pane = FXMLLoader.load(getClass().getResource("/application/EnterName.fxml"));
	   mainPane.getChildren().setAll(pane);

   }
   
   public void quitGame(ActionEvent event) {
	   System.exit(0);
	   
   }
   public void loadGamechosen(ActionEvent event) throws IOException {
       AnchorPane pane = FXMLLoader.load(getClass().getResource("/application/loadOption.fxml"));
       mainPane.getChildren().setAll(pane);

   }
   public void showInstructions(ActionEvent event) throws IOException {
	   AnchorPane pane = FXMLLoader.load(getClass().getResource("/application/Instruction.fxml"));
	   mainPane.getChildren().setAll(pane);
	   
   }
  
	   
   
}