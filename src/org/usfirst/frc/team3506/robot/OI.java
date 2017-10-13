package org.usfirst.frc.team3506.robot;
import org.usfirst.frc.team3506.robot.commands.climber.ClimbDownCommand;
import org.usfirst.frc.team3506.robot.commands.climber.ClimbUpCommand;
import org.usfirst.frc.team3506.robot.commands.gearOut.ContractGearOut;
import org.usfirst.frc.team3506.robot.commands.gearOut.ExtendGearOutCommand;
import org.usfirst.frc.team3506.robot.commands.intake.ForwardIntake;
import org.usfirst.frc.team3506.robot.commands.intake.ReverseIntake;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
	public Joystick leftStick, rightStick, shooterStick;

	public OI() {
		leftStick = new Joystick(RobotMap.LFFT_JOYSTICK_PORT);
		rightStick = new Joystick(RobotMap.RIGHT_JOYSTICK_PORT);
		shooterStick = new Joystick(RobotMap.SHOOTER_JOYSTICK_PORT);
		
		setButtonWhileHeld(leftStick, 2, new ClimbUpCommand());
		setButtonWhileHeld(rightStick, 3, new ForwardIntake());
		setButtonWhileHeld(rightStick, 2, new ReverseIntake());
		setButtonWhenPressed(rightStick, 6, new ExtendGearOutCommand());
		setButtonWhenPressed(rightStick, 7, new ContractGearOut());
		//no climb down command on request of robbie claims somehow will break the cimber 
		//setButtonWhileHeld(leftStick, 3, new ClimbDownCommand());
	}
	
	private void setButtonWhenPressed(Joystick joystick, int button, Command command) {
		new JoystickButton(joystick, button).whenPressed(command);
	}
	
	private void setButtonWhileHeld(Joystick joystick, int button, Command command) {
		new JoystickButton(joystick, button).whileHeld(command);
	}
	
	public double getShooterY() {
		if (!(shooterStick == null)) {
			return -deadZoneMod(shooterStick.getY());
		} else {
			return 0;
		}
	}

	public double getRightX() {
		if (!(rightStick == null)) {
			return deadZoneMod(rightStick.getX());
		} else {
			return 0;
		}
	}

	public double getLeftX() {
		if (!(leftStick == null)) {
			return deadZoneMod(leftStick.getX());
		} else {
			return 0;
		}
	}

	public double getRightY() {
		if (!(rightStick == null)) {
			return deadZoneMod(rightStick.getY());
		} else {
			return 0;
		}
	}

	public double getLeftY() {
		if (!(leftStick == null)) {
			return -deadZoneMod(leftStick.getY());
		} else {
			return 0;
		}
	}

	private double deadZoneMod(double val) {
		if (Math.abs(val) <= RobotMap.JOYSTICK_DEADZONE) {
			return 0;
		} else {
			return val;
		}
	}

	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}