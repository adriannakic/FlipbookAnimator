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
	
	
	public void setPoint1(double x1v2, double y1v2) {
		x1 = x1v2;
		y1 = y1v2;
	}
	
	public void setPoint2(double x2v2, double y2v2) {
		x2 = x2v2;
		y2 = y2v2;
	}
}
