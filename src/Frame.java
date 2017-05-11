import java.util.ArrayList;

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
