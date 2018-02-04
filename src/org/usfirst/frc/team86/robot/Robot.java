package org.usfirst.frc.team86.robot;

import org.usfirst.frc.team86.robot.AutoPosition.PathChoosing;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

	private static double robotPosition = 1; 
	
	@Override
	public void robotInit() {
		SmartDashboard.putNumber("RobotPosistion(0,1,2,3)", robotPosition);
	}

	@Override
	public void autonomousInit() {
		String gameData = DriverStation.getInstance().getGameSpecificMessage();
		robotPosition = SmartDashboard.getNumber("RobotPosistion(0,1,2,3)", 0);
		
		int home  = gameData.charAt(0)=='L'?0:1; 
		int scale = gameData.charAt(1)=='L'?0:1;
		
		SmartDashboard.putNumber("home", home);
		SmartDashboard.putNumber("scale", scale);
	}

	@Override
	public void autonomousPeriodic() {
		PathChoosing.choosePath(robotPosition);
	}

	@Override
	public void teleopPeriodic() {

	}

	@Override
	public void testPeriodic() {
	
	}
}
