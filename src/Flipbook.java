import java.util.ArrayList;
/**
 * The Flipbook class is a representation of a flipbook, which is
 * a sequence of frames. The draw method uses a timer to draw each
 * frame in the correct order upon the canvas.
 * @author Adrian Nakic, Bryce Rausch
 * @version alpha 1.0
 * @since 5/10/2017
 */
public class Flipbook {
	
	private ArrayList<Frame> frames = new ArrayList<Frame>();
	
	//constructor
	public Flipbook () {
		
	}
	
	//methods
	public void addFrame() {
		frames.add(new Frame());
	}
	
	//returns the total number of frames in flipbook
	public int numFrames() {
		return frames.size();
	}
	
	//returns a frame at specified index
	public Frame getFrame(int index) {
		return frames.get(index);
	}
	
	//draw method, calls draw method for each frame
	public void draw(Canvas c) {
		//timer goes here
		for (Frame f: frames) {
			f.draw(c);
		}
	}
	
	
}
