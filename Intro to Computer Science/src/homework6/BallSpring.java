package homework6;

import edu.princeton.cs.introcs.StdDraw;

public class BallSpring 
{
  static int WINDOW_WIDTH = 200;
  static int WINDOW_HEIGHT = 200;
   
  static int FLOOR_Y = 50;
  static int CEILING_Y = WINDOW_HEIGHT - FLOOR_Y;
  static int BALL_RADIUS = 10;
  static double BALL_MASS = 0.2;
   
  static double PIXEL_PER_METER = 5.0;
   
  static double EARTH_GRAVITY_ACC = - 9.8;
   
  static double SPRING_CONSTANT = 1.0;
   
  static int POST_X = 20;
  static int POST_Y = 20;
   
  static int FRAME_RATE = 60;
  static double TIMESTEP = 1.0 / FRAME_RATE;
   
  public static void drawBall(double x, double y) 
  {
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.filledCircle(x * PIXEL_PER_METER, 
        y * PIXEL_PER_METER, BALL_RADIUS);
  }
   
  public static void drawSpring(double x, double y) 
  {
    StdDraw.setPenRadius(0.02);
    StdDraw.setPenColor(StdDraw.BLACK);
     
    double xPixels = x * PIXEL_PER_METER;
    double yPixels = y * PIXEL_PER_METER;
    double pxPixels = POST_X * PIXEL_PER_METER;
    double pyPixels = POST_Y * PIXEL_PER_METER;
     
    StdDraw.line(pxPixels, pyPixels, xPixels, yPixels);
     
    StdDraw.setPenColor(StdDraw.RED);
    StdDraw.filledCircle(pxPixels, pyPixels, BALL_RADIUS / 2);
  }
   
  public static double nextPosition(double position, double velocity, double timeStep) 
  {
    return position + velocity * timeStep;
  }
   
  public static double nextVelocity(double velocity, double acc, double timestep) 
  {
    return velocity + acc * timestep;
  }
   
  public static double distance(double x1, double y1, double x2, double y2) 
  {
    double dx = x1 - x2;
    double dy = y1 - y2;
     
    return Math.sqrt(dx*dx + dy*dy);
  }
   
  public static double springForce(double x1, double y1, double x2, double y2, double k) 
  {
    return distance(x1, y1, x2, y2) * k;
  }
   
  public static void main(String[] args) 
  {
    double x = 25 , y = 10;
     
    double v_x = 10, v_y = 10.0;
    StdDraw.setXscale(0, WINDOW_WIDTH);
    StdDraw.setYscale(0, WINDOW_HEIGHT);
     
    double f = 0;
    double a = 0;
    double d = 0;
    double dir_x = 0;
    double dir_y = 0;
    double a_x = 0;
    double a_y = 0;
     
    while (true) 
    {
       
      StdDraw.clear(StdDraw.WHITE);
      drawBall(x, y);
      drawSpring(x, y);
       
      x = nextPosition(x, v_x, TIMESTEP);
      y = nextPosition(y, v_y, TIMESTEP);
       
      f = springForce(POST_X, POST_Y, x, y, SPRING_CONSTANT);
       
      a = f / BALL_MASS;
      System.out.println(a);
      d = distance(POST_X, POST_Y, x, y);
      dir_x = (POST_X - x) / d;
      dir_y = (POST_Y - y) / d;
      a_x = dir_x * a;
      a_y = dir_y * a;
       
      v_x = nextVelocity(v_x, a_x, TIMESTEP);
      v_y = nextVelocity(v_y, a_y, TIMESTEP);
       
      StdDraw.show(Math.round(1000 / FRAME_RATE));
    }
  }
}