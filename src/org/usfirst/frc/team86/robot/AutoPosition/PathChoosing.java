package org.usfirst.frc.team86.robot.AutoPosition;

import edu.wpi.first.wpilibj.DriverStation;

public class PathChoosing {
	private static String gameData = DriverStation.getInstance().getGameSpecificMessage();

	// Left is = 0, Right is equal 1
	private static int home = gameData.charAt(0) == 'L' ? 0 : 1;
	private static int scale = gameData.charAt(1) == 'L' ? 0 : 1;

	public static void choosePath(double robotPosition) {
		// If the robot starts in the left position
		if (robotPosition == 0) {
			// If the switch goal is on the left
			if (home == 0) {
				Paths.LToLSwitch(0, scale);
			} else {
				// If the switch goal is on the right
				Paths.LToRSwitch(0, scale);
			}
			// If the robot starts in the inner left position
		} else if (robotPosition == 1) {
			// If the switch goal is on the left
			if (home == 0) {
				Paths.ILToLSwitch(0, scale);
			} else {
				// If the switch goal is on the right
				Paths.ILToRSwitch(0, scale);
			}
			// If the robot starts in the inner right position
		} else if (robotPosition == 2) {
			// If the switch goal is on the left
			if (home == 0) {
				Paths.IRToLSwitch(0, scale);
			} else {
				// If the switch goal is on the right
				Paths.IRToRSwitch(0, scale);
			}
			// If the robot starts in the right position
		} else if (robotPosition == 3) {
			// If the switch goal is on the left
			if (home == 0) {
				Paths.RToLSwitch(0, scale);
			} else {
				// If the switch goal is on the right
				Paths.RToRSwitch(0, scale);
			}
		}
	}
}
