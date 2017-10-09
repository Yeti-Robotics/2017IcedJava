package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClimberSubsystem extends Subsystem {

	private Talon climber1, climber2;
	
	public ClimberSubsystem() {
		climber1 = new Talon(RobotMap.CLIMBER1_TALON);
		climber2 = new Talon(RobotMap.CLIMBER2_TALON);
	}
	
	public void climbUp() {
		climber1.set(RobotMap.CLIMBER_POWER);
		climber2.set(RobotMap.CLIMBER_POWER);
	}
	
	public void climbDown() {
		climber1.set(-RobotMap.CLIMBER_POWER);
		climber2.set(-RobotMap.CLIMBER_POWER);
	}
	
	public void stopClimber() {
		climber1.set(0);
		climber2.set(0);
	}

    public void initDefaultCommand() {
    	
    }
}

