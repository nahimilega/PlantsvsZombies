package application.Plants;

import application.GameElements;
import application.SpriteManager;
import javafx.scene.image.Image;





class shooter extends Plants{



	public shooter(String nameOfImage, int noOfImage, int sizeX , int sizeY) {

		super(0.25, nameOfImage,noOfImage,sizeX,sizeY);
		// TODO Auto-generated constructor stub
	}
	
	
}

public class shooterPlant extends shooter{


	
	public shooterPlant(int xCoordinate) {
		super("/application/Plants/shooterPlant",2,50,50);
		this.xCoordinate = xCoordinate;
		
	}	
	
	
	
}
