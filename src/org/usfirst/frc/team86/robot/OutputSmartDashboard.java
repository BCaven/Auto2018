package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OutputSmartDashboard {
	
	public static void update(int object, double value) {
		switch(object) {
		case 0:
			SmartDashboard.putNumber("LtoLSwitch", value);
			break;
		case 1:
			SmartDashboard.putNumber("ILtoLSwitch", value);
			break;
		case 2:
			SmartDashboard.putNumber("IRtoLSwitch", value);
			break;
		case 3:
			SmartDashboard.putNumber("RtoLSwitch", value);
			break;
		case 4:
			SmartDashboard.putNumber("LtoRSwitch", value);
			break;
		case 5:
			SmartDashboard.putNumber("ILtoRSwitch", value);
			break;
		case 6:
			SmartDashboard.putNumber("IRtoRSwitch", value);
			break;
		case 7:
			SmartDashboard.putNumber("RtoRSwitch", value);
			break;
		case 8:
			SmartDashboard.putNumber("LSwitchtoLScale", value);
			break;
		case 9:
			SmartDashboard.putNumber("LSwitchtoRScale", value);
			break;
		case 10:
			SmartDashboard.putNumber("RSwitchtoLScale", value);
			break;
		case 11:
			SmartDashboard.putNumber("RSwitchtoRScale", value);
			break;
		default:
			break;
		}		
	}
	
	public static void fillAll(int value) {
		for(int i = 0; i < 11; i++) {
			update(i, value);
		}
	}
	
}
