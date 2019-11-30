package application;

import java.io.Serializable;

import javafx.scene.image.Image;

class AnimatedImage implements Serializable{
    // assumes animation loops,
    //  each image displays for equal time
	private static final long serialVersionUID = 45L;
	transient public Image[] frames;
    public double duration;
    
    public Image getFrame(double time){
        int index = (int)((time % (frames.length * duration)) / duration);
        return frames[index];
    }
}
