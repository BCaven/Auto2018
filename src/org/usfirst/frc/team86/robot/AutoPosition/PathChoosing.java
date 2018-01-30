package org.usfirst.frc.team86.robot.AutoPosition;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class PathChoosing {
	private static String gameData = DriverStation.getInstance().getGameSpecificMessage();
	private static double robotPosition = SmartDashboard.getNumber("RobotPosistion (0,1,2, 3)", 0);

	// Left is = 0, Right is equal 1
	private static int home = gameData.charAt(0) == 'L' ? 0 : 1;
	private static int scale = gameData.charAt(1) == 'L' ? 0 : 1;

	public static void choosePath() {
		if (robotPosition == 0) { // If the robot starts in the left position
			if (home == 0) { // If the switch goal is on the left
				Paths.LToLSwitch(0, scale);
			} else { // If the switch goal is on the right
				Paths.LToRSwitch(0, scale);
			}
		} else if (robotPosition == 1) { // If the robot starts in the inner left position
			if (home == 0) { // If the switch goal is on the left
				Paths.ILToLSwitch(0, scale);
			} else { // If the switch goal is on the right
				Paths.ILToRSwitch(0, scale);
			}
		} else if (robotPosition == 2) { // If the robot starts in the inner right position
			if (home == 0) { // If the switch goal is on the left
				Paths.IRToLSwitch(0, scale);
			} else { // If the switch goal is on the right
				Paths.IRToRSwitch(0, scale);
			}
		} else if (robotPosition == 3) { // If the robot starts in the right position
			if (home == 0) { // If the switch goal is on the left
				Paths.RToLSwitch(0, scale);
			} else { // If the switch goal is on the right
				Paths.RToRSwitch(0, scale);
			}
		}
	}
}
