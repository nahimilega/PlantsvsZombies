package application;

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
   
  
   @Override
   public void initialize(URL location, ResourceBundle resources) {
 
       // TODO (don't really need to do anything here).
      
   }
 
   // When user click on myButton
   // this method will be called.
   public void startGame(ActionEvent event) {
       System.out.println("Button Clicked!");

   }
   
   public void quitGame(ActionEvent event) {
	   /*
	    * Called when the exit button is pressed in the main menu
	    * Exits from the program
	    */
	   System.exit(0);
	   
   }
   public void loadGamechosen(ActionEvent event) {
	   /*
	    * Called when the load game button is pressed
	    * 
	    */
       Parent root = FXMLLoader.load(getClass()
               .getResource("/application/MyScene.fxml"));
	   System.out.println("Button Clicked!");
	   
   }
   public void showInstructions(ActionEvent event) {
	   
	   System.out.println("Button Clicked!");
	   
   }
  
}