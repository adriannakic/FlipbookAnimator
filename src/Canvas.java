
import processing.awt.PSurfaceAWT;
import processing.core.PApplet;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
/**
 * This Canvas class represents a physical canvas upon which a user can
 * draw. It uses the Processing library to track the mouse's actions.
 * @author Adrian Nakic, Bryce Rausch
 * @version alpha 1.0
 * @since 5/10/2017
 */
//3+ classes: drawingsurface/canvas, house, draw
public class Canvas extends PApplet {
	

	public Flipbook flipbook = new Flipbook();
	
	public Canvas () {
		runSketch();
	}
	
	public void setup() {
		
	}
	
	// The statements in draw() are executed 60 times a second until the 
	// program is stopped. Each statement is executed in 
	// sequence and after the last line is read, the first 
	// line is executed again.
	public void draw() { 
	  background(255);   // Clear the screen with a white background
	  noFill();
	  stroke(0);
	  
	  
	  float xRatio = width/500f;
	  float yRatio = height/500f;
	  scale(xRatio, yRatio);
	  
	  frameRate(12);
	  println(mouseX + " : " + mouseY);
	  //h.reposition(mouseX, mouseY);
	  
	  if (keyPressed) {
			if (key == 'R') {
			    System.out.println("pressed R");
			}
			if (key == CODED) {
				//up/down for house scaling (currently broken)
				if (keyCode == UP) {
				} 
				else if (keyCode == DOWN) {
				}
				//left/right from person
				if (keyCode == LEFT) {
				} 
				else if (keyCode == RIGHT) {
				} 
			}
		}
	  
	}
	public void mousePressed() {
		if (mouseButton == LEFT) {
			//poly.add(new Point2D.Double(mouseX,mouseY));
			//x = mouseX;
			//y = mouseY;
			//time = ANIMATION_TIME;
		} 
	}

}






