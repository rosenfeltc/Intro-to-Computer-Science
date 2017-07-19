package miscellaneous;

import edu.princeton.cs.introcs.*;
public class GrowingCircle 
{

	public static void main(String[] args) 
	{
		StdDraw.setXscale(0, 400);
		StdDraw.setYscale(0, 400);
		Boolean touch = false;
		double radius = 1;
		
		while (true) 
		{
		
		  StdDraw.clear();
		  StdDraw.filledCircle(200, 200, radius);
		  
		  if(radius == 200 || radius == 0)
		  {
			  touch = !touch;
		  }
		  if(touch)
		  {
			  radius -=1;
		  }
		  else
		  {
		  radius += 1;
		  }
		  StdDraw.show(20);
		}
	}
}
