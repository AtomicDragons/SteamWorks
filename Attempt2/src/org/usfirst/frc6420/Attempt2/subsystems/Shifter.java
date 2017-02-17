package org.usfirst.frc6420.Attempt2.subsystems;

import org.usfirst.frc6420.Attempt2.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shifter extends Subsystem {
    private final DoubleSolenoid shifter = RobotMap.shift;
    private Gear shiftMode = Gear.LOW;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
    public void shift( Gear shift ){
    	shiftMode = shift;
    	shifter.set( shift.getDirection() );
    }
    
    public Gear getShiftMode(){
    	return shiftMode;
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public enum Gear {
    	LOW(DoubleSolenoid.Value.kForward),
    	HIGH(DoubleSolenoid.Value.kReverse);
    	
    	private DoubleSolenoid.Value direction;
    	
    	private Gear( DoubleSolenoid.Value direction ){
    		this.direction = direction;
    	}
    	public DoubleSolenoid.Value getDirection(){
    		return direction;
    	}
    }
}

