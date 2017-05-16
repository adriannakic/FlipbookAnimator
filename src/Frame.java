import java.util.ArrayList;
/**
 * The frame represents one frame of the animation in the flipbook.
 * Each frame is a set of lines upon the frame.
 * @author Adrian Nakic, Bryce Rausch
 * @version alpha 1.0
 * @since 5/10/2017
 */
public class Frame {
	
	private ArrayList<Line> lines = new ArrayList<Line>();
	
	/**
	 * constructs a new frame
	 */
	public Frame () {
		
	}
	
	//methods
	
	/**
	 * clears the frame of all lines, in case the user wants to restart a frame
	 */
	public void clearFrame () {
		lines.clear();
	}
	
	/**
	 * The draw method for a frame, which calls the draw method for each of it's lines
	 * @param c The canvas being passed in
	 */
	public void draw(Canvas c) {
		for (Line l: lines) {
			l.draw(c);
		}
	}
}
