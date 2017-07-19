package miscellaneous;

public class Point 
{
	public double x;
	public double y;
	
	public Point(double px, double py)
	{
		x = px;
		y = py;
	}
	
	// Question 1
	public static double calculateDistance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
	
	// Question 2
	public double calculateDistance(double x1, double y1)
	{
		return Math.sqrt((x1 - x) * (x1 -x) + (y1 - y) * (y1 - y));
	}
	
	// Question 3
	public double calculateDistance(Point a)
	{
		return Math.sqrt((a.x - x) * (a.x - x) + (a.y - y) * (a.y - y));
	}
	
	// Question 4
	public void quadrant()
	{
		if(x > 0 && y > 0)
		{
			System.out.println("First Quadrant");
		}
		else if(x < 0 && y > 0)
		{
			System.out.println("Second Quadrant");
		}
		else if(x < 0 && y < 0)
		{
			System.out.println("Third Quadrant");
		}
		else if(x > 0 && y < 0)
		{
			System.out.println("Fourth Quadrant");
		}
		else if(x > 0)
		{
			System.out.println("X-Axis");
		}
		else if(y > 0)
		{
			System.out.println("Y-Axis");
		}
		else
		{
			System.out.println("Origin");
		}
	}
	
	// Question 5
	public boolean inCircle(Circle c)
	{
		double distance = Math.sqrt((x - c.cx) * (x - c.cx) + (y - c.cy) * (y - c.cy));
		
		if(distance < c.radius)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
