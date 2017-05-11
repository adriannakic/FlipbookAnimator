import java.awt.Dimension;

import javax.swing.JFrame;

import processing.awt.PSurfaceAWT;

public class Main extends Canvas{

	// The statements in the setup() function 
	// execute once when the program begins
	public void setup() {
	  
	}
	
	public static void main(String args[]) {
		Canvas drawing = new Canvas();
		
		PSurfaceAWT surf = (PSurfaceAWT) drawing.getSurface();
		PSurfaceAWT.SmoothCanvas canvas = (PSurfaceAWT.SmoothCanvas) surf.getNative();
		JFrame window = (JFrame)canvas.getFrame();

		window.setSize(500, 500);
		window.setMinimumSize(new Dimension(100, 100));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);

		window.setVisible(true);
		canvas.requestFocus();
	}
	
}
