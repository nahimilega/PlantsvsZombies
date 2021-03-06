package application;

import java.io.*;
import java.io.IOException;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class MyController2 implements Initializable {
	
	@FXML
	   private AnchorPane mainPane2;

	
	@Override
	   public void initialize(URL location, ResourceBundle resources) {
	 
	       // TODO (don't really need to do anything here).
		
		File folder = new File("SavedGames");
		File[] listOfFiles = folder.listFiles();

		ArrayList<Button> allButton = new ArrayList<Button>();
		
		
		int Ycor = 93;
		
		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    String name = listOfFiles[i].getName();
		    Button b = new Button(name);
		    b.setTranslateX(77);
		    b.setTranslateY(Ycor);
		    Ycor += 50;
		    b.setOnAction(new EventHandler<ActionEvent>() {

          	  @Override
          	  public void handle(ActionEvent e) {
          		  loadFile(b.getText());
          		  
      	  }
      	});
		    
		    allButton.add(b);
		  }
		}
		
		mainPane2.getChildren().addAll(allButton);
	
	      
	   }
	

	
	public void loadFile(String name) {
		
		
		Stage stage = (Stage) mainPane2.getScene().getWindow();
		
		Main2 s;
		ObjectInputStream in =null;

		
		String filename = "SavedGames/"+name;
		
		try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            s = (Main2)in.readObject(); 
            file.close(); 
            in.close(); 
            try {
				s.start(stage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  
        } 
          
        catch(IOException ex) 
        { 
        	
            System.out.println("IOException is caught"); 
            System.out.println("User name not found");
        }
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        }
		
	}
	
	public void backtoMainMenu(ActionEvent event) throws IOException {
		   AnchorPane pane = FXMLLoader.load(getClass().getResource("/application/MyScene.fxml"));
		   mainPane2.getChildren().setAll(pane);
	}
	
}