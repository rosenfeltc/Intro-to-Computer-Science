/* This is Tree.java for short assignment 5. Coded by Christopher Rosenfelt for CSI/CEN 201 on 06/27/2017.
 * After getting the original m = 7 and n = 5 to work, I tried m = 3 and n = 10, it essentially draws three
 * branches at every order; however, it does so by drawing first the left most branch possible at every order
 * until the last order is reached so it is returned to the previous order and then draws the next left-most
 * branch of that next order. This is basically why the drawing is not symmetric, because the tree is being 
 * drawn from the left-most branch possible at every order slowly moving rightwards. By drawing from left to
 * right, the new branches are superimposed on top of the previous branches.*/ 

package homework5;

import edu.princeton.cs.introcs.*;

public class Tree
{
	// Declare some literal constants
	public static int WINDOW_SIZE = 800;
	public static double REDUCTION = 0.70;
	
	// Method that prepares the canvas on which the tree will be drawn
	public static void setBackground()
	{
		StdDraw.setCanvasSize(WINDOW_SIZE, WINDOW_SIZE);
		StdDraw.setXscale(0, WINDOW_SIZE);
		StdDraw.setYscale(0, WINDOW_SIZE);
		StdDraw.clear();
	}
	
	// Draw method that will be recursively called, it takes the number of branches, the current order,
	// the current size of the pen radius, the current length of the trunk/branch, the current start position
	// of the trunk/branch (x0, y0) and the current degree of the branch drawing
	public static void draw(int m, int n, double p, double l, double x0, double y0, double d)
	{
		// Depending on the current order, decide if we need to return and if not, decide what color to draw in
		if(n == 0)
		{
			return;
		}
		if(n == 1)
		{
			StdDraw.setPenColor(StdDraw.GREEN);
		}
		else
		{
			StdDraw.setPenColor(StdDraw.GRAY);	
		}
		
		// Set the pen radius to the current radius that was passed in which will have been reduced by 70% of the previous radius
		StdDraw.setPenRadius(p);
		
		// Use cosine and sine on the current angle to find out where the end position of the branch/trunk should be and draw the branch/trunk
		double adjX = Math.sin(Math.toRadians(d)) * l;
		double adjY = Math.cos(Math.toRadians(d)) * l;
		StdDraw.line(x0, y0, x0 + adjX, y0 + adjY);
		
		// Based on the number of branches (variable m), calculate the average degrees of distance between them. Adjust the current degrees
		// accordingly.
		double averageDegrees = 90.0 / (m - 1);
		d += -(90 / 2);
		
		// Iterate through the number of branches that will be drawn, adjusting the current degrees by the average degrees at each iteration
		// in order to draw each of the m branches at every order n
		for(int i = 0; i < m; i++)
		{
			draw(m, n - 1, p * REDUCTION, l * REDUCTION, x0 + adjX, y0 + adjY, d);
			d += averageDegrees;
		}
		
	}
	
	public static void main(String[] args)
	{
		// Declare the initial variables, m is the number of branches per order and n is how many orders/levels of branches/trunks will be drawn.
		int m = 7, n = 5;
		double penRadius = 0.03;
		double trunkLength = 200;
		double degrees = 0;
		
		setBackground();
		draw(m, n, penRadius, trunkLength, WINDOW_SIZE / 2, WINDOW_SIZE / 4, degrees);
	}
}
