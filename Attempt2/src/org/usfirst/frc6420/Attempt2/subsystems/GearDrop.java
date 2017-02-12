package org.usfirst.frc6420.Attempt2.subsystems;

import org.usfirst.frc6420.Attempt2.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GearDrop extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	DoubleSolenoid gearDrop = RobotMap.gearDrop;
	
	public void open(){
		gearDrop.set( Value.kForward );
	}
	
	public void close(){
		gearDrop.set( Value.kReverse );
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

