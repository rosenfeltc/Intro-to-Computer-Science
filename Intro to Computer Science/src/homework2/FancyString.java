/* This is String Art, A.K.A. Fancy String as drawn by Christopher Rosenfelt for CSI/CEN 201 on 06/04/2017.*/
package homework2;

import edu.princeton.cs.introcs.*;
public class FancyString 
{

	// Change background color to black and adjust canvas parameters
	public static void drawBackground()
	{
		StdDraw.setCanvasSize(1200, 1200);
		StdDraw.setXscale(0, 400);
		StdDraw.setYscale(0, 400);
		StdDraw.clear(StdDraw.BLACK);
	}
	
	// Draw the Sticks
	public static void drawStick(double x1, double y1, double x2, double y2)
	{
		// First let's make sure the sticks are within the canvas boundaries
		if ((x1 < 0 || x1 > 400) || (x2 < 0 || x2 > 400) ||
			(y1 < 0 || y1 > 400) || (y2 < 0 || y2 > 400))
		{
			System.out.println("Invalid stick inputs! Please keep the sticks within the canvas boundaries (0 - 400)");
			System.exit(1);
		}
		
		// Draw the sticks
		StdDraw.setPenRadius(.018);
		StdDraw.setPenColor(139, 69, 19); // Brown
		StdDraw.line(x1, y1, x2, y2);
	}

	// Draw the Fancy String Art
	public static void drawString(double stickAx1, double stickAy1, double stickAx2, double stickAy2,
		double stickBx1, double stickBy1, double stickBx2, double stickBy2, int strings)
	{
		// Make sure the number of strings is appropriate i.e. 50 or less
		if(strings > 50)
		{
			System.out.println("Too many strings requested. Please adjust string number to no greater than 50!");
			System.exit(2);
		}
		
		// Draw Sticks
		drawStick(stickAx1, stickAy1, stickAx2, stickAy2);
		drawStick(stickBx1, stickBy1, stickBx2, stickBy2);
		
		// Draw the Strings
		StdDraw.setPenRadius(.006);
		
		// Create interval variable as well counter/f variable
		double interval = 1.0 / (strings-1);
		int i = 0; // Counter variable which will be used in conjunction with interval to move strings along the sticks
		
		// Create variables that account for the differences between the x values and the y values of each stick
		double differenceAx = stickAx2 - stickAx1;
		double differenceAy = stickAy2 - stickAy1;
		double differenceBx = stickBx1 - stickBx2;
		double differenceBy = stickBy1 - stickBy2;
		
		while (i < strings)
		{
			// String Color
			int color = (int) (interval * i * 255);
			StdDraw.setPenColor(0 + color , 0, 255 - color);
			
			// Draw each string
			StdDraw.line(stickAx1 + i * interval * differenceAx, stickAy1 + i * interval * differenceAy,
					stickBx2 + i * interval * differenceBx , stickBy2 + i * interval * differenceBy);
			i++;
		}
	}
	
	public static void main(String[] args)
	{
		// Assign the variables needed
		double stickAx1 = 75, stickAy1 = 175;
		double stickAx2 = 50, stickAy2 = 350;
		double stickBx1 = 200, stickBy1 = 75;
		double stickBx2 = 325, stickBy2 = 250;
		int strings = 50;
		
		// Prepare canvas and background
		drawBackground();
		
		// Draw the string art
		drawString(stickAx1, stickAy1, stickAx2, stickAy2, stickBx1, stickBy1, stickBx2, stickBy2, strings);
		
	}

}
