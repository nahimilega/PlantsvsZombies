package application;

import java.util.ArrayList;

import application.Zombies.Zombie;
import application.Zombies.normalZombie;
import application.Zombies.trafficZombie;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import javafx.scene.control.Button;
import javafx.scene.layout.*;




public class Main2 extends Application {

	public Row rows[];

	public int sunToken;

	int level;

	public Main2(int level) {
		super();
		sunToken = 50;
		this.level = level;
		rows = new Row[5];

	}


	public int getRowNo(double yCoordinate) {
		/*
		 * Returns the row no corrosponding to the following y coordinate
		 */
		if( yCoordinate >= 120 &&  yCoordinate <= 249) {
			return 0;
		}
		else if( yCoordinate >= 249 &&  yCoordinate <= 381) {
			return 1;
		}

		else if( yCoordinate >= 381 &&  yCoordinate <= 512) {
			return 2;
		}

		else if( yCoordinate >= 512 &&  yCoordinate <= 640) {
			return 3;
		}

		else if( yCoordinate >= 640 &&  yCoordinate <= 763) {
			return 4;
		}

		return -1;
	}

	public double getBlockNo(double xCoordinate) {
		/*
		 * Returns the x coordinate of block no corrosponding to the following x coordinate
		 */

		if( xCoordinate >= 333 &&  xCoordinate <= 443) {
			return 347;
		}
		if( xCoordinate >= 443 &&  xCoordinate <= 536) {
			return 457;
		}

		if( xCoordinate >= 536 &&  xCoordinate <= 646) {
			return 549;
		}

		if( xCoordinate >= 646 &&  xCoordinate <= 752) {
			return 659;
		}

		if( xCoordinate >= 752 &&  xCoordinate <= 860) {
			return 769;
		}
		if( xCoordinate >= 860 &&  xCoordinate <= 970) {
			return 879;
		}
		if( xCoordinate >= 970 &&  xCoordinate <= 1066) {
			return 988;
		}
		if( xCoordinate >= 1066 &&  xCoordinate <= 1169) {
			return 1079;
		}
		if( xCoordinate >= 1169 &&  xCoordinate <= 1306) {
			return 1190;
		}


		return -1;

	}


	public void makeBuyMeny(BorderPane root) {

        Image image1 = new Image("/application/resources/bomb.png",80,90,false,false);
        Image image2 = new Image("/application/resources/peaShooter.png",80,90,false,false);
        Image image3 = new Image("/application/resources/sunFlower.png",80,90,false,false);
        Image image4 = new Image("/application/resources/wallnut.png",80,90,false,false);

        ImageView imageView1 = new ImageView(image1);
        imageView1.setX(280);
        imageView1.setY(10);
        ImageView imageView2 = new ImageView(image2);
        imageView2.setX(190);
        imageView2.setY(10);
        ImageView imageView3 = new ImageView(image3);
        imageView3.setX(100);
        imageView3.setY(10);
        ImageView imageView4 = new ImageView(image4);
        imageView4.setX(370);
        imageView4.setY(10);

        //ImageView allplantOption[] = new ImageView[4];



        ArrayList<ImageView> allplantOption = new ArrayList<ImageView>();
        allplantOption.add(imageView2);
        allplantOption.add(imageView3);

        if( this.level>1) {
        	//Wallnut bomb is activated
        	allplantOption.add(imageView4);
        }
        if( this.level>2) {
        	//Cherry bomb is activated
        	allplantOption.add(imageView1);
        }

        // To set the mouse event to plant plant

        for (int i = 0; i < allplantOption.size(); i++) {
			final int plantType = i;
        	allplantOption.get(i).setOnMouseReleased(new EventHandler<MouseEvent>() {


          	  @Override
          	  public void handle(MouseEvent mouseEvent) {

          		  /// Testing part
          		  System.out.println("YCoordinate");
	        	    System.out.println(mouseEvent.getY());
	        	    System.out.println(mouseEvent.getX());
	        	    /// Testing part end

	        	    int rowNo = getRowNo(mouseEvent.getY());
	        	    double blockCoordinate = getBlockNo(mouseEvent.getX());
	        	    if (rowNo != -1 && blockCoordinate != -1)
	        	    	rows[rowNo].plantPlant(plantType, blockCoordinate);
      	  }
      	});

        	root.getChildren().add(allplantOption.get(i));
		}

	}






	public void allocateZombie() {


		/*
		 * Level 1 10 Normal zombie
		 * Level 2 8 Normal 3 Traffic
		 * Level 3 8 Normal 5 Traffic
		 * Level 4 10 Normal 8 Traffic
		 * Level 5 11 Normal 10 Traffic
		 */


		int normalZombie=0;
		int trafficZombie=0;
		if( this.level == 1) {
			normalZombie = 10;
		}
		else if( this.level == 2) {
			normalZombie = 8;
			trafficZombie = 3;
		}
		else if(this.level == 3) {
			normalZombie = 8;
			trafficZombie = 5;
		}
		else if( this.level == 4) {
			normalZombie = 10;
			trafficZombie = 8;
		}
		else if( this.level == 5) {
			normalZombie = 11;
			trafficZombie = 10;
		}


		for (int j = 0; j < 5; j++) {



			ArrayList<Zombie> passiveZombies = new ArrayList<Zombie>();
			for (int i = 0; i < normalZombie ; i++) {
				passiveZombies.add(new normalZombie());
			}

			for (int i = 0; i < trafficZombie ; i++) {
				passiveZombies.add(new trafficZombie());
			}


			System.out.println(passiveZombies.size());
			rows[j].setPassivearray(passiveZombies);

		}

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


	        Timeline gameLoop = new Timeline();
	        gameLoop.setCycleCount( Timeline.INDEFINITE );

	        final long timeStart = System.currentTimeMillis();


	        rows[0] = new Row(gc, 140, timeStart);
	        rows[1] = new Row(gc, 260, timeStart);
	        rows[2] = new Row(gc, 400, timeStart);
	        rows[3] = new Row(gc, 525, timeStart);
	        rows[4] = new Row(gc, 661, timeStart);

	        allocateZombie();
	        AnchorPane sunPane = new AnchorPane();
			for (int i = 0; i < rows.length; i++) {
				rows[i].setpane(sunPane);
			}

	        // create a button

	        // create a tile pane

	        // create a popup

	        Button button2 = new Button("Save Game");
	        button2.setTranslateX(1200);
	        button2.setTranslateY(15);
	        Button button3 = new Button("Exit");
	        button3.setTranslateX(1300);
	        button3.setTranslateY(15);


	        AnchorPane tilepane = new AnchorPane();


	        tilepane.getChildren().add(button3);
	        tilepane.getChildren().add(button2);


	        // create a scene
	        Label label = new Label("My LBL");
	        tilepane.getChildren().add(label);
	        root.getChildren().add(tilepane);
	        label.setTranslateY(78);
	        label.setTranslateX(34);
	        label.setFont(new Font("ArialBold", 25));

	        //theStage.setScene(scene1);


	        root.getChildren().add( sunPane );

	        // This is the buy plant menu

	        this.makeBuyMeny(root);

	     // Buy menu ends here




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
	                    double time = 180 - t;
	                    gc.setFont(new Font("Arial", 30));


	                    gc.setStroke(Color.BLACK);
	                    gc.strokeText("Time left: "+Integer.toString((int) time), 900, 30);
	                    label.setText(Integer.toString(sunToken));
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

	public static void main(String[] args) {
		launch(args);
	}


}








