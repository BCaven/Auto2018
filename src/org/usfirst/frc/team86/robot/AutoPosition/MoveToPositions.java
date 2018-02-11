package org.usfirst.frc.team86.robot.AutoPosition;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class MoveToPositions {
	static int count = 0;
	
	public static void moveTo(double robotX, double robotY, double destinationX, double destinationY) {
		//This is just to output the variable for testing my state machine
		// @TODO: replace this with math and functions for moving the robot
		count++;

		SmartDashboard.putNumber("RobotX at " + count, robotX);
		SmartDashboard.putNumber("RobotY at " + count, robotY);

		SmartDashboard.putNumber("DesinationX at " + count, destinationX);
		SmartDashboard.putNumber("DesinationY at " + count, destinationY);
	}
	
}
