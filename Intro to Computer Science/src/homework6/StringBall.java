package homework6;

import edu.princeton.cs.introcs.StdDraw;

public class StringBall
{
	public static int WINDOW_WIDTH = 200;
	public static int WINDOW_HEIGHT = 200;
   
	public static double SPRING_CONSTANT = 1.0;
	public static double PIXEL_PER_METER = 5.0;
   
	public static int POSTX = 20;
	public static int POSTY = 20;
   
	public static int FRAMERATE = 50;
	public static double TIMESTEP = 1.0 / FRAMERATE;
   
	public Ball b;
	public Ball post;
   
	public StringBall(double ballx, double bally, double ballVx, double ballVy, double ballRadius, int ballR, int ballG, int ballB, double ballMass) 
	{
		b = new Ball(ballx, bally, ballVx, ballVy, ballRadius, ballR, ballG, ballB);
		b.setMass(ballMass);
		post = new Ball(POSTX, POSTY, 0, 0, ballRadius / 2.0, 255, 0, 0);
	}
   
   
	public void draw()
	{
		StdDraw.clear();
		b.draw(PIXEL_PER_METER);
     
		post.draw(PIXEL_PER_METER);
     
     
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(0.02);
		StdDraw.line(post.x * PIXEL_PER_METER, post.y * PIXEL_PER_METER, b.x * PIXEL_PER_METER, b.y * PIXEL_PER_METER);
		StdDraw.setPenRadius();
		StdDraw.show((int)(1000 * TIMESTEP));
	}
   
	public double distance() 
	{
		double dx = b.x - post.x;
		double dy = b.y - post.y;
     
		return Math.sqrt(dx*dx + dy*dy);
	}
   
	public double springForce(double k)
	{
		return distance() * k;
	}
   
	public double computeAcceleration(double k)
	{
		double a;
		a = springForce(k) / b.mass;
    	return a;
	}
   
   
   
	public double computeAx(double a) 
	{
		double dx = post.x - b.x;
		return a * dx / distance();
	}
   
	public double computeAy(double a) 
	{
		double dy = post.y - b.y;
		return a * dy / distance();
	}
   
	public void update(double k, double timestep)
	{
 
		b.updatePosition(timestep);
		double a = computeAcceleration(SPRING_CONSTANT);
		double ax = computeAx(a);
		double ay = computeAy(a);
     
		b.updateVelocity(ax, ay, timestep);
     
	}
	
		public static void main(String[] args) 
		{
			double x = 25 , y = 10;
			   
			double v_x = 10, v_y = 10.0;
			   
			StdDraw.setXscale(0, WINDOW_WIDTH);
			StdDraw.setYscale(0, WINDOW_HEIGHT);
			   
			StringBall sb = new StringBall(x, y, v_x, v_y, 10, 0, 0, 255, 0.2);
			   
			while (true) 
			{    
			    sb.draw();    
			    sb.update(SPRING_CONSTANT, TIMESTEP);
			}
		}
}