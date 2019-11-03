package application;

import javafx.scene.image.Image;

public class lawnMover extends GameElements{
	
	Image stillImage;
	
	private boolean isactive;
	
	public lawnMover() {
		super(0.22, "/application/lawnMover",2,70,70);
		stillImage = new Image( "/application/stilllawnMover.png",70, 70, false, false );
		this.xCoordinate = 250;
		this.isactive = false;
	}

	@Override
	public Image getFrame(double time) {
		if (isactive) {
			return image.getFrame(time);
		}
		else {
			return stillImage;
		}
		
	}

}
