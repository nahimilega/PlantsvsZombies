package application.Plants;

import java.io.Serializable;

import javafx.scene.image.Image;


public class cherryBomb extends Plants implements Serializable {

	public cherryBomb(int xCoordinate) {

		super(0.25, "/application/resources/plants/CherryBomb/CherryBomb_Idle-",30,80,80,100);
		this.xCoordinate = xCoordinate;
	}
	
	@Override
	public Image getFrame(double time) {
		int index = (int)((time % (30 * 0.25)) / 0.25);
		if(index>25) {
			this.isalive = false;
		}
		return image.getFrame(time);
	}
	
}
