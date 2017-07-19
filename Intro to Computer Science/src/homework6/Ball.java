package homework6;

import edu.princeton.cs.introcs.StdDraw;
 
public class Ball 
{
	public double x;
	public double y;
	public double vx;
	public double vy;
	public double radius;
	public double mass;
   
   
	public int R;
	public int G;
	public int B;
   
   
	public Ball(double px, double py, double ivx, double ivy, double pradius, int r, int g, int b) 
	{
		x = px;
		y = py;
		vx = ivx;
		vy = ivy;
		radius = pradius;
     
		R = r;
		G = g;
		B = b;
	}
   
	public void setMass(double m) 
	{
		mass = m;
	}
   
	public void draw(double PIXEL_PER_METER)
	{
		StdDraw.setPenColor(R, G, B);
		StdDraw.filledCircle(x * PIXEL_PER_METER, y * PIXEL_PER_METER, radius);
     
	}
   
   
   
	public void updatePosition(double timestep) 
	{
		x = x + vx * timestep;
		y = y + vy * timestep;
	}
   
	public void updateVelocity(double ax, double ay, double timestep) 
	{
		vx = vx + ax * timestep;
		vy = vy + ay * timestep;
	}
}