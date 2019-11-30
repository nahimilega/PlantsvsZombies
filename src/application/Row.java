package application;

import java.util.ArrayList;

import application.Plants.Plants;
import application.Plants.cherryBomb;
import application.Plants.shooterPlant;
import application.Plants.sunFlower;
import application.Plants.wallnut;
import application.Zombies.*;
import javafx.scene.canvas.GraphicsContext;

public class Row {
	public SpriteManager sManager;
	private ArrayList<Zombie> zombieList = new ArrayList<Zombie>();
	
	private ArrayList<Zombie> passiveZombies = new ArrayList<Zombie>();
	
	private ArrayList<Plants> plantList = new ArrayList<Plants>();
	private ArrayList<Pea> peaList = new ArrayList<Pea>();

	private double ctr;
	
	public ArrayList<sun> sunList = new ArrayList<sun>();
	private lawnMover mover;
	
	final int rowY;
	long timeStart;

	
	public Row(GraphicsContext gc, int rowY, long timeStart) {

		this.rowY = rowY;
		ctr = 0;
		/*
		Plants s = new shooterPlant(340);
		Plants wall = new wallnut(500);
		
		sun sun =new sun(798);
		sunList.add(sun);
		
		Plants sunf = new sunFlower(800);
		plantList.add(wall);
		plantList.add(sunf);
		plantList.add(s);
		*/
		mover = new lawnMover();

		
		sManager = new SpriteManager(gc, zombieList, plantList, peaList, sunList, mover, rowY, timeStart);
			
	}
	
	
	public void addZombie() {
		/*
		 * Convert passive to active zombie when time comes
		 */
		//System.out.println(passiveZombies.size());
		for (int i = 0; i < passiveZombies.size(); i++) {
			if(passiveZombies.get(i).getTimeOut() == this.ctr ) {
				zombieList.add(passiveZombies.get(i));
			}
		}
		
		
	}
	
	
	public void setPassivearray(ArrayList<Zombie> pzom) {
		this.passiveZombies = pzom;
	}
	
	public boolean findifPlantExist(int xCoordiante) {
		/*
		 * Check if the plant is preset at the specific location
		 */
		boolean isexist = false;
		
		for (int i = 0; i < plantList.size(); i++) {
			if( xCoordiante == plantList.get(i).xCoordinate) {
				isexist = true;
				break;
			}
			
		}
		
		return isexist;
	}
	
	public void plantPlant(int plantType, Double xCoordiante) {
		
		Plants newPlants = null;
		
		
		if(!findifPlantExist((int)Math.round(xCoordiante))) {
			
			if(plantType==0) {
				/*
				 * PLS CHANGE ME I AM CHERRY BOMB
				 * TODO: HAHAHAHAHH
				 */
				newPlants = new sunFlower((int)Math.round(xCoordiante));
			}
			
			else if (plantType == 1) {
				newPlants = new shooterPlant((int)Math.round(xCoordiante));
				
			}
			else if (plantType == 2) {

				newPlants = new sunFlower((int)Math.round(xCoordiante));
				
			}
			else if (plantType == 3) {
				newPlants = new wallnut((int)Math.round(xCoordiante));
				
			}	
			//Plants 
			plantList.add(newPlants);
		}
		
	}
	
	public void addPea(int x) {
		Pea pea = new Pea(x);
		peaList.add(pea);
	}
	
	
	public void addSun(int x) {
		sun s = new sun(x);
		sunList.add(s);
	}
	
	
	public void detectpeacollision() {
		/*
		 * Detect if pea collides with zombie or not
		 */
		for (int counter = 0; counter < peaList.size(); counter++) {
			Pea currPea = peaList.get(counter);
			for (int i = 0; i < zombieList.size(); i++) {
				if(zombieList.get(i).xCoordinate - currPea.xCoordinate < 3 && (zombieList.get(i).xCoordinate - currPea.xCoordinate) >= 0 ) {
					zombieList.get(i).reducehealth(currPea.attack);
					
					currPea.isalive = false;
					break;
				}
			}
		}
	}
	
	public int activate() {
		/*
		 * Return 0 is loose else return 1
		 */
		
		/*
		 * Logic goes here
		 */
		this.ctr++;
		
		addZombie();
		
		
		detectpeacollision();
		
		
		
		if(ctr%180==0) {
			Plants s = new shooterPlant(340);
			Plants sunflower = new sunFlower(300); // just a sample
		    for (int counter = 0; counter < plantList.size(); counter++) { 		      
		    	 Plants
		    	 currplant = plantList.get(counter);
		    	 
		    	   // just a sample
		    	 if(currplant.getClass().equals(s.getClass())) {
		    		 this.addPea(currplant.getx());
		    	 }
		    	 
		    	 if(currplant.getClass().equals(sunflower.getClass())) {
		    		 this.addSun(currplant.getx()+10);
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
