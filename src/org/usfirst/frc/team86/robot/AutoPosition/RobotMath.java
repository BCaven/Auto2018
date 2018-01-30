package org.usfirst.frc.team86.robot.AutoPosition;

import edu.wpi.first.wpilibj.drive.Vector2d;

public class RobotMath {
	
	public static double radiansToDegrees(double rad) {
		double deg = (rad*180) / Math.PI;
		return deg;
	}
	
	public static double degreesToRadians(double deg) {
		double rad = (deg*180) / Math.PI;
		return rad;
	}
	
	public static Vector2d createVector(double angle, double x1,double y1,double x2,double y2)  {
		//Create a vector based on Robots current angle of direction
		double xAngle = Math.sin(angle);
		double yAngle = Math.cos(angle);
		
		//adjust the current X and Y for the robots currents angle
		double xAdjust = x1 * xAngle; // x1 - (x1 * xAngle)
		double yAdjust = y1 * yAngle;
		
		//Find the x and Y values by translating them to 0,0
		double x = x2 - xAdjust;
		double y = y2 - yAdjust;
		
		Vector2d output = new Vector2d(x, y);
		return output;
	}
	
}
