package org.usfirst.frc6420.Attempt2.subsystems;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RIODuino extends Subsystem {
	
	private SerialPort spi = new SerialPort(9600, SerialPort.Port.kMXP );
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	/*
	 * Send a numeric value to the rio
	 */
	public void setMode( Mode mode ){
		spi.writeString( "" + (char)mode.ordinal() );
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public enum Mode{
    	PULSE_RED,
    	PULSE_GREEN,
    	PULSE_BLUE,
    	SOLID_RED,
    	SOLID_GREEN,
    	SOLID_BLUE,
    	MOVING_RED,
    	MOVING_GREEN,
    	MOVING_BLUE,
    }
}

