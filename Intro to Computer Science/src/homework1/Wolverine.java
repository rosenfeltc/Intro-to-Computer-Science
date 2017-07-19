/*This is Wolverine from the X-Men, drawn by Christopher Rosenfelt for CSI/CEN 201 on 05/31/2017. 
 * Excessive detail was put in at the expense of my free time and sleep.*/
package homework1;

import edu.princeton.cs.introcs.*;
public class Wolverine {
	
	// Change background color to light gray
	public static void makeBackgroundGray(){
		StdDraw.clear(StdDraw.LIGHT_GRAY);
	}
	
	// Draw Wolverine
	public static void drawWolverine(){
		
		// Upper body
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledRectangle(200, 220, 70, 50);
		
		// Neck
		double[] xNeck = {130, 200, 270};
		double[] yNeck = {250, 295, 250};
		StdDraw.filledPolygon(xNeck, yNeck);
		
		// Abdomen
		StdDraw.filledRectangle(200, 150, 50, 20);
		
		// Give Wolverine a V-cut
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
			// Left side
			double[] xLeftVcut = {130, 150, 130};
			double[] yLeftVcut = {220, 168, 168};
			StdDraw.filledPolygon(xLeftVcut, yLeftVcut);
			// Right side
			double[] xRightVcut = {270, 250, 270};
			double[] yRightVcut = {220, 168, 168};
			StdDraw.filledPolygon(xRightVcut, yRightVcut);
		
		// Arms
		StdDraw.setPenColor(StdDraw.PINK);
		StdDraw.filledEllipse(112, 225, 14, 35); //Left
		StdDraw.filledEllipse(288, 225, 14, 35); //Right
		
		// Gloves
		StdDraw.setPenColor(StdDraw.BOOK_BLUE);
			// Left
			StdDraw.filledRectangle(112, 178, 10, 20);
			StdDraw.filledEllipse(112, 160, 15, 10);
			// Right
			StdDraw.filledRectangle(288, 178, 10, 20);
			StdDraw.filledEllipse(288, 160, 15, 10);
		
		// Claws
		StdDraw.setPenColor(StdDraw.GRAY);
		StdDraw.setPenRadius(.015);
			// Left
			StdDraw.line(106, 160, 106, 120);
			StdDraw.line(112, 160, 112, 120);
			StdDraw.line(118, 160, 118, 120);
			// Right
			StdDraw.line(294, 160, 294, 120);
			StdDraw.line(288, 160, 288, 120);
			StdDraw.line(282, 160, 282, 120);
		
		// Shoulders
		StdDraw.setPenColor(StdDraw.PINK);
		StdDraw.filledCircle(115,255, 15); // Left
		StdDraw.filledCircle(285,255, 15); // Right
		
		// Shoulder Pads
		StdDraw.setPenColor(StdDraw.BOOK_BLUE);
			// Left
			double[] xLeftPad = {105, 145, 130};
			double[] yLeftPad = {270, 270, 250};
			StdDraw.filledPolygon(xLeftPad, yLeftPad);
			//Right
			double[] xRightPad = {295, 255, 270};
			double[] yRightPad = {270, 270, 250};
			StdDraw.filledPolygon(xRightPad, yRightPad);
		// Draw the head
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledEllipse(200, 315, 24, 35);
		StdDraw.setPenColor(StdDraw.PINK);
		StdDraw.filledRectangle(200, 306, 22, 10);
		StdDraw.filledEllipse(200, 296, 16, 20);
		
		// Square the jaw
			//Left
			StdDraw.setPenRadius(.02);
			StdDraw.line(178, 320, 180, 290);
			StdDraw.line(177, 319, 184, 290);
			StdDraw.line(180, 290, 194, 280);
			//Right
			StdDraw.line(222, 320, 220, 290);
			StdDraw.line(223, 319, 216, 290);
			StdDraw.line(220, 290, 206, 280);
		
		// Mask
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledRectangle(200, 315, 30, 12);
		
		// Ears/Horns of the mask
			// Left
			double[] xLeftEar = {158, 186, 170};
			double[] yLeftEar = {375, 325, 318};
			StdDraw.filledPolygon(xLeftEar, yLeftEar);
			// Right
			double[] xRightEar = {242, 214, 230};
			double[] yRightEar = {375, 325, 318};
			StdDraw.filledPolygon(xRightEar, yRightEar);
		
		// Nose behind the mask
		StdDraw.setPenColor(StdDraw.YELLOW);
		double[] xNose = {194, 206, 200};
		double[] yNose = {330, 330, 304};
		StdDraw.filledPolygon(xNose, yNose);
		StdDraw.setPenColor(StdDraw.BLACK);
		// Bridge of the nose
		StdDraw.setPenRadius(.004);
		StdDraw.line(196, 314, 200, 320);
		StdDraw.line(204, 314, 200, 320);
		
		// Eyes
			// Left
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(188, 318, 3);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.setPenRadius(.004);
			StdDraw.line(188, 321, 188, 316);
			// Right
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(212, 318, 3);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.setPenRadius(.004);
			StdDraw.line(212, 321, 212, 316);
		
		// Mouth
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledEllipse(200, 290, 11, 6);
		
		// Teeth
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(200, 286, 7, 1);
		StdDraw.filledRectangle(200, 294, 7, 1);
		
		//Belt
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(200,122, 50, 8);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(.01);
		// Belt buckle with X-Men symbol
		StdDraw.square(200, 122, 8);
		StdDraw.line(192, 130, 208, 114);
		StdDraw.line(208, 130, 192, 114);
		
		//Legs
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledEllipse(172, 55, 24, 58); // Left
		StdDraw.filledEllipse(228, 55, 24, 58); // Right
		
		//Underwear
		StdDraw.setPenColor(StdDraw.BLACK);
		double[] xUnderwear = {150, 250, 200};
		double[] yUnderwear = {114, 114, 80};
		StdDraw.filledPolygon(xUnderwear, yUnderwear);
		
		// Wolverine costume designs
		StdDraw.setPenColor(StdDraw.BLACK);
		double[] xDesign1 = {150, 170, 174};
		double[] yDesign1 = {270, 276, 230};
		StdDraw.filledPolygon(xDesign1, yDesign1);
		
		double[] xDesign2 = {250, 230, 226};
		double[] yDesign2 = {270, 276, 230};
		StdDraw.filledPolygon(xDesign2, yDesign2);
		
		double[] xDesign3 = {130, 180, 132};
		double[] yDesign3 = {220, 220, 210};
		StdDraw.filledPolygon(xDesign3, yDesign3);
		
		double[] xDesign4 = {270, 220, 268};
		double[] yDesign4 = {220, 220, 210};
		StdDraw.filledPolygon(xDesign4, yDesign4);
		
		double[] xDesign5 = {145, 190, 150};
		double[] yDesign5 = {180, 180, 170};
		StdDraw.filledPolygon(xDesign5, yDesign5);
		
		double[] xDesign6 = {255, 210, 250};
		double[] yDesign6 = {180, 180, 170};
		StdDraw.filledPolygon(xDesign6, yDesign6);
		
		double[] xDesign7 = {150, 190, 150};
		double[] yDesign7 = {150, 150, 140};
		StdDraw.filledPolygon(xDesign7, yDesign7);
		
		double[] xDesign8 = {250, 210, 250};
		double[] yDesign8 = {150, 150, 140};
		StdDraw.filledPolygon(xDesign8, yDesign8);
		
	}
	public static void main(String[] args) {
		// Set scale and canvas size to draw on
		StdDraw.setCanvasSize(1000,1000);
		StdDraw.setXscale(0, 400);
		StdDraw.setYscale(0, 400);
		
		// Change background color to light gray
		makeBackgroundGray();
		
		// Draw Wolverine
		drawWolverine();
		
		// Artist's signature
		StdDraw.text(350, 20, "Christopher Rosenfelt");
	}

}
