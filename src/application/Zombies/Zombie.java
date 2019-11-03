package application.Zombies;

import application.GameElements;
import application.SpriteManager;
import javafx.scene.image.Image;

public abstract class Zombie extends GameElements {
	
	public Zombie(Double duration, String nameOfImage, int noOfImage, int sizeX , int sizeY) {
		super(duration,nameOfImage,noOfImage, sizeX ,sizeY);
		// TODO Auto-generated constructor stub
	}
	public  abstract void activate();
	
}
