package org.usfirst.frc.team3506.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	// Drivetrain
	public static final int FRONT_LEFT_TALON = 0;
	public static final int CENTER_LEFT_TALON =  1;
	public static final int BACK_LEFT_TALON = 2;
	public static final int FRONT_RIGHT_TALON = 3;
	public static final int CENTER_RIGHT_TALON = 4;
	public static final int BACK_RIGHT_TALON =  5;
	
	
	
	//Joystick
	public static final int LFFT_JOYSTICK_PORT = 0;
	public static final int RIGHT_JOYSTICK_PORT = 1;
	public static final int SHOOTER_JOYSTICK_PORT = 2;
	public static final double JOYSTICK_DEADZONE = .15;
}