package org.usfirst.frc6420.Attempt2.subsystems;

import org.opencv.core.Mat;
import org.usfirst.frc6420.Attempt2.Robot;
import org.usfirst.frc6420.Attempt2.commands.DriveWithJoystick;

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Vision extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public static UsbCamera cam0, cam1;
	
	public Vision() {
		cam0 = CameraServer.getInstance().startAutomaticCapture( "Front Facing Cam", 0 );
        cam0.setResolution( 320, 240 );
        cam0.setFPS( 15 );
        
        cam1 = CameraServer.getInstance().startAutomaticCapture( "Rear Facing Cam", 1 );
        cam1.setResolution( 320, 240 );
        cam1.setFPS( 15 );
        
		new Thread(() -> {
            UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();
            camera.setResolution(320, 240);
            
            CvSink cvSink0 = CameraServer.getInstance().getVideo( cam0 );
            CvSink cvSink1 = CameraServer.getInstance().getVideo( cam1 );
            CvSource outputStream = CameraServer.getInstance().putVideo("Switcher", 320, 240);
            
            Mat image = new Mat();
            
            while(!Thread.interrupted()) {
                (Robot.oi.fancyStick.getRawButton( 2 ) ? cvSink1 : cvSink0).grabFrame(image);
                outputStream.putFrame(image); 
            }
        }).start();
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand( new DriveWithJoystick() );
    }
}

