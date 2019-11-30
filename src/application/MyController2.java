package application;

import java.io.*;
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
public class MyController2 implements Initializable {
	
	@FXML
	   private AnchorPane mainPane2;
	
	
	
	@Override
	   public void initialize(URL location, ResourceBundle resources) {
	 
	       // TODO (don't really need to do anything here).
	      
	   }
	

	
	public void option1select(ActionEvent event) throws IOException {
		
		
		
		Stage stage = (Stage) mainPane2.getScene().getWindow();
		
		Main2 s;
		ObjectInputStream in =null;

		
		String filename = "test";
		
		try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            s = (Main2)in.readObject(); 
            file.close(); 
            in.close(); 
            s.start(stage);
          
            
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
		
		
		
		
		
		
		
		/*
		Main2 s=new Main2(1);
		s.start(stage);
		*/
	}
	
	public void backtoMainMenu(ActionEvent event) throws IOException {
		   AnchorPane pane = FXMLLoader.load(getClass().getResource("/application/MyScene.fxml"));
		   mainPane2.getChildren().setAll(pane);
	}
	
}