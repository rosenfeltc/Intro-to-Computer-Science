package miscellaneous;

import edu.princeton.cs.introcs.*;

public class PsychBoxes 
{
	public static int WINDOWSIZE = 200;
	public static int BOXTHICKNESS = 4;
   
	public static int drawBoxes(int iteration)
	{
		StdDraw.clear();
     
		int boxNumber = 1;
		int size = WINDOWSIZE;
		while (size > 0)
		{
			if ((boxNumber + iteration) % 4 == 0)
			{
				StdDraw.setPenColor(StdDraw.RED);
			} 
			else if ((boxNumber + iteration) % 4 == 1)
			{
				StdDraw.setPenColor(StdDraw.BLUE);
			} 
			else if ((boxNumber + iteration) % 4 == 2)
			{
				StdDraw.setPenColor(StdDraw.GREEN);
			} 
			else 
			{
				StdDraw.setPenColor(StdDraw.YELLOW);
			}
       
			StdDraw.filledRectangle(WINDOWSIZE, WINDOWSIZE, size, size);
       
			boxNumber += 1;
			size -= 2 * BOXTHICKNESS;
       
		}
     
		iteration = (iteration - 1) % 4;
		return iteration;
     
	}
   
	public static void main(String[] args)
	{
		StdDraw.setXscale(0, 2*WINDOWSIZE);
		StdDraw.setYscale(0, 2*WINDOWSIZE);
     
		int iteration = 0;
     
		while (true) 
		{
			iteration = drawBoxes(iteration);
			StdDraw.show(20);
		}
     
	}
 
}