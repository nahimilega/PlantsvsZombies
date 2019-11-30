package application;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;

public class sun extends GameElements  {
	

	public sun(int xCoordinate) {
		super(500, "/application/resources/sun",1,50,50);
		// TODO Auto-generated constructor stub
		this.xCoordinate = xCoordinate;
	}

	public void setOnMousePressed(EventHandler<MouseEvent> eventHandler) {
		// TODO Auto-generated method stub
		
	}

	
}


 class Pea extends GameElements {
	 
	int attack;
	public Pea(int xCoordinate ) {
		super(500, "/application/resources/Pea",1,15,15);
		this.xCoordinate = xCoordinate+2;
		attack = 20;
		// TODO Auto-generated constructor stub
	}
	
	public void activate() {
		
		this.xCoordinate = this.xCoordinate+2; 
		
	}

}