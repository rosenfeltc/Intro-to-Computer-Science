/* This is the System class and the relevant methods of the class required for the proper execution of EarthMoon and SolarSystem. 
 * Coded by Christopher Rosenfelt for CSI/CEN 201 on 06/20/2017.
 */
package lab2;

import java.util.ArrayList;
import edu.princeton.cs.introcs.*;

public class System
{	
	ArrayList<Body> bodies;
	// Initialize the ArrayList that the bodies will be added to
	public System()
	{
		bodies = new ArrayList<Body>();
	}
	// Return the array list in order to use the contents of the list
	public ArrayList<Body> getList()
	{
		return bodies;
	}
	// New black screen and call the draw function of each body in the list
	public void draw(double cx, double cy, double pxm)
	{
		StdDraw.clear(StdDraw.BLACK);
		for (int i = 0; i < bodies.size(); i++)
		{
			bodies.get(i).draw(cx, cy, pxm);
		}
	}
	// Compute the acceleration of both x and y for each body
	public double[] computeAcceleration(Body A, double[] acceleration, double gc)
	{
		double totalAcceleration;
		double distance;
		{
			for (int i = 0; i < bodies.size(); i++)
			{
				if (A != bodies.get(i))
				{
					distance = (Math.sqrt((A.x - bodies.get(i).x)*(A.x - bodies.get(i).x) + (A.y - bodies.get(i).y)*(A.y - bodies.get(i).y)));
					totalAcceleration = (gc * bodies.get(i).mass) / (distance * distance);
					// Use the total acceleration of each body with the other body to then compute the total acceleration of x and y
					acceleration[0] += totalAcceleration * (bodies.get(i).x - A.x) / distance;
					acceleration[1] += totalAcceleration * (bodies.get(i).y - A.y) / distance;
				}
			}
			
			return acceleration;
		}
	}
	// Update the position and the velocity of the body
	public void update(double timestep, double gc)
	{	
		for (int i = 0; i < bodies.size(); i++)
		{
			double[] acceleration = new double[2];
			bodies.get(i).updatePosition(timestep);
			acceleration = computeAcceleration(bodies.get(i), acceleration, gc);
			bodies.get(i).updateVelocity(acceleration[0], acceleration[1], timestep);
		}
	}
	
}
