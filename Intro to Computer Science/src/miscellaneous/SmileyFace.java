package miscellaneous;

import edu.princeton.cs.introcs.*;
public class SmileyFace {

	public static void main(String[] args) {
		// Set scale and canvas size to draw on
		StdDraw.setCanvasSize(1200,1000);
		StdDraw.setXscale(0, 200);
		StdDraw.setYscale(0, 200);
		
		StdDraw.clear();
		
		// The Hair
		StdDraw.setPenColor(StdDraw.BLUE);
		double[] x = {85, 50, 150, 115};
		double[] y = {125, 175, 175, 125};
		StdDraw.filledPolygon(x, y);
		
		// The face
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(.05);
		StdDraw.circle(100, 100, 50);
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(100, 100, 50);
		
		// The eyes
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(85, 115, 10);
		StdDraw.filledCircle(115, 115, 10);
		
		// The mouth
		StdDraw.setPenRadius(.025);
		StdDraw.arc(100, 90, 20, 200, 340);
		// Draw
		StdDraw.show();

	}

}
