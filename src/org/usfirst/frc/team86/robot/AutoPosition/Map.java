package org.usfirst.frc.team86.robot.AutoPosition;

public class Map {
	double x;
	double y;
	
	// 0,0 Is located from the bottom left
	
	public static double keyPointsX[][] = {
			{64.5, 100, 200, 295.5},	// L then LI then RI then R
			{21.5, 338.5},		// L, R
			{141, 219},			// Switch LPlace, RPlace 
			{55.07, 304.93}		// Scale  LPace, RPlace
	};
	
	// @TODO Verify the robots dimensions
	// 	All math done for a 33in x 33in bot frame
	public static double keyPointsY[] = {
			16.5, 	// Starting Y Distance
			114.5, 	// Closest row of points  
			228.75,	// Row Between Scale and Switch 
			212.5, 	// Placing on the Switch
			324, 	// Placing on the Scale
	};
}
