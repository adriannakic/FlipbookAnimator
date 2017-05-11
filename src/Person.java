/*
 * Things I like about this class:
 * 		Comments explain what each shape drawn represents.
 * 		The person is drawn not only with hard coded numbers, but with a combination of numbers and fields.
 * 
 * 
 * Additions or Changes:
 * 		I would just write out xCoordinate and yCoordinate for the fields so you don't need comments to explain what they are.
 * 		If you're going to have comments for each shape, be consistent across all the shapes drawn.
 * 
 */
import java.awt.Color;
import java.lang.Math;

public class Person {

	private int xC;//xcoord
	private int yC;//ycoord
	public static Line arm;
	private Color randomColor;
	
	
	private int R = 0;
	private int G = 255;
	private int B = 255;
	//private int block;
	
	public Person () {
		xC = 210;
		yC = 310;
		//block = 10;
	}
	
	//checks to see if mouse coordinates are on the head
	public boolean isOnHead (int x, int y) {
		if (x >= (xC+40) && x <= (xC+70) && y >= (yC+40) && y <= (yC+70)) {
			System.out.println("Clicked head");
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//sets the head to a random color
	public void randomHeadColor () {
		randomColor = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
		R = (int)(Math.random()*255);
		G = (int)(Math.random()*255);
		B = (int)(Math.random()*255);
	}
	
	public void moveLeft () {
		xC -= 10;
	}
	
	public void moveRight () {
		xC += 10;
	}
	
	public void draw(DrawingSurface surface){
		//surface.rect(210, 310, 80, 140);//door
		surface.fill(R, G, B);
		surface.ellipse(xC + 40, yC + 40, 30, 30);//head
		surface.line(xC + 40, yC + 55, xC + 40, yC + 90);//body
		surface.line(xC + 40, yC + 90, xC + 20, yC + 140);//right leg
		surface.line(xC + 40, yC + 90, xC + 60, yC + 140);//(his) left leg
		//surface.line(xC + 20, yC + 65, xC + 60, yC + 65);
		arm = new Line(xC + 20, yC + 65, xC + 60, yC + 65);
		
		
	}
	
}
