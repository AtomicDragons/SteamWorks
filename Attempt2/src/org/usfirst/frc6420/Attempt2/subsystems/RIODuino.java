package org.usfirst.frc6420.Attempt2.subsystems;

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RIODuino extends Subsystem {
	
	private SPI spi = new SPI( SPI.Port.kMXP );
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void setMode( Mode mode ){
		byte[] dataReceived = null;
		spi.transaction(new byte[mode.ordinal()], dataReceived, 1);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    enum Mode{
    	PULSE_RED,
    	PULSE_BLUE,
    	PULSE_GREEN,
    	SOLID_RED,
    	SOLID_BLUE,
    	SOLID_GREEN,
    	MOVING_RED,
    	MOVING_BLUE,
    	MOVING_GREEN;
    }
}

