package recursion;

import edu.princeton.cs.introcs.*;

public class Htree 
{
	public static void prepareBackground()
	{
		StdDraw.setCanvasSize(1000, 1000);
		StdDraw.setXscale(0, 400);
		StdDraw.setYscale(0, 400);
		StdDraw.clear();
	}
	public static void drawH(double x, double y, double size)
	{
		// Compute the coordinates of the 4 tips of the H
		double x0 = x - size / 2;
		double x1 = x + size / 2;
		double y0 = y - size / 2;
		double y1 = y + size / 2;
		
		// Draw the 3 line segments of the H
		StdDraw.line(x0, y0, x0, y1);
		StdDraw.line(x1, y0, x1, y1);
		StdDraw.line(x0, y, x1, y);
	}
	
	public static void draw(int n, double x, double y, double size)
	{
		if(n == 0)
		{
			return;
		}
		drawH(x, y, size);

		// Adjust to the new locations
		double x0 = x - size / 2;
		double x1 = x + size / 2;
		double y0 = y - size / 2;
		double y1 = y + size / 2;
		
		// Draw the new H
		draw(n - 1, x0, y0, size / 2);
		draw(n - 1, x0, y1, size / 2);
		draw(n - 1, x1, y0, size / 2);
		draw(n - 1, x1, y1, size / 2);
	}
	
	
	public static void main(String[] args)
	{
		prepareBackground();
		draw(7, 200, 200, 200);
	}
}
