package application.Plants;

import java.io.Serializable;

import application.GameElements;
import application.SpriteManager;
import javafx.scene.image.Image;





public class sunFlower extends Plants implements Serializable{
	private static final long serialVersionUID = 40L;
	public sunFlower(int xCoordinate) {

		super(0.25, "/application/resources/plants/sunflower/00",15,80,80,100);
		this.xCoordinate = xCoordinate;
	}
	
	
}

	

