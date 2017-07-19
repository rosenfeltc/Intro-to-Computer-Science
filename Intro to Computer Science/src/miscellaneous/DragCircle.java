package miscellaneous;

import edu.princeton.cs.introcs.StdDraw;

public class DragCircle {
 
  public static double pointDistance (double x1, double y1, double x2, double y2) {
    return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
  }
   
  public static double getRadius(double x, double y) {
    double mx = StdDraw.mouseX();
    double my = StdDraw.mouseY();
     
    return pointDistance(x, y, mx, my);
  }
   
  public static void drawCircle(double x, double y, double radius) {
    StdDraw.clear();
    StdDraw.filledCircle(x, y, radius);
  }
   
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    StdDraw.setXscale(0, 200);
    StdDraw.setYscale(0, 200);
    StdDraw.setPenColor(StdDraw.YELLOW);
    double radius = 0;
    double x = 0;
    double y = 0;
    boolean drawing = false;
    while (true) {
      if (StdDraw.mousePressed() && drawing == false) {
        x = StdDraw.mouseX();
        y = StdDraw.mouseY();
        drawing = true;
         
      } else if (! StdDraw.mousePressed()){
        drawing = false;
      }
      if (drawing) {
        radius = getRadius(x, y);
        drawCircle(x, y, radius);
      }
      StdDraw.show(20);
    }
  }
 
}