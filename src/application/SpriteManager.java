package application;

import java.io.Serializable;
import java.util.ArrayList;

import application.Plants.Plants;
import application.Plants.cherryBomb;
import application.Zombies.Zombie;
import application.Zombies.trafficZombie;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

public class SpriteManager implements Serializable {
	
	
	public ArrayList<Zombie> zombieList = new ArrayList<Zombie>();
	public ArrayList<Plants> plantList = new ArrayList<Plants>();
	public ArrayList<Pea> peaList = new ArrayList<Pea>();
	public ArrayList<sun> sunList = new ArrayList<sun>();
	private lawnMover mover;
	Plants chb = new cherryBomb(200);
	final int rowY;
	final long timeStart;
	
	transient public GraphicsContext gc;
	
		
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
	
	

	public void getGC(GraphicsContext gc) {
		this.gc = gc;
		// to revive all the images after the deserialize
		for (Pea pea : peaList) {
			pea.revive();
		}
		for (sun pea : sunList) {
			pea.revive();
		}
		for (Plants pea : plantList) {
			pea.revive();
		}
		for (Zombie pea : zombieList) {
			pea.revive();
		}
		mover.revive();
		
		
		
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
	
	
	public void foundBombexplode(int xCoordinate){
		int lowRange = xCoordinate - 200;
		int high = xCoordinate + 300;
		for (Zombie z : zombieList) {
			if(z.xCoordinate>lowRange && z.xCoordinate<high) {
				z.hitbymover();
			}
			
		}
	}
	
	
	public void removedeadplant() {
		ArrayList<Plants> removeindex = new ArrayList<Plants>();
		//
		for (int i = 0; i < plantList.size(); i++) {
			if(plantList.get(i).isalive == false ) {
				removeindex.add(plantList.get(i));
				
				if(plantList.get(i).getClass().equals(chb.getClass())) {
					foundBombexplode(plantList.get(i).xCoordinate);
				}
				
			}
		}
		for (int i = 0; i < removeindex.size(); i++) {
			plantList.remove((Plants)removeindex.get(i));
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
		removedeadplant();
		removedeadzombie();
		removedeadpea();
		
	}
	
}
