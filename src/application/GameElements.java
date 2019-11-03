package application;

import javafx.scene.image.Image;

public class GameElements {
	
	AnimatedImage image;
	Image[] imageArray;
	protected int xCoordinate;
	
	boolean isalive;
	

	
	public GameElements(double duration, String nameOfImage, int noOfImage, int sizeX , int sizeY) {
		this.isalive = true;
		image = new AnimatedImage();
		
		Image[] imageArray = new Image[noOfImage];
		
        for (int i = 0; i < noOfImage; i++)
            imageArray[i] = new Image( nameOfImage+ i + ".png",sizeX, sizeY, false, false );
	
		
        image.frames = imageArray;
        image.duration = duration;
	}
	
	public int getx() {
		return xCoordinate;
	}
	
	public Image getFrame(double time) {
		return image.getFrame(time);
	}
	
}
