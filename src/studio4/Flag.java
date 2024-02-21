package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	StdDraw.setPenColor(Color.MAGENTA);
	StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
	StdDraw.setPenColor(Color.PINK);
	StdDraw.filledRectangle(0.5, 0.5, 0.25, 0.15);
	StdDraw.setPenColor(Color.CYAN);
	StdDraw.filledCircle(0.5, 0.5, .1);
	}
}