package application.Zombies;

import java.io.Serializable;

public class trafficZombie extends Zombie implements Serializable {

	public trafficZombie() {
		super(0.01, "/application/resources/zombies/Zombie_cone/Zombie_cone-",50,80,100,200);
		// TODO Auto-generated constructor stub
		this.xCoordinate = 1450;
	}
	
	
}
