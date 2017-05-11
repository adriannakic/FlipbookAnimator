
import processing.awt.PSurfaceAWT;
import processing.core.PApplet;
import java.awt.Dimension;
import javax.swing.JFrame;

//3+ classes: drawingsurface/canvas, house, draw
public class DrawingSurface extends PApplet {
	
	private House h;
	private Person p;

	public DrawingSurface () {
		h = new House();
		p = new Person();
		runSketch();
	}
	
	
	
	public void mousePressed() {
		  h.reposition(mouseX, mouseY);
		  
		  if (p.isOnHead(mouseX, mouseY) == true) {
			  p.randomHeadColor();
			  p.draw(this);
		  }
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
	  
	  h.draw(this);
	  p.draw(this);
	  
	  frameRate(12);
	  println(mouseX + " : " + mouseY);
	  //h.reposition(mouseX, mouseY);
	  
	  if (keyPressed) {
			if (key == 'R') {
			    p.randomHeadColor();
			    System.out.println("pressed R");
			}
			
				if (key == CODED) {
					//up/down for house scaling (currently broken)
				    if (keyCode == UP) {
				      h.scaleUp();
				    } else if (keyCode == DOWN) {
				      h.scaleDown();
				    }
				    //left/right from person
				    if (keyCode == LEFT) {
					      p.moveLeft();
					} 
				    else if (keyCode == RIGHT) {
					      p.moveRight();
					} 
				}
		}
	  
	}

}






