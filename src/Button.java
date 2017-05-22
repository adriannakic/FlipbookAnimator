import java.awt.Color;
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
	//private Point2D.Double topLeftCoord;
	private double xCoord;
	private double yCoord;
	private double width;
	private double height;
	private boolean isPressed = false;
	
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
		//topLeftCoord.setLocation(x, y);
		xCoord = x;
		yCoord = y;
		this.width = width;
		this.height = height;
	}
	
	/**
	 * draw method for a button, which fills with a non-grey color as the mouse goes over the button,
	 * as well as displaying the text in the center of the button
	 * @param c the canvas used to draw
	 */
	public void draw (Canvas c) {
		if (isPressed == true) {
			c.fill(245, 245, 88);
		}
		else {
			c.fill(188, 188, 188);
		}
		c.rect((float)xCoord, (float)yCoord, (float)width, (float)height);
		c.fill(0,0,0);
		c.text(message, (float)(xCoord+width/2), (float)(yCoord+height/2));
	}
	/**
	 * returns true if an x,y coordinate is within the button
	 * @param x the x coord of the coordinate being checked
	 * @param y the y coord of the coordinate being checked
	 * @return true if the x,y coordinate is within the button
	 */
	public boolean isPressed(double x, double y) {
		if (x >= xCoord && x <= xCoord+width && y >= yCoord && y <= yCoord+height) {
			//System.out.println("("+x+", "+y+") is within the button");
			isPressed = true;
			return true;
		}
		else {
			isPressed = false;
			return false;
		}
	}
	
	
}
