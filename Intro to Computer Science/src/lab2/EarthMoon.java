/* This is the EarthMoon class that calls on the System and Body classes for the proper execution of the Moon orbiting around the Earth. 
 * Coded by Christopher Rosenfelt for CSI/CEN 201 on 06/20/2017.
 */
package lab2;

import edu.princeton.cs.introcs.StdDraw;

public class EarthMoon 
{
	// Declare some constants that will be used for future calculations
	public static int WINDOW_WIDE = 400;
	public static int WINDOW_HEIGHT = 400;
	public static double EARTH_MASS = 5.9736e24;
	public static double MOON_MASS = 7.3477e22;
	public static double MOON_DISTANCE = 3.844e8;
	public static double MOON_VELOCITY = 1022;
	public static double TIMESCALE = 100000 / 30;
	public static double PIXELS_PER_METER = 3.0 / 1e7;
	public static double GRAVITATIONAL_CONSTANT = 6.67384e-11;
	
	// Method that prepares the canvas on which the moon will orbit the earth
	public static void start()
	{
		StdDraw.setCanvasSize(1000, 1000);
		StdDraw.setXscale(0, WINDOW_WIDE);
		StdDraw.setYscale(0, WINDOW_HEIGHT);
	}
	
	public static void main(String[] args)
	{
		start();
		
		// Initialize the bodies that will be necessary for our system
		Body earth = new Body(EARTH_MASS, 0, 0, 0, 0, 20, 0, 0, 255);
		Body moon = new Body(MOON_MASS, MOON_DISTANCE, 0, 0, MOON_VELOCITY, 5, 255, 255, 255 );
		
		// Initialize the system that the bodies will be added to
		System bodies = new System();
		
		// Add the bodies to the system
		bodies.getList().add(earth);
		bodies.getList().add(moon);
		
		// Orbit forever with an infinite loop!
		while(true)
		{
			bodies.draw(WINDOW_WIDE / 2, WINDOW_HEIGHT / 2, PIXELS_PER_METER);
			bodies.update(TIMESCALE, GRAVITATIONAL_CONSTANT);
			StdDraw.show(20);
		}
	}
}
