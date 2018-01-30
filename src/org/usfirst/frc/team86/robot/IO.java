package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Victor;

public class IO {
	public static NavX navX = new NavX();
	
	public static Victor leftFrontDrive = new Victor(5);
	public static Victor leftRearDrive = new Victor(6);
	public static Victor rightFrontDrive = new Victor(7);
	public static Victor rightRearDrive = new Victor(8);
	
	public static Encoder leftFrontEncoder = new Encoder(0, 1, false);
	public static Encoder leftRearEncoder = new Encoder(0, 1, false);
	public static Encoder rightFrontEncoder = new Encoder(0, 1, true);
	public static Encoder rightRearEncoder = new Encoder(0, 1, true);
}
