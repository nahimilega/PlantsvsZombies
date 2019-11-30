package application.Zombies;

public class trafficZombie extends Zombie {

	public trafficZombie() {
		super(0.25, "/application/resources/zombies/normalzombie/zombieNormal",2,50,80,100);
		// TODO Auto-generated constructor stub
		this.xCoordinate = 1450;
	}
	
	public void activate() {
		this.xCoordinate = this.xCoordinate-1; 
		
	}
	
}
