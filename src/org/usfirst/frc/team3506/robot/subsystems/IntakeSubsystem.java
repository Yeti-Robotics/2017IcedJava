package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeSubsystem extends Subsystem {

  private Talon intakeBaby;
  
  public IntakeSubsystem() {
	  intakeBaby = new Talon(RobotMap.INTAKE_TALON);
		
	}
	
	public void forwardIntake() {
		intakeBaby.set(RobotMap.INTAKE_SPEED);
		
	}
	
	public void reverseIntake() {
		intakeBaby.set(-RobotMap.INTAKE_SPEED);
	
	}
	
	public void stopIntake() {
		intakeBaby.set(0);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

