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
	
	//constructor
	public Frame () {
		
	}
	
	//methods
	
	//clears the frame of all lines
	public void clearFrame () {
		lines.clear();
	}
	
	//draws the frame by drawing each line
	public void draw(Canvas c) {
		for (Line l: lines) {
			l.draw(c);
		}
	}
}
