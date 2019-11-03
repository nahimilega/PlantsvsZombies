package application;

import java.util.ArrayList;

import application.Plants.Plants;
import application.Plants.shooterPlant;
import application.Plants.sunFlower;
import application.Plants.wallnut;
import application.Zombies.*;
import javafx.scene.canvas.GraphicsContext;

public class Row {
	public SpriteManager sManager;
	private ArrayList<Zombie> zombieList = new ArrayList<Zombie>();
	
	
	private ArrayList<Plants> plantList = new ArrayList<Plants>();
	private ArrayList<Pea> peaList = new ArrayList<Pea>();

	private double ctr;
	
	public ArrayList<sun> sunList = new ArrayList<sun>();
	private lawnMover mover;
	

	final int rowY;
	long timeStart;

	
	public Row(GraphicsContext gc, int rowY, long timeStart) {
		Zombie zombie = new normalZombie(1000);
		zombieList.add(zombie);
		this.rowY = rowY;
		ctr = 0;
		Plants s = new shooterPlant(340);
		Plants wall = new wallnut(500);
		
		sun sun =new sun(798);
		sunList.add(sun);
		
		Plants sunf = new sunFlower(800);
		plantList.add(wall);
		plantList.add(sunf);
		mover = new lawnMover();

		plantList.add(s);
		sManager = new SpriteManager(gc, zombieList, plantList, peaList, sunList, mover, rowY, timeStart);
			
	}
	
	
	public void addZombie() {
		
	}
	
	public int plantPlant() {
		
		return 0;
	}
	
	public void addPea(int x) {
		Pea pea = new Pea(x);
		peaList.add(pea);
	}
	
	public int activate() {
		/*
		 * Return 0 is loose else return 1
		 */
		
		/*
		 * Logic goes here
		 */
		this.ctr++;
		
		
		if(ctr%180==0) {
		    for (int counter = 0; counter < plantList.size(); counter++) { 		      
		    	 Plants currplant = plantList.get(counter);
		    	 Plants s = new shooterPlant(340);  // just a sample
		    	 if(currplant.getClass().equals(s.getClass())) {
		    		 this.addPea(currplant.getx());
		    	 }
		    }
		    
		}
		
		
		
		
		sManager.update();
		
		return 1;
	}
	
	
	
	
}


/*TODO
 * Destroy peas when they cross
 */
