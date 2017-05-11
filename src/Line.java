import processing.core.PApplet;

public class Line {
	
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	
	public Line (double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public void draw (PApplet p) {
		p.line((float)x1, (float)y1, (float)x2, (float)y2);
	}
	
	
	public void setPoint2(double x2v2, double y2v2) {
		x2 = x2v2;
		y2 = y2v2;
	}
	
	//checks if the lines intersect
	public boolean intersects (Line other) {
		
		//find Px of intersection
		double pX = (((x1*y2-y1*x2)*(other.x1-other.x2)-(x1-x2)*(other.x1*other.y2-other.y1*other.x2))/((x1-x2)*(other.y1-other.y2)-(y1-y2)*(other.x1-other.x2)));
		double pY = (((x1*y2-y1*x2)*(other.y1-other.y2)-(y1-y2)*(other.x1*other.y2-other.y1*other.x2))/((x1-x2)*(other.y1-other.y2)-(y1-y2)*(other.x1-other.x2)));
		//is Px between both lines' x ranges?
		//if yes, return true
		//if no, return false
		if ((pX <= x2 && pX >= x1 && pX <= other.x2 && pX >= other.x1) || (pX >= x2 && pX <= x1 && pX <= other.x2 && pX >= other.x1) || (pX <= x2 && pX >= x1 && pX >= other.x2 && pX <= other.x1) || (pX >= x2 && pX <= x1 && pX <= other.x2 && pX >= other.x1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getXIntercept (Line other) {
		double pX = (((x1*y2-y1*x2)*(other.x1-other.x2)-(x1-x2)*(other.x1*other.y2-other.y1*other.x2))/((x1-x2)*(other.y1-other.y2)-(y1-y2)*(other.x1-other.x2)));
		return pX;
	}
	
	public double getYIntercept (Line other){
		double pY = (((x1*y2-y1*x2)*(other.y1-other.y2)-(y1-y2)*(other.x1*other.y2-other.y1*other.x2))/((x1-x2)*(other.y1-other.y2)-(y1-y2)*(other.x1-other.x2)));
		return pY;
	}
	
	
}
