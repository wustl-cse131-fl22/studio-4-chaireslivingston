package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
		//drawing background green Rectangle 
		StdDraw.setPenColor(193, 255, 155);
		StdDraw.filledRectangle(.5, .5, .3, 0.2);
		
		//outine the rectangle
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(.5, .5, .3, 0.2);
		
		// making the circles
		StdDraw.setPenColor(100, 0, 100);
		StdDraw.filledCircle(.5, .6, .05);
		
		StdDraw.setPenColor(100, 0, 100);
		StdDraw.filledCircle(.3, .6, .05);
		
		StdDraw.setPenColor(100, 0, 100);
		StdDraw.filledCircle(.7, .6, .05);
		
		//making the elipses
		StdDraw.setPenColor(0, 39, 70);
		StdDraw.ellipse(.5, .4, .05, 0.08);
		StdDraw.ellipse(.3, .4, .05, 0.08);
		StdDraw.ellipse(.7, .4, .05, 0.08);
	}
}