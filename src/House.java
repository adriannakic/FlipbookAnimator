//house class
//main class
//canvas (extends PApplet)
import processing.awt.PSurfaceAWT;
import processing.core.PApplet;
import java.awt.Dimension;
import javax.swing.JFrame;


public class House {
	
	private int XGrid = 150;
	private int YGrid = 150;
	private Line door;
	private float scale = 1; //common factor for scaling

	
	public void draw(DrawingSurface surface) {
		surface.pushMatrix();
		surface.scale(scale);
		
		//translate();
		surface.fill(189, 172, 77);//dark beige of house
		surface.rect(XGrid+0,YGrid+100, 300, 200);//house
		
		surface.fill(255, 255, 0);//bright yellow of windows/door/roof
		surface.rect(XGrid+25,YGrid+180, 50, 50);//left window
		surface.rect(XGrid+225,YGrid+180,50,50);//right window
		surface.triangle(XGrid+150,YGrid+0,XGrid+0,YGrid+100,XGrid+300,YGrid+100);//roof
		
		
		door = new Line(XGrid+100,YGrid+200,XGrid + 200,YGrid + 300);
		if (door.intersects(Person.arm)) {
			surface.fill(255, 0, 0);
		}
		surface.rect(XGrid+100,YGrid+200,100,100);//door
		surface.popMatrix();
	}
	
	//reposition class sets house coordinates to x y values
	public void reposition(int x, int y) {
		XGrid = x - 150;
		YGrid = y - 150;
	}
	
	
	public void scaleUp() {
		scale += 0.1;
	}
	
	public void scaleDown() {
		scale -= 0.1;
	}
	
}
