package miscellaneous;

import edu.princeton.cs.introcs.*;

public class Ball
{
	private double EARTH_GRAVITY_ACCELERATION = -9.8;
	public double x;
	public double y;
	public double vx;
	public double vy;
	public double r;
	
	public int red;
	public int blue;
	public int green;
	
	public Ball(double startX, double startY, double startVX, double startVY, double radius)
	{
		x = startX;
		y = startY;
		vx = startVX;
		vy = startVY;
		r = radius;
		
		int red = 128;
		int blue = 128;
		int green = 128;
	}
	
	public Ball(double startX, double startY, double startVX, double startVY, double radius, int startRed, int startGreen, int startBlue)
	{
		x = startX;
		y = startY;
		vx = startVX;
		vy = startVY;
		r = radius;
		red = startRed;
		green = startGreen;
		blue = startBlue;
	}
	
	public void updatePosition(double timeStep)
	{
		x = x + timeStep * vx;
		y = y + timeStep * vy;
	}
	
	public void updateVelocity(double timeStep)
	{
		vy = vy + timeStep * EARTH_GRAVITY_ACCELERATION;
	}
	
	public void animateStep(double timeStep)
	{
		updatePosition(timeStep);
		updateVelocity(timeStep);
	}
	
	public void draw()
	{
		StdDraw.setPenColor(red, green, blue);
		StdDraw.filledCircle(x, y, r);
	}
}
