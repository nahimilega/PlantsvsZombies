package application;

import java.io.Serializable;

import javafx.scene.image.Image;

public class GameElements implements Serializable{
	private static final long serialVersionUID = 44L;
	AnimatedImage image;
	transient Image[] imageArray;
	protected int xCoordinate;
	
	protected boolean isalive;
	protected int sizeX;
	String nameOfImage;
	int noOfImage;
	int sizeY;
	
	public GameElements(double duration, String nameOfImage, int noOfImage, int sizeX , int sizeY) {
		this.isalive = true;
		image = new AnimatedImage();
		
		Image[] imageArray = new Image[noOfImage];
		
        for (int i = 0; i < noOfImage; i++)
            imageArray[i] = new Image( nameOfImage+ i + ".png",sizeX, sizeY, false, false );
	
		
        image.frames = imageArray;
        image.duration = duration;
        this.sizeX = sizeX;
        this.noOfImage = noOfImage;
        this.sizeY = sizeY;
        this.nameOfImage = nameOfImage;
	}
	
	public int getx() {
		return xCoordinate;
	}
	
	
	public void revive() {
		Image[] imageArray = new Image[noOfImage];
		
        for (int i = 0; i < noOfImage; i++)
            imageArray[i] = new Image( nameOfImage+ i + ".png",sizeX, sizeY, false, false );

        image.frames = imageArray;
	}
	
	public Image getFrame(double time) {
		return image.getFrame(time);
	}
	
}
