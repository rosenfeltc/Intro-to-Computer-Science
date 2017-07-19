package miscellaneous;

import edu.princeton.cs.introcs.*;

public class SmileTranslate {
	
	public static void draw(int x, int y, double radius) {
	    
		if((x - radius) < 0)
		{
			System.out.println("You are trying to draw outside the canvas!!!");
			return;
		}
		else if((x + radius) > 200)
		{
			System.out.println("You are trying to draw outside the canvas!!!");
			return;
		}
		else if((y - radius) < 0)
		{
			System.out.println("You are trying to draw outside the canvas!!!");
			return;
		}
		else if((y + radius) > 200)
		{
			System.out.println("You are trying to draw outside the canvas!!!");
			return;
		}
	     
	    StdDraw.setXscale(0, 200);
	    StdDraw.setYscale(0, 200);
	     
	    //draw the outline of the face;
	    StdDraw.setPenColor(StdDraw.YELLOW);
	    StdDraw.filledCircle(x, y, radius);
	     
	    StdDraw.setPenColor(StdDraw.BLACK);
	    StdDraw.circle(x, y, radius);
	   
	    //draw the mouth;
	    StdDraw.setPenRadius(0.01 / 50 * radius);
	    StdDraw.setPenColor(StdDraw.BLACK);
	    StdDraw.circle(x, y, 3 / 5.0 * radius); 
	     
	    StdDraw.setPenRadius();
	    StdDraw.setPenColor(StdDraw.YELLOW);
	    StdDraw.filledRectangle(x, y + (13 / 50.0 * radius), 32 / 50.0 * radius, 22 / 50.0 * radius);
	     
	    //draw eyes;
	    StdDraw.setPenColor(StdDraw.BLACK);
	    StdDraw.filledCircle(x - (20 / 50.0 * radius), y + (10 / 50.0 * radius), 5 / 50.0 * radius);
	    StdDraw.filledCircle(x + (20 / 50.0 * radius), y + (10 / 50.0 * radius), 5 / 50.0 * radius);
	     
	    StdDraw.show();
	     
	  }
	   
	  public static void main(String[] args) {
	  
		draw(100, 50, 50);
	  }
	
}
