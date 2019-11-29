package application.Zombies;

public class normalZombie extends Zombie {

	public normalZombie(int xCoordinate) {
		super(0.25, "/application/Zombies/zombieNormal",2,50,80);
		// TODO Auto-generated constructor stub
		this.xCoordinate = xCoordinate;
	}
	
	public void activate() {
		this.xCoordinate = this.xCoordinate-1; 
		
	}
	
}
