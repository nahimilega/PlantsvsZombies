package application.Zombies;

public class normalZombie extends Zombie {

	public normalZombie() {
		super(0.25, "/application/resources/zombies/normalzombie/zombieNormal",2,50,80,100);
		// TODO Auto-generated constructor stub
		this.xCoordinate = 1450;
	}
	
	public void activate() {
		if(this.health <= 0) {
			this.isalive = false;
		}
		this.xCoordinate = this.xCoordinate-1; 
		
	}
	
}
