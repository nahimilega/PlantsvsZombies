package application;
	
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;




import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.control.Label; 
import javafx.stage.Stage; 
import javafx.stage.Popup; 
  



public class Main2 extends Application {
	
	public Row rows[];

	public Main2() {
		// TODO Auto-generated constructor stub
		rows = new Row[5];
	}
	
	
	
	@Override
	public void start(Stage theStage) {
		try {
			BorderPane root = new BorderPane();
			root.setId("pane");
			
			
			
			
			Scene scene = new Scene(root,1400, 800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			theStage.setScene(scene);
			
			
			
			Canvas canvas = new Canvas( 1400, 800 );
	        root.getChildren().add( canvas );
	        
	        GraphicsContext gc = canvas.getGraphicsContext2D();
	        
	        //Image earth = new Image( "/application/Pea.png" );

	        
	        /*
	        AnimatedImage ufo = new AnimatedImage();
	        Image[] imageArray = new Image[2];
	        for (int i = 0; i < 2; i++)
	            imageArray[i] = new Image( "/application/"+ i + ".png",70, 70, false, false );
	        ufo.frames = imageArray;
	        ufo.duration = 0.50;
	        
	        */
	        
	        
	        Timeline gameLoop = new Timeline();
	        gameLoop.setCycleCount( Timeline.INDEFINITE );
	        
	        final long timeStart = System.currentTimeMillis();
	        
	        
	        
	        
	        
	        rows[0] = new Row(gc, 140, timeStart);
	        rows[1] = new Row(gc, 260, timeStart);
	        rows[2] = new Row(gc, 400, timeStart);
	        rows[3] = new Row(gc, 525, timeStart);
	        rows[4] = new Row(gc, 661, timeStart);
	        
	        
	        
	        
	        ///This is the menu bar vala part
	        
	        
	        //FileInputStream input = new FileInputStream("resources/images/iconmonstr-home-6-48.png");
	        Image image1 = new Image("/application/bomb.png",80,90,false,false);
	        Image image2 = new Image("/application/peaShooter.png",80,90,false,false);
	        Image image3 = new Image("/application/sunFlower.png",80,90,false,false);
	        Image image4 = new Image("/application/wallnut.png",80,90,false,false);
	        
	        ImageView imageView1 = new ImageView(image1);
	        imageView1.setX(270);
	        imageView1.setY(10);
	        ImageView imageView2 = new ImageView(image2);
	        imageView2.setX(190);
	        imageView2.setY(10);
	        ImageView imageView3 = new ImageView(image3);
	        imageView3.setX(100);
	        imageView3.setY(10);
	        ImageView imageView4 = new ImageView(image4);
	        imageView4.setX(360);
	        imageView4.setY(10);
	        
	        root.getChildren().add(imageView1);
	        root.getChildren().add(imageView2);
	        root.getChildren().add(imageView3);
	        root.getChildren().add(imageView4);


	        imageView1.setOnMouseReleased(new EventHandler<MouseEvent>() {
	        	  @Override public void handle(MouseEvent mouseEvent) {
	        		  
		        	    System.out.println(mouseEvent.getX());
		        	    //System.out.println(mouseEvent.getY());
		        	    //System.out.println(mouseEvent.getSceneX());
		        	    System.out.println(mouseEvent.getY());

	        	  }
	        	});
	        imageView2.setOnMouseReleased(new EventHandler<MouseEvent>() {
	        	  @Override public void handle(MouseEvent mouseEvent) {
	        		  
		        	    System.out.println(mouseEvent.getX());
		        	    //System.out.println(mouseEvent.getY());
		        	    //System.out.println(mouseEvent.getSceneX());
		        	    System.out.println(mouseEvent.getY());

	        	  }
	        	});
	        
	        
	        imageView3.setOnMouseReleased(new EventHandler<MouseEvent>() {
	        	  @Override public void handle(MouseEvent mouseEvent) {
	        		  
		        	    System.out.println(mouseEvent.getX());
		        	    //System.out.println(mouseEvent.getY());
		        	    //System.out.println(mouseEvent.getSceneX());
		        	    System.out.println(mouseEvent.getY());

	        	  }
	        	});
	        
	        
	        imageView4.setOnMouseReleased(new EventHandler<MouseEvent>() {
	        	  @Override public void handle(MouseEvent mouseEvent) {
	        		  
		        	    System.out.println(mouseEvent.getX());
		        	    //System.out.println(mouseEvent.getY());
		        	    //System.out.println(mouseEvent.getSceneX());
		        	    System.out.println(mouseEvent.getY());

	        	  }
	        	});
	        
	        //root.getChildren().add(menuBar);
	        
	        //Scene scene2 = new Scene(hbox, 200, 100);
	        
	        
	        
	        
	        
	        
	        
	        
	        // create a button 
	        Button button = new Button("Menu"); 
	        button.setLayoutX(1350);
	        button.setLayoutY(10);
	        // create a tile pane 
	  
	        // create a popup 
	        Popup popup = new Popup(); 
	        Button button2 = new Button("Save Game"); 
	        Button button3 = new Button("Back To main menu"); 
	        button3.setLayoutX(1350);
	        button3.setLayoutY(40);
	        AnchorPane root2 = new AnchorPane();
	        root2.getChildren().add(button2);
	        root2.getChildren().add(button3);
	        popup.getContent().add(root2); 
	        popup.setAutoHide(true); 
	  
	        // action event 
	        EventHandler<ActionEvent> event =  
	        new EventHandler<ActionEvent>() { 
	            public void handle(ActionEvent e) 
	            { 
	                if (!popup.isShowing()) 
	                    popup.show(theStage); 
	            } 
	        }; 
	  
	        // when button is pressed 
	        button.setOnAction(event); 
	        
	        AnchorPane tilepane = new AnchorPane(); 
	        
	        
	        tilepane.getChildren().add(button); 
	        
	        // create a scene 
	        
	        root.getChildren().add(tilepane);
	  
	        
	        //theStage.setScene(scene1); 
	        
	        
	        
	        
	        KeyFrame kf = new KeyFrame(
	            Duration.seconds(0.017),                // 60 FPS
	            new EventHandler<ActionEvent>()
	            {
	                public void handle(ActionEvent ae)
	                {
	                	
	                    double t = (System.currentTimeMillis() - timeStart) / 1000.0; 
	                                
	                    double x = (t*50)%512;
	                    double y = 232;
	                    
	                    // Clear the canvas
	                    gc.clearRect(0, 0, 1400,800);  
	                    // background image clears canvas
	                    
	                    int ans=0;
	                    
	                    for (int i = 0; i < rows.length; i++) {
							ans = rows[i].activate();
						}
	                    /*
	                    gc.drawImage( earth, x, y );
	                    gc.drawImage( ufo.getFrame(t), 450, 250 );
	                    */
	                	
	                	/*
	                	 * Remove all objects
	                	 * Activate all row 
	                	 * then show all content
	                	 */
	                }
	            });
	        
	        gameLoop.getKeyFrames().add( kf );
	        gameLoop.play();
	        
	        theStage.show();
	
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void something() {
		launch();
	}
}








