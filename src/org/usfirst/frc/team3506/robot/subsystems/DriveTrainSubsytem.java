package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;
import org.usfirst.frc.team3506.robot.commands.drivetrain.UserDriveCommand;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrainSubsytem extends Subsystem {
	
	private Talon left1, left2, left3, right1, right2, right3;

	public DriveTrainSubsytem() {
		left1 = new Talon(RobotMap.FRONT_LEFT_TALON);
		left2 = new Talon(RobotMap.CENTER_LEFT_TALON);
		left3 = new Talon(RobotMap.BACK_LEFT_TALON);
		right1 = new Talon(RobotMap.FRONT_RIGHT_TALON);
		right2 = new Talon(RobotMap.CENTER_RIGHT_TALON);
		right3 = new Talon(RobotMap.BACK_RIGHT_TALON);
		//Deciding to invert motors or not
		right1.setInverted(false);
		right2.setInverted(false);
		right3.setInverted(false);
		left1.setInverted(false);
		left2.setInverted(false);
		left3.setInverted(false);	
	}
	
	public void driveStraight(double speed) {
		moveLeftTrain(speed);
		moveRightTrain(speed);
	}

	public void moveLeftTrain(double speed) {
		left1.set(speed);
		left2.set(speed);
		left3.set(speed);
	}

	public void moveRightTrain(double speed) {
		right1.set(speed);
		right2.set(speed);
		right3.set(speed);
	}
	
	public void tankDrive(double left, double right) {
		moveLeftTrain(left);
		moveRightTrain(right);
	}
    public void initDefaultCommand() {
    	setDefaultCommand(new UserDriveCommand());
     
    }
}

