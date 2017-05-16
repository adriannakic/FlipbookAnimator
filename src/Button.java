import java.awt.geom.Point2D;
/**
 * The Button class represents an interactive button element on
 * the canvas. It keeps information on the location, size, and text within
 * a button. The main class can use these Button classes to read user
 * input.
 * @author Adrian Nakic, Bryce Rausch
 * @version alpha 1.0
 * @since 5/10/2017
 */
public class Button {
	
	private String message;
	private Point2D.Double topLeftCoord;
	private double width;
	private double height;
	
	/**
	 * constructor for a new button
	 * @param x the top left x coordinate
	 * @param y the top left y coordinate
	 * @param width the pixel-width of the button
	 * @param height the pixel-height of the button
	 * @param message the message inside the button
	 */
	public Button (double x, double y, double width, double height, String message) {
		this.message = message;
		topLeftCoord.setLocation(x, y);
		this.width = width;
		this.height = height;
	}
	
	public void draw (Canvas c) {
		c.rect((float)topLeftCoord.getX(), (float)topLeftCoord.getY(), (float)width, (float)height);
		
	}
}
