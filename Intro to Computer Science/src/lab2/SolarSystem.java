/* This is the SolarSystem class that calls on the System and Body classes for the proper execution of the Moon orbiting around the Earth. 
 * Coded by Christopher Rosenfelt for CSI/CEN 201 on 06/20/2017.
 */
package lab2;

import edu.princeton.cs.introcs.StdDraw;

public class SolarSystem 
{
	// Declare some constants that will be used for future calculations
	public static int WINDOW_WIDE = 400;
	public static int WINDOW_HEIGHT = 400;
	public static double TIMESCALE = 1000000 / 30;
	public static double PIXELS_PER_METER = 5.0 / 1e10;
	public static double GRAVITATIONAL_CONSTANT = 6.67384e-11;
	
	// Masses of the sun and planets
	public static double SUN_MASS = 1.98892e30;
	public static double EARTH_MASS = 5.9736e24;
	public static double MERCURY_MASS = 0.055 * EARTH_MASS;
	public static double VENUS_MASS = 0.81 * EARTH_MASS;
	public static double MARS_MASS = 0.108 * EARTH_MASS;
	public static double JUPITER_MASS = 317.83 * EARTH_MASS;
	public static double SATURN_MASS = 95 * EARTH_MASS;
	public static double URANUS_MASS = 14.5 * EARTH_MASS;
	public static double NEPTUNE_MASS = 17.14 * EARTH_MASS;
	
	// Distances of the planets from the sun
	public static double AU = 1.49598e11;
	public static double MERCURY_DISTANCE = 0.3871 * AU;
	public static double VENUS_DISTANCE = 0.7233 * AU;
	public static double MARS_DISTANCE = 1.524 * AU;
	public static double JUPITER_DISTANCE = 5.203 * AU;
	public static double SATURN_DISTANCE = 9.539 * AU;
	public static double URANUS_DISTANCE = 19.19 * AU;
	public static double NEPTUNE_DISTANCE = 30.06 * AU;
	
	// Average velocities of the planets
	public static double MERCURY_VELOCITY = 48000;
	public static double VENUS_VELOCITY = 35000;
	public static double EARTH_VELOCITY = 29790;
	public static double MARS_VELOCITY = 24140;
	public static double JUPITER_VELOCITY = 13060;
	public static double SATURN_VELOCITY = 9640;
	public static double URANUS_VELOCITY = 6810;
	public static double NEPTUNE_VELOCITY = 5430;
	
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
		Body sun = new Body(SUN_MASS, 0, 0, 0, 0, 20, 253, 184, 19);
		Body mercury = new Body(MERCURY_MASS, MERCURY_DISTANCE, 0, 0, MERCURY_VELOCITY, 2, 230, 230, 255);
		Body venus = new Body(VENUS_MASS, VENUS_DISTANCE, 0, 0, VENUS_VELOCITY, 5, 255, 255, 224);
		Body earth = new Body(EARTH_MASS, AU, 0, 0, EARTH_VELOCITY, 6, 0, 0, 255);
		Body mars = new Body(MARS_MASS, MARS_DISTANCE, 0, 0, MARS_VELOCITY, 4, 244, 164, 96);
		Body jupiter = new Body(JUPITER_MASS, JUPITER_DISTANCE, 0, 0, JUPITER_VELOCITY, 15, 255, 204, 153);
		Body saturn = new Body(SATURN_MASS, SATURN_DISTANCE, 0, 0, SATURN_VELOCITY, 13, 230, 190, 138);
		Body uranus = new Body(URANUS_MASS, URANUS_DISTANCE, 0, 0, URANUS_VELOCITY, 10, 0, 0, 205);
		Body neptune = new Body(NEPTUNE_MASS, NEPTUNE_DISTANCE, 0, 0, NEPTUNE_VELOCITY, 8, 30, 144, 255);
		
		
		// Initialize the system that the bodies will be added to
		System bodies = new System();
		
		// Add the bodies to the system
		bodies.getList().add(sun);
		bodies.getList().add(mercury);
		bodies.getList().add(venus);
		bodies.getList().add(earth);
		bodies.getList().add(mars);
		bodies.getList().add(jupiter);
		bodies.getList().add(saturn);
		bodies.getList().add(uranus);
		bodies.getList().add(neptune);
		
		// Orbit forever with an infinite loop!
		while(true)
		{
			bodies.draw(WINDOW_WIDE / 2, WINDOW_HEIGHT / 2, PIXELS_PER_METER);
			bodies.update(TIMESCALE, GRAVITATIONAL_CONSTANT);
			StdDraw.show(20);
		}
	}
}
