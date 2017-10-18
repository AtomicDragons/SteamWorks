package org.usfirst.frc6420.Attempt2.subsystems;

import org.usfirst.frc6420.Attempt2.RobotMap;
import org.usfirst.frc6420.Attempt2.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climb extends Subsystem {
	
	private VictorSP climber = RobotMap.climber;
	
	public void setPower( Double power ){
		climber.set( power );
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveWithJoystick() );
    }
}

