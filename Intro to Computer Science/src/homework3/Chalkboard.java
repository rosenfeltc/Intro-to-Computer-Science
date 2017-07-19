/* This is a chalkboard with multiple colors available as well as the ability to clear the drawing. Coded by
 *  Christopher Rosenfelt for CSI/CEN 201 on 06/07/2017.
 */
package homework3;

import edu.princeton.cs.introcs.*;

public class Chalkboard
{
	// Prepare the canvas, the x & y scale, background, and pen
	public static void prepareChalkboard()
	{
		StdDraw.setCanvasSize(1000, 1000);
		StdDraw.setXscale(0, 400);
		StdDraw.setYscale(0, 400);
		StdDraw.clear(StdDraw.BLACK);
		StdDraw.setPenRadius(0.005);;
		StdDraw.setPenColor(StdDraw.WHITE);
	}
	
	// Are keys being pressed
	public static void keysBeingPressed()
	{
		// Color of the pen or new background
		boolean isRed = false;
		boolean isWhite = false;
		boolean isYellow = false;
		boolean isBlue = false;
		boolean isGreen = false;
		boolean isClear = false;
		
		isRed = StdDraw.isKeyPressed(82);
		isWhite = StdDraw.isKeyPressed(87);
		isYellow = StdDraw.isKeyPressed(89);
		isBlue = StdDraw.isKeyPressed(66);
		isGreen = StdDraw.isKeyPressed(71);
		isClear = StdDraw.isKeyPressed(67);
		
		if(isRed)
		{
			StdDraw.setPenColor(StdDraw.RED);
		}
		else if(isWhite)
		{
			StdDraw.setPenColor(StdDraw.WHITE);
		}
		else if(isYellow)
		{
			StdDraw.setPenColor(StdDraw.YELLOW);
		}
		else if(isBlue)
		{
			StdDraw.setPenColor(StdDraw.BLUE);
		}
		else if(isGreen)
		{
			StdDraw.setPenColor(StdDraw.GREEN);
		}
		else if(isClear)
		{
			StdDraw.clear(StdDraw.BLACK);
		}
	}
	
	public static void main(String[] args) 
	{
		// Initialize and assign the variables that will be needed
		// Mouse clicks
		boolean oldIsMousePressed = false;
		boolean newIsMousePressed = false;
		// Coordinates of the mouse
		double oldX = 0; 
		double oldY = 0;
		double newX = 0;
		double newY = 0;				
		
		prepareChalkboard();
		
		// Start drawing!
		while(true)
		{
			// Are any keys being pressed?
			keysBeingPressed();
			newIsMousePressed = StdDraw.mousePressed();
			
			// Drawing the line
			if(!oldIsMousePressed && newIsMousePressed)
			{
				oldX = StdDraw.mouseX();
				oldY = StdDraw.mouseY();
				oldIsMousePressed = true;
			}
			else if (oldIsMousePressed && newIsMousePressed)
			{
				newX = StdDraw.mouseX();
				newY = StdDraw.mouseY();
				StdDraw.line(oldX, oldY, newX, newY);
				
				//Keep updating the x,y ponts to draw the line
				oldX = newX;
				oldY = newY;
			}
			else if (oldIsMousePressed && !newIsMousePressed)
			{
				newX = StdDraw.mouseX();
				newY = StdDraw.mouseY();
				StdDraw.line(oldX, oldY, newX, newY);
				oldIsMousePressed = false;
			}
			
			StdDraw.show(20);
		}
	}
}
