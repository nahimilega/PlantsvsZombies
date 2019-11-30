package application.Plants;

import java.io.Serializable;

import application.GameElements;
import application.SpriteManager;
import javafx.scene.image.Image;



class shooter extends Plants implements Serializable{

	public shooter(String nameOfImage, int noOfImage, int sizeX , int sizeY) {

		super(0.25, nameOfImage,noOfImage,sizeX,sizeY,100);
		// TODO Auto-generated constructor stub
	}
	
	
}

public class shooterPlant extends shooter implements Serializable{


	public shooterPlant(int xCoordinate) {
		super("/application/resources/plants/shooterPlant",2,50,50);
		this.xCoordinate = xCoordinate;
		
	}	
	
	
	
}
