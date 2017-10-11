package org.usfirst.frc.team3506.robot.commands.intake;

import org.usfirst.frc.team3506.robot.Robot;
import org.usfirst.frc.team3506.robot.subsystems.IntakeSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ForwardIntake extends Command {

    public ForwardIntake() {
    	requires(Robot.intakeSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.intakeSubsystem.forwardIntake();
    }


    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.intakeSubsystem.stopIntake();
    }
}
