package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class Main extends Application {
    
  //hello
    @Override
    public void start(Stage primaryStage) {
        try {
            // Read file fxml and draw interface.
            
        	FXMLLoader fx = new FXMLLoader(getClass().getResource("/application/MyScene.fxml"));
        	Parent root = (Parent) fx.load();
        	

            //((MyController4) fx.getController()).setStage(primaryStage);
            primaryStage.setTitle("My Application");
            //primaryStage.setScene(new Scene(root2));
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