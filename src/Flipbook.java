import java.util.ArrayList;

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
