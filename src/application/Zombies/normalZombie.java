package application.Zombies;

import java.io.Serializable;

public class normalZombie extends Zombie implements Serializable{

	public normalZombie() {
		super(0.25, "/application/resources/zombies/normalzombie/zombieNormal",2,50,80,100);
		// TODO Auto-generated constructor stub
		this.xCoordinate = 1450;
	}
	

	
}
