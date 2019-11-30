package application.Plants ;

import java.io.Serializable;

public class wallnut extends Plants implements Serializable{
	
	public wallnut(int xCoordinate) {
		super(0.1, "/application/resources/plants/Wallnut/00",44,66,66,500);
		this.xCoordinate = xCoordinate;
	}

}
