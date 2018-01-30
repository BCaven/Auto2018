package org.usfirst.frc.team86.robot.AutoPosition;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class MoveToPositions {
	public static void moveTo(double robotX, double robotY, double destinationX, double destinationY) {
		//This is just to output the variable for testing my state machine
		// @TODO: replace this with math and functions for moving the robot
		
		SmartDashboard.putNumber("RobotX", robotX);
		SmartDashboard.putNumber("RobotY", robotY);

		SmartDashboard.putNumber("DesinationX", destinationX);
		SmartDashboard.putNumber("DesinationY", destinationY);
	}
	
}
