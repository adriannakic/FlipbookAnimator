
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
	
	Flipbook flip = new Flipbook();
	//Frame f = new Frame();//REPLACE WITH FLIPARRAY CODE                             *************************

	
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Button button6;
	Button button7;
	Button button8;
	Button button9;
	
	int currentFrame = 0;
	boolean isInPlay = false;
	int playbackTime = -1;
	int lastFrameDrawn = -1;
	int playSpeed = 500;//0.5,1,2,4 fps
	
	public void draw() { 
	  background(255);   // Clear the screen with a white background
	  noFill();
	  stroke(0);
	  strokeWeight(4);
	  textAlign(CENTER);
	  textSize(12);
	  cursor(CROSS);
	  
	  button1 = new Button(300, 70, 150, 50, "Next Frame");
	  button2 = new Button(50, 70, 150, 50, "Play");
	  button3 = new Button(10, 20, 30, 30, "0.5");
	  button4 = new Button(50, 20, 30, 30, "1");
	  button5 = new Button(90, 20, 30, 30, "2");
	  button6 = new Button(130, 20, 30, 30, "4");
	  button7 = new Button(350, 420, 100, 30, "Clear Frame");
	  button8 = new Button(50, 420, 100, 30, "Back");
	  button9 = new Button(160, 420, 100, 30, "Forward");
	  
	  frameRate(60);
	  
	  button1.isPressed(mouseX, mouseY);
	  button2.isPressed(mouseX, mouseY);
	  button3.isPressed(mouseX, mouseY);
	  button4.isPressed(mouseX, mouseY);
	  button5.isPressed(mouseX, mouseY);
	  button6.isPressed(mouseX, mouseY);
	  button7.isPressed(mouseX, mouseY);
	  button8.isPressed(mouseX, mouseY);
	  button9.isPressed(mouseX, mouseY);
	  
	  button3.draw(this);
	  button4.draw(this);
	  button5.draw(this);
	  button6.draw(this);
	  button7.draw(this);
	  button8.draw(this);
	  button9.draw(this);
	  button1.draw(this);
	  button2.draw(this);
	  
	  if (flip.getNumFrames() > 0 && !isInPlay){
		  if (flip.getNumFrames()>1){
			  stroke(153);
			  flip.getFrame(currentFrame-1).draw(this);
		  }
		  stroke(0);
		  flip.getFrame(currentFrame).draw(this);//REPLACE WITH FLIPARRAY CODE                          *************************
		  
	  }
	  
	  fill(0,0,0);
	  int m = millis();
	  text(mouseX + " : " + mouseY,(float)width/2,(float)20);
	  text("Frame " + (currentFrame+1) + " of " + flip.getNumFrames() + " frames",(float)width/2,(float)40);
	  text("Milliseconds: " + m,(float)width/2,(float)60);
	  text("Select Framerate: "+ 1000.0/playSpeed + "fps", 85, 15);
	  //text("Framerate selected", 400, 15);
	  //text(""+ playSpeed, 400, 35);
	  
	  if (isInPlay && flip.getNumFrames() > 0) {//if some lines have been drawn and play has been clicked
		  //0.5,1,2,4 <--options for fps
		  int playedFrameIndex = -1;
		  int timePassed = millis() - playbackTime;//milliseconds passed since playback started
		  playedFrameIndex = timePassed/playSpeed;
		  
		  if (playedFrameIndex == flip.getNumFrames()) {
			  //the playback is done
			  isInPlay=false;
			  
	  	  }
		  if (playedFrameIndex < flip.getNumFrames())
			  flip.getFrame(playedFrameIndex).draw(this);
	  	  }
	  	  
		}
	
	
	Line l;
	
	public void mousePressed() {
		if (mouseButton == LEFT) {
			l = new Line();
			if (flip.getNumFrames()>0)
				flip.addLineToFrame(currentFrame, l);
			l.addPoint(mouseX, mouseY);
			//System.out.println("mouse pressed at: " + mouseX + "," + mouseY);
			if (button1.isPressed(mouseX,mouseY)) {
				if (currentFrame == flip.getNumFrames()-1){
					flip.addFrame();
					currentFrame++;
				}
				
			}
			if (button2.isPressed(mouseX, mouseY)) {
				isInPlay = !isInPlay;
				playbackTime = millis();
			}
			if (button3.isPressed(mouseX, mouseY)){
				playSpeed = 2000;
			}
			if (button4.isPressed(mouseX, mouseY)){
				playSpeed = 1000;
			}
			if (button5.isPressed(mouseX, mouseY)){
				playSpeed = 500;
			}
			if (button6.isPressed(mouseX, mouseY)){
				playSpeed = 250;
			}
			if (button7.isPressed(mouseX, mouseY)){
				flip.getFrame(currentFrame).clearFrame();
			}
			if (button8.isPressed(mouseX, mouseY)){//previous frame button pressed
				//check that the frame behind exists first
				System.out.println("back button pressed");
				if (currentFrame > 1) {
					currentFrame--;
				}
			}
			if (button9.isPressed(mouseX, mouseY)){//forward pressed
				//check that the frame ahead exists first
				System.out.println("currentFrame: " + currentFrame + ", flip.getNumFrames(): " + flip.getNumFrames());
				if (currentFrame < flip.getNumFrames()-1) {
					currentFrame++;
				}
			}
		} 
	}
	
	public void mouseDragged(){
		if(mouseButton == LEFT){
			l.addPoint(mouseX, mouseY);
			
		}
	}
	public void mouseReleased(){
		if(mouseButton == LEFT){
			l.addPoint(mouseX, mouseY);
			System.out.println("mouse released at: " + mouseX + "," + mouseY);
		}
	}

}






