package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class Main extends Application {
    

    @Override
    public void start(Stage primaryStage) {
        try {
         
            
        	FXMLLoader fx = new FXMLLoader(getClass().getResource("/application/MyScene.fxml"));
        	Parent root = (Parent) fx.load();
            primaryStage.setTitle("Plant vs Zombies - By Aanchal and Archit");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
         
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}