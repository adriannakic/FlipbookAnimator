
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
	// Line l = new Line();
	Frame f = new Frame();
	Flipbook flip = new Flipbook();
	Button button1;
	Button button2;
	int currentFrame = 0;
	public void draw() { 
	  background(255);   // Clear the screen with a white background
	  noFill();
	  stroke(0);
	  textAlign(CENTER);
	  textSize(12);
	  
	  button1 = new Button(300, 50, 150, 50, "Next Frame");
	  button2 = new Button(50, 50, 150, 50, "Play");
	  
	  
	  //float xRatio = width/500f;
	  //float yRatio = height/500f;
	  //scale(xRatio, yRatio);
	  
	  frameRate(60);
	  f.draw(this);
	  button1.isPressed(mouseX, mouseY);
	  button2.isPressed(mouseX, mouseY);
	  button1.draw(this);
	  button2.draw(this);
	  fill(0,0,0);
	  text(mouseX + " : " + mouseY,(float)width/2,(float)20);
	  text("Frame " + currentFrame + " of " + flip.getNumFrames() + " frames",(float)width/2,(float)40);
	  //println(mouseX + " : " + mouseY);
	  button1.isPressed(mouseX, mouseY);
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
	
	
	Line l;
	
	
	public void mousePressed() {
		if (mouseButton == LEFT) {
			l = new Line();
			f.addLine(l);
			l.addPoint(mouseX, mouseY);
			System.out.println("mouse pressed at: " + mouseX + "," + mouseY);
			if (button1.isPressed(mouseX,mouseY)) {
				flip.addFrame(f);
				f = new Frame();
				currentFrame++;
			}
			//poly.add(new Point2D.Double(mouseX,mouseY));
			//x = mouseX;
			//y = mouseY;
			//time = ANIMATION_TIME;
		} 
	}
	
	public void mouseDragged(){
		if(mouseButton == LEFT){
			l.addPoint(mouseX, mouseY);
			//System.out.println("mouse dragged at: " + mouseX + "," + mouseY);
		}
	}
	public void mouseReleased(){
		if(mouseButton == LEFT){
			l.addPoint(mouseX, mouseY);
			System.out.println("mouse released at: " + mouseX + "," + mouseY);
			
			
		}
	}

}






