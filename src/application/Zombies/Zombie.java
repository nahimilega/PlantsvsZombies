package application.Zombies;

import application.GameElements;
import application.SpriteManager;
import javafx.scene.image.Image;
import java.util.Random;

public abstract class Zombie extends GameElements {
	
	private int timeOut;
	protected int health;
	
	public Zombie(Double duration, String nameOfImage, int noOfImage, int sizeX , int sizeY, int health) {
		super(duration,nameOfImage,noOfImage, sizeX ,sizeY);
		setTimeOut();
		this.health = health;
		// TODO Auto-generated constructor stub
	}
	
	public  abstract void activate();

	public int getTimeOut() {
		return timeOut;
	}

	public void setTimeOut() {
		Random rand = new Random(); 
		this.timeOut = rand.nextInt(10000);;
	}
	
	public void reducehealth(int attack) {
		this.health = this.health - attack;
		if(this.health<0) {
			this.health = 0;
		}
	}
	
}
