package org.usfirst.frc.team86.robot.AutoPosition;

import org.usfirst.frc.team86.robot.AutoRobotFunctions;
import org.usfirst.frc.team86.robot.OutputSmartDashboard;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Paths {
	private static int stateProgress = 0;

	// ------------------------------
	public static void RToRSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		OutputSmartDashboard.update(7, state);
		switch (state) {
		case 0:// Go to row one
			MoveToPositions.moveTo(Map.keyPointsX[0][3], Map.keyPointsY[0], Map.keyPointsX[1][1], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1: // Go to row two
			MoveToPositions.moveTo(Map.keyPointsX[1][1], Map.keyPointsY[1], Map.keyPointsX[1][1], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 2: // Line Up for switch
			MoveToPositions.moveTo(Map.keyPointsX[1][1], Map.keyPointsY[2], Map.keyPointsX[2][1], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 3: // Get in placement position
			MoveToPositions.moveTo(Map.keyPointsX[2][1], Map.keyPointsY[2], Map.keyPointsX[2][1], Map.keyPointsY[3]);
			stateProgress++;
			break;
		case 4: // Place In scale
			AutoRobotFunctions.placeScale();
			stateProgress++;
			break;
		case 5:
			SmartDashboard.putString("Finished:", "Right Switch");
			if (scale == 0) {
				RSwitchToLScale();
			} else {
				RSwitchToRScale();
			}
			stateProgress++;
			break;
		default:
			state = 0;
			break;
		}
	}

	public static void RToLSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		OutputSmartDashboard.update(3, state);
		switch (state) {
		case 0:// Go to row one
			MoveToPositions.moveTo(Map.keyPointsX[0][0], Map.keyPointsY[0], Map.keyPointsX[1][0], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1: // Go to right on row 1
			MoveToPositions.moveTo(Map.keyPointsX[1][0], Map.keyPointsY[1], Map.keyPointsX[1][1], Map.keyPointsY[1]);
			break;
		case 2: // Go to row two
			MoveToPositions.moveTo(Map.keyPointsX[1][1], Map.keyPointsY[1], Map.keyPointsX[1][1], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 3: // Line Up for switch
			MoveToPositions.moveTo(Map.keyPointsX[1][1], Map.keyPointsY[1], Map.keyPointsX[2][1], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 4: // Get in placement position
			MoveToPositions.moveTo(Map.keyPointsX[2][1], Map.keyPointsY[2], Map.keyPointsX[2][1], Map.keyPointsY[3]);
			stateProgress++;
			break;
		case 5: // Place In scale
			AutoRobotFunctions.placeScale();
			stateProgress++;
			break;
		case 6:
			SmartDashboard.putString("Finished:", "Left Switch");
			if (scale == 0) {
				LSwitchToLScale();
			} else {
				LSwitchToRScale();
			}
			stateProgress++;
			break;
		default:
			state = 0;
			break;
		}

	}

	public static void LToRSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		OutputSmartDashboard.update(4, state);
		switch (state) {
		case 0:// Go to row one
			MoveToPositions.moveTo(Map.keyPointsX[0][3], Map.keyPointsY[0], Map.keyPointsX[1][1], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1: // Go to left on row 1
			MoveToPositions.moveTo(Map.keyPointsX[1][1], Map.keyPointsY[1], Map.keyPointsX[1][0], Map.keyPointsY[1]);
			break;
		case 2: // Go to row two
			MoveToPositions.moveTo(Map.keyPointsX[1][0], Map.keyPointsY[1], Map.keyPointsX[1][0], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 3: // Line Up for switch
			MoveToPositions.moveTo(Map.keyPointsX[1][0], Map.keyPointsY[1], Map.keyPointsX[2][0], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 4: // Get in placement position
			MoveToPositions.moveTo(Map.keyPointsX[2][0], Map.keyPointsY[2], Map.keyPointsX[2][0], Map.keyPointsY[3]);
			stateProgress++;
			break;
		case 5: // Place In scale
			AutoRobotFunctions.placeScale();
			stateProgress++;
			break;
		case 6:
			SmartDashboard.putString("Finished:", "Right Switch");
			if (scale == 0) {
				RSwitchToLScale();
			} else {
				RSwitchToRScale();
			}
			stateProgress++;
			break;
		default:
			state = 0;
			break;
		}

	}

	public static void LToLSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		OutputSmartDashboard.update(0, state);
		switch (state) {
		case 0:// Go to row one
			MoveToPositions.moveTo(Map.keyPointsX[0][0], Map.keyPointsY[0], Map.keyPointsX[1][0], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1: // Go to row two
			MoveToPositions.moveTo(Map.keyPointsX[1][0], Map.keyPointsY[1], Map.keyPointsX[1][0], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 2: // Line Up for switch
			MoveToPositions.moveTo(Map.keyPointsX[1][0], Map.keyPointsY[2], Map.keyPointsX[2][0], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 3: // Get in placement position
			MoveToPositions.moveTo(Map.keyPointsX[2][0], Map.keyPointsY[2], Map.keyPointsX[2][0], Map.keyPointsY[3]);
			stateProgress++;
			break;
		case 4: // Place In scale
			AutoRobotFunctions.placeScale();
			stateProgress++;
			break;
		case 5:
			SmartDashboard.putString("Finished:", "Left Switch");
			if (scale == 0) {
				LSwitchToLScale();
			} else {
				LSwitchToRScale();
			}
			stateProgress++;
			break;
		default:
			state = 0;
			break;
		}

	}

	public static void IRToRSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		OutputSmartDashboard.update(6, state);
		switch (state) {
		case 0:
			MoveToPositions.moveTo(Map.keyPointsX[0][2], Map.keyPointsY[0], Map.keyPointsX[0][2], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1:
			MoveToPositions.moveTo(Map.keyPointsX[0][2], Map.keyPointsY[0], Map.keyPointsX[1][1], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 2:
			stateProgress = 0;
			RToRSwitch(1, scale);
			break;
		default:
			state = 0;
			break;
		}
	}

	public static void IRToLSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		OutputSmartDashboard.update(2, state);
		switch (state) {
		case 0:
			MoveToPositions.moveTo(Map.keyPointsX[0][2], Map.keyPointsY[0], Map.keyPointsX[0][2], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1:
			MoveToPositions.moveTo(Map.keyPointsX[0][2], Map.keyPointsY[0], Map.keyPointsX[1][0], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 2:
			stateProgress = 0;
			RToRSwitch(1, scale);
			break;
		default:
			state = 0;
			break;
		}

	}

	public static void ILToRSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		OutputSmartDashboard.update(5, state);
		switch (state) {
		case 0:
			MoveToPositions.moveTo(Map.keyPointsX[0][1], Map.keyPointsY[0], Map.keyPointsX[0][1], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1:
			MoveToPositions.moveTo(Map.keyPointsX[0][1], Map.keyPointsY[0], Map.keyPointsX[1][1], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 2:
			stateProgress = 0;
			RToRSwitch(1, scale);
			break;
		default:
			state = 0;
			break;
		}

	}

	public static void ILToLSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		OutputSmartDashboard.update(1, state);
		switch (state) {
		case 0:
			MoveToPositions.moveTo(Map.keyPointsX[0][2], Map.keyPointsY[0], Map.keyPointsX[0][2], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1:
			MoveToPositions.moveTo(Map.keyPointsX[0][2], Map.keyPointsY[0], Map.keyPointsX[1][0], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 2:
			stateProgress = 0;
			RToRSwitch(1, scale);
			break;
		default:
			state = 0;
			break;
		}

	}

	// -----------------------------------------------------------------------------------------
	static int switchToScaleState = 0;
	public static void RSwitchToRScale() {
		OutputSmartDashboard.update(11, switchToScaleState);
		switch (switchToScaleState) {
		case 0:// Go to row
			MoveToPositions.moveTo(Map.keyPointsX[2][1], Map.keyPointsY[3], Map.keyPointsX[2][1], Map.keyPointsY[2]);
			switchToScaleState++;
			break;
		case 1:// Align to scale
			MoveToPositions.moveTo(Map.keyPointsX[2][1], Map.keyPointsY[2], Map.keyPointsX[3][1], Map.keyPointsY[2]);
			switchToScaleState++;
			break;
		case 2:// Go to scale
			MoveToPositions.moveTo(Map.keyPointsX[3][1], Map.keyPointsY[2], Map.keyPointsX[3][1], Map.keyPointsY[4]);
			switchToScaleState++;
			break;
		case 3:
			SmartDashboard.putString("Finished:", "Right Scale");
			AutoRobotFunctions.placeScale();
			break;
		default:
			switchToScaleState = 0;
			break;
		}
	}

	public static void RSwitchToLScale() {
		OutputSmartDashboard.update(10, switchToScaleState);
		switch (switchToScaleState) {
		case 0:// Go to row
			MoveToPositions.moveTo(Map.keyPointsX[2][1], Map.keyPointsY[3], Map.keyPointsX[2][1], Map.keyPointsY[2]);
			switchToScaleState++;
			break;
		case 1:// Align to scale
			MoveToPositions.moveTo(Map.keyPointsX[2][1], Map.keyPointsY[2], Map.keyPointsX[3][0], Map.keyPointsY[2]);
			switchToScaleState++;
			break;
		case 2:// Go to scale
			MoveToPositions.moveTo(Map.keyPointsX[3][0], Map.keyPointsY[2], Map.keyPointsX[3][0], Map.keyPointsY[4]);
			switchToScaleState++;
			break;
		case 3:
			SmartDashboard.putString("Finished:", "Left Scale");
			AutoRobotFunctions.placeScale();
			break;
		default:
			switchToScaleState = 0;
			break;
		}

	}

	public static void LSwitchToRScale() {
		OutputSmartDashboard.update(9, switchToScaleState);
		switch (switchToScaleState) {
		case 0:// Go to row
			MoveToPositions.moveTo(Map.keyPointsX[2][0], Map.keyPointsY[3], Map.keyPointsX[2][0], Map.keyPointsY[2]);
			switchToScaleState++;
			break;
		case 1:// Align to scale
			MoveToPositions.moveTo(Map.keyPointsX[2][0], Map.keyPointsY[2], Map.keyPointsX[3][1], Map.keyPointsY[2]);
			switchToScaleState++;
			break;
		case 2:// Go to scale
			MoveToPositions.moveTo(Map.keyPointsX[3][1], Map.keyPointsY[2], Map.keyPointsX[3][1], Map.keyPointsY[4]);
			switchToScaleState++;
			break;
		case 3:
			SmartDashboard.putString("Finished:", "Right Scale");
			AutoRobotFunctions.placeScale();
			break;
		default:
			switchToScaleState = 0;
			break;
		}

	}

	public static void LSwitchToLScale() {
		OutputSmartDashboard.update(8, switchToScaleState);
		switch (switchToScaleState) {
		case 0:// Go to row
			MoveToPositions.moveTo(Map.keyPointsX[2][0], Map.keyPointsY[3], Map.keyPointsX[2][0], Map.keyPointsY[2]);
			switchToScaleState++;
			break;
		case 1:// Align to scale
			MoveToPositions.moveTo(Map.keyPointsX[2][0], Map.keyPointsY[2], Map.keyPointsX[3][0], Map.keyPointsY[2]);
			switchToScaleState++;
			break;
		case 2:// Go to scale
			MoveToPositions.moveTo(Map.keyPointsX[3][0], Map.keyPointsY[2], Map.keyPointsX[3][0], Map.keyPointsY[4]);
			switchToScaleState++;
			break;
		case 3:
			SmartDashboard.putString("Finished:", "Left Scale");
			AutoRobotFunctions.placeScale();
			break;
		default:
			switchToScaleState = 0;
			break;
		}
	}

}
