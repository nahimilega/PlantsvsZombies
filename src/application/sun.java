package application;

import javafx.scene.image.Image;

public class sun extends GameElements  {
	
	
	
	public sun() {
		super(500, "/application/Sun",1,50,50);
		// TODO Auto-generated constructor stub
	}

}


 class Pea extends GameElements {
	 
	 
	public Pea(int xCoordinate ) {
		super(500, "/application/Pea",1,15,15);
		this.xCoordinate = xCoordinate;
		// TODO Auto-generated constructor stub
	}
	
	public void activate() {
		this.xCoordinate = this.xCoordinate+2; 
		
	}

}