package application.Plants;

import application.GameElements;
import application.SpriteManager;
import javafx.scene.image.Image;

public class Plants extends GameElements {
	
	int life;
	
	

	public Plants(Double duration, String nameOfImage, int noOfImage, int sizeX , int sizeY, int life) {
		
		super(duration,nameOfImage,noOfImage, sizeX ,sizeY);
		// TODO Auto-generated constructor stub
		this.life = life;
	}

	
	public void reduceHealth(int attack) {
		this.life -= attack;
		if(this.life<=0) {
			this.isalive = false;
		}
	}
	
	
	
}
