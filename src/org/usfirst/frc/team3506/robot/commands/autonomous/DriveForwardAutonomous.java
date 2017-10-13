package org.usfirst.frc.team3506.robot.commands.autonomous;

import org.usfirst.frc.team3506.robot.RobotMap;
import org.usfirst.frc.team3506.robot.commands.drivetrain.DriveForwardCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DriveForwardAutonomous extends CommandGroup {

    public DriveForwardAutonomous() {
    	addSequential(new DriveForwardCommand(RobotMap.DRIVE_FORWARD_POWER_AUTO, RobotMap.DRIVE_FORWARD_TIME_AUTO));
    }
}
