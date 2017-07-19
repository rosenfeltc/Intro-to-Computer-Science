package miscellaneous;

import edu.princeton.cs.introcs.*;
public class Sketch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdDraw.setXscale(0, 200);
		StdDraw.setYscale(0, 200);
		
		StdDraw.clear();
		StdDraw.filledCircle(100, 125, 50);
		
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(125, 100, 50);
		
		StdDraw.show();
	}

}
