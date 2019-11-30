package application;

import java.util.ArrayList;

import application.Plants.Plants;
import application.Zombies.Zombie;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

public class SpriteManager {
	
	
	public ArrayList<Zombie> zombieList = new ArrayList<Zombie>();
	public ArrayList<Plants> plantList = new ArrayList<Plants>();
	public ArrayList<Pea> peaList = new ArrayList<Pea>();
	public ArrayList<sun> sunList = new ArrayList<sun>();
	private lawnMover mover;
	
	final int rowY;
	final long timeStart;
	
	public GraphicsContext gc;
	
		
	public SpriteManager(GraphicsContext gc, ArrayList<Zombie> zombieList, ArrayList<Plants> plantList, ArrayList<Pea> peaList, ArrayList<sun> sunList, lawnMover mover,int rowY , long timeStart ) {
		this.gc = gc;
		this.mover = mover;
		this.sunList = sunList;
		this.peaList = peaList;
		this.plantList = plantList;
		this.zombieList = zombieList;
		this.timeStart = timeStart;
		this.rowY = rowY;
		
	}
	
	
	public void removedeadzombie() {
		ArrayList<Zombie> removeindex = new ArrayList<Zombie>();
		for (int i = 0; i < zombieList.size(); i++) {
			if(zombieList.get(i).isalive == false ) {
				removeindex.add(zombieList.get(i));
			}
		}
		for (int i = 0; i < removeindex.size(); i++) {
			zombieList.remove((Zombie)removeindex.get(i));
		}
		
	}
	
	
	public void removedeadpea() {
		ArrayList<Pea> removeindex = new ArrayList<Pea>();
		for (int i = 0; i < peaList.size(); i++) {
			if(peaList.get(i).isalive == false ) {
				removeindex.add(peaList.get(i));
			}
		}
		for (int i = 0; i < removeindex.size(); i++) {
			peaList.remove((Pea)removeindex.get(i));
			//System.out.println(removeindex.get(i));
		}
	}
	
	
	public void update() {
		double t = (System.currentTimeMillis() - timeStart) / 1000.0;
		
		// Draw zombie
	     for (int counter = 0; counter < zombieList.size(); counter++) { 		      
	    	 Zombie currZombie = zombieList.get(counter); 
	    	 currZombie.activate();
	    	 gc.drawImage( currZombie.getFrame(t), currZombie.getx(), rowY );
	      }  
		
	     
	     // Draw plant
	     for (int counter = 0; counter < plantList.size(); counter++) { 		      
	    	 Plants currplant = plantList.get(counter);
	    	 
	    	 gc.drawImage( currplant.getFrame(t), currplant.getx(), rowY );
	      }  
	     
	     
	     // Draw pea
	     for (int counter = 0; counter < peaList.size(); counter++) { 		      
	    	 Pea currpea = peaList.get(counter);
	    	 currpea.activate();
	    	 gc.drawImage( currpea.getFrame(t), currpea.getx(), rowY +10 );
	    	 
	      }
	     
	     // Draw sun
	     for (int counter = 0; counter < sunList.size(); counter++) { 		      
	    	 sun currsun = sunList.get(counter); 
	    	 gc.drawImage( currsun.getFrame(t), currsun.getx(), rowY );
      }  
		
	     ///Mover movements
		if(mover.isalive == true) {
			gc.drawImage( mover.getFrame(t), mover.getx(), rowY );
		}
		
		removedeadzombie();
		removedeadpea();
		
	}
	
}
