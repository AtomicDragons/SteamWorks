package org.usfirst.frc6420.Attempt2.subsystems;

import org.usfirst.frc6420.Attempt2.RobotMap;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Vision extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public static UsbCamera cam0, cam1;
	private Solenoid visionLEDs = RobotMap.visionLEDs;
	
	public Vision() {
		cam0 = CameraServer.getInstance().startAutomaticCapture( 0 );
		cam0.setFPS(7);
		cam0.setResolution(320, 240);
		cam1 = CameraServer.getInstance().startAutomaticCapture( 1 );
		cam1.setFPS(7);
		cam1.setResolution(320, 240);
	}
	
	public void setLEDs( boolean enabled ){
		visionLEDs.set( enabled );
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//setDefaultCommand( new CameraCommand() );
    }
}

