import processing.core.PApplet;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.ArrayList;
/**
 * This Line class represents a squiggle, or amorphous line.
 * The Line class's draw method connects each arraylist of 
 * points with a line from the Processing library.
 * @author Adrian Nakic, Bryce Rausch
 * @version alpha 1.0
 * @since 5/10/2017
 */
public class Line {
	
	private ArrayList <Point2D.Double> line;//arraylist of (x,y) coords
	
	/**
	 * Constructs a new, empty line. The Point2D.Double arraylist is instantiated.
	 */
	public Line () {
		line = new ArrayList<Point2D.Double>();
	}
	
	/**
	 * the draw method for each individual line. The lines aren't lines in the traditional sense, but are more like squiggles wit ha beginning and end, stored as a series of points.
	 * @param p The canvas with which to draw
	 */
	public void draw (PApplet p) {
		if (line.size() == 1) {
			p.point((float)line.get(0).getX(), (float)line.get(0).getY());
		}
		else {
			for (int i = 0; i < line.size()-1; i++) {
				p.line((float)line.get(i).getX(), (float)line.get(i).getY(), (float)line.get(i+1).getX(), (float)line.get(i+1).getY());
			}
		}
	}
	
	/**
	 * Adds a new point with coordinates (x,y) to the line
	 * @param x The x coordinate of the point added to the line
	 * @param y The y coordinate of the point added to the line
	 */
	public void addPoint(double x, double y) {
		line.add(new Point2D.Double(x, y));
	}
	public void clearLine(){
		line.clear();
	}
}
