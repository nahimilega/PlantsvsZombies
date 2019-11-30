package application;

import javafx.scene.image.Image;

public class lawnMover extends GameElements{
	
	transient Image stillImage;
	
	public boolean isactive;
	
	public lawnMover() {
		super(0.22, "/application/resources/lawnMover",2,70,70);
		stillImage = new Image( "/application/resources/stilllawnMover.png",70, 70, false, false );
		this.xCoordinate = 250;
		this.isactive = false;
	}

	
	@Override
	public void revive() {
		// TODO Auto-generated method stub
		super.revive();
		stillImage = new Image( "/application/resources/stilllawnMover.png",70, 70, false, false );
	}
	
	
	@Override
	public Image getFrame(double time) {
		if (isactive) {
			this.xCoordinate += 10;
			
			if(this.xCoordinate > 1500) {
				this.isalive = false;
			}
			
			return image.getFrame(time);
		}
		else {
			return stillImage;
		}
		
	}

}
