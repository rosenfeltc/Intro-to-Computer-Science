/* This is the Body class and the relevant methods of the class required for the proper execution of EarthMoon and SolarSystem. 
 * Coded by Christopher Rosenfelt for CSI/CEN 201 on 06/20/2017.
 */
package lab2;

import edu.princeton.cs.introcs.*;

public class Body 
{	
	// Instance variables of the Body class
	public double mass;
	public double x;
	public double y;
	public double vx;
	public double vy;
	public int radius;
	public int red;
	public int green;
	public int blue;
	
	public Body(double m, double xPosition, double yPosition, double xVelocity, double yVelocity, int pixelRadius, int r, int g, int b)
	{
		mass = m;
		x = xPosition;
		y = yPosition;
		vx = xVelocity;
		vy = yVelocity;
		radius = pixelRadius;
		red = r;
		green = g;
		blue = b;
	}
	// Update the position of the body with velocity and timestep
	public void updatePosition(double timestep)
	{
		x = x + vx * timestep;
		y = y + vy * timestep;
	}
	// Draw the body after converting meters to pixels
	public void draw(double cx, double cy, double pxm)
	{
		StdDraw.setPenColor(red, green,blue);
		StdDraw.filledCircle(x * pxm + cx , y * pxm + cy, radius);	
	}
	// Update the velocity of the body with the calculated acceleration and timestep
	public void updateVelocity(double ax, double ay, double timestep)
	{
		vx = vx + ax * timestep;
		vy = vy + ay * timestep;
	}
}
