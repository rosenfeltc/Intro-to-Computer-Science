/*This is lab1, the creation of the game Pong by Christopher Rosenfelt for CSI/CEN 201 on 06/09/2017
 * The ball starts moving at a slow speed however it increases speed as the game goes on.*/
package lab1;

import edu.princeton.cs.introcs.*;

public class Pong
{
	public static void prepareScreen(double min, double max)
	{
		StdDraw.setXscale(min, max);
		StdDraw.setYscale(min, max);
	}
			
	public static void startGame(double leftPaddleX, double leftPaddleY, double rightPaddleX,
								 double rightPaddleY, double wide, double height, double ballX, double ballY, double radius)
	{
		// Create the background
		StdDraw.clear(StdDraw.YELLOW);
		
		// Create the paddles
		StdDraw.setPenColor(StdDraw.BOOK_RED);
		StdDraw.filledRectangle(leftPaddleX, leftPaddleY, wide, height);
		StdDraw.filledRectangle(rightPaddleX, rightPaddleY, wide, height);
		
		// Create the ball
		StdDraw.setPenColor(StdDraw.GRAY);
		StdDraw.filledCircle(ballX, ballY, radius);
	}
	
	public static double leftPaddle(double paddleX, double paddleY, double wide, double height, double move)
	{
		if(paddleY == 472) //Upper boundary
		{
			if(StdDraw.isKeyPressed(90)) // z key to move down
			{
				paddleY -= move;
			}
		}
		else if(paddleY == 40) // Lower boundary
		{
			if(StdDraw.isKeyPressed(65)) // a key to move up
			{
				paddleY += move;
			}
		}	
		else //Unbounded
		{
			if(StdDraw.isKeyPressed(65)) // a key to move up
				{
					paddleY += move;
				}
			else if(StdDraw.isKeyPressed(90)) // z key to move down
				{
					paddleY -= move;
				}
		}
		
		StdDraw.filledRectangle(paddleX, paddleY, wide, height); // Draw the paddle in its new position
		
		return paddleY;
	}
	
	public static double rightPaddle(double paddleX, double paddleY, double wide, double height, double move)
	{
		if(paddleY == 472) // Upper boundary
		{
			if(StdDraw.isKeyPressed(77)) // m key to move down
			{
				paddleY -= move;
			}
		}
		else if(paddleY == 40) // Lower boundary
		{
			if(StdDraw.isKeyPressed(75)) // k key to move up
			{
				paddleY += move;
			}
		}
		else // Unbounded
		{
			if(StdDraw.isKeyPressed(75)) // k key to move up
			{
				paddleY += move;
			}
			else if(StdDraw.isKeyPressed(77)) // m key to move down
			{
				paddleY -= move;
			}
		}
		
		StdDraw.filledRectangle(paddleX, paddleY, wide, height); // Draw the paddle in its new position
		
		return paddleY;
	}
	
	public static boolean goingEast(double ballX, double ballY, double radius, double rightPaddleX, double rightPaddleY, double leftPaddleX,
									double leftPaddleY, double wide, double height, boolean east)
	{
		if(ballY - radius <= rightPaddleY + height && ballY + radius >= rightPaddleY - height) // Make sure ball is reachable and struck by right paddle
		{
			if(ballX + radius >= rightPaddleX - wide)
			{
				east = !east;
			}
		}
		if(ballY - radius <= leftPaddleY + height && ballY + radius >= leftPaddleY - height) //Make sure ball is reachable and struck by the left paddle
		{
			if(ballX - radius <= leftPaddleX + wide)
			{
				east = !east;
			}
		}
		
		return east;
	}
	
	public static boolean goingNorth(double ballY, double radius, double min, double max, boolean north)
	{
		if(ballY + radius >= max || ballY - radius <=min) // If ball hits upper or lower screen change the y axis direction
		{
			north = !north;
		}
		
		return north;
	}
	
	public static double moveBallX(double ballX, double move, boolean east) // Update the ball's movement along the X axis
	{
		if (east)
		{
			ballX += move;
		}
		else
		{
			ballX -= move;
		}
		
		return ballX;
	}
	
	public static double moveBallY(double ballY, double move, boolean north) // Update the ball's movement along the Y axis
	{
		if (north)
		{
			ballY += move;
		}
		else
		{
			ballY -= move;
		}
		
		return ballY;
	}
	
	public static void drawBall(double ballX, double ballY, double radius) // Draw the new location of the ball
	{
		StdDraw.setPenColor(StdDraw.GRAY);
		StdDraw.filledCircle(ballX, ballY, radius);
	}
	public static boolean gameOver (double x, double radius, double min, double max) // What happens if ball crosses the vertical boundaries
	{
		if (x + radius >= max || x - radius <= min)
		{
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		// Define Constants
		double WINDOWMIN = 0;
		double WINDOWMAX = 512;
		double LEFTPADDLEX = 10;
		double RIGHTPADDLEX = 502;
		double PADDLEWIDTH = 10;
		double PADDLEHEIGHTH = 40;
		double PADDLEMOVEMENT = 9;
		double BALLRADIUS = 5;
		
		// Define Variables
		boolean gameOn = true;
		double leftPaddleY = 472;
		double rightPaddleY = 40;
		double ballX = WINDOWMAX / 2;
		double ballY = WINDOWMAX / 2;
		double ballMovement = 1;
		boolean east = true;
		boolean north = true;
		
		prepareScreen(WINDOWMIN, WINDOWMAX);
		
		startGame(LEFTPADDLEX, leftPaddleY, RIGHTPADDLEX, rightPaddleY, PADDLEWIDTH, PADDLEHEIGHTH,
				  ballX, ballY, BALLRADIUS);
		
		while(gameOn)
		{
			if(StdDraw.isKeyPressed(81)) // q key to exit
			{
				System.exit(-1);
			}
			else if(StdDraw.isKeyPressed(32)) // Spacebar to start a new game
			{
				// Reinitialize variables
				gameOn = true;
				leftPaddleY = 472;
				rightPaddleY = 40;
				ballX = WINDOWMAX / 2;
				ballY = WINDOWMAX / 2;
				ballMovement = 1;
				east = true;
				north = true;
				
				startGame(LEFTPADDLEX, leftPaddleY, RIGHTPADDLEX, rightPaddleY, PADDLEWIDTH, PADDLEHEIGHTH,
						  ballX, ballY, BALLRADIUS);
				continue;
			}
			
			StdDraw.clear(StdDraw.YELLOW); // Movement by creating new drawings
			
			// Keeping track of the paddles
			StdDraw.setPenColor(StdDraw.BOOK_RED);
			leftPaddleY = leftPaddle(LEFTPADDLEX, leftPaddleY, PADDLEWIDTH, PADDLEHEIGHTH, PADDLEMOVEMENT);
			rightPaddleY = rightPaddle(RIGHTPADDLEX, rightPaddleY, PADDLEWIDTH, PADDLEHEIGHTH, PADDLEMOVEMENT);
			
			// Keeping track of the balls direction
			east = goingEast(ballX, ballY, BALLRADIUS, RIGHTPADDLEX, rightPaddleY,LEFTPADDLEX,
			leftPaddleY, PADDLEWIDTH, PADDLEHEIGHTH, east);
			north = goingNorth(ballY, BALLRADIUS, WINDOWMIN, WINDOWMAX, north);
			
			// Move the ball
			ballX = moveBallX(ballX, ballMovement, east);
			ballY = moveBallY(ballY, ballMovement, north);
			drawBall(ballX, ballY, BALLRADIUS);
			
			// Did the ball cross the vertical boundaries?
			gameOn = gameOver(ballX, BALLRADIUS, WINDOWMIN, WINDOWMAX);
			
			if(gameOn)
			{
				StdDraw.show(20);
			}
			else
			{
				// Game over
				while(!gameOn)
				{
					// Game over screen
					StdDraw.clear(StdDraw.BLACK);
					StdDraw.setPenColor(StdDraw.RED);
					StdDraw.text(256, 256, "GAME OVER");
					StdDraw.show(20);
				
					if(StdDraw.isKeyPressed(32)) // Spacebar to start a new game
					{
						// Reinitialize variables
						gameOn = true;
						leftPaddleY = 472;
						rightPaddleY = 40;
						ballX = WINDOWMAX / 2;
						ballY = WINDOWMAX / 2;
						ballMovement = 1;
						east = true;
						north = true;
						startGame(LEFTPADDLEX, leftPaddleY, RIGHTPADDLEX, rightPaddleY, PADDLEWIDTH, PADDLEHEIGHTH,
								  ballX, ballY, BALLRADIUS);
						continue;
					}
					else if(StdDraw.isKeyPressed(81)) // q key to exit
					{
						System.exit(-1);
					}
				}
			}
			
			// Keep increasing ball speed for harder difficulty
			ballMovement += .005;
		}
		
	}
}
