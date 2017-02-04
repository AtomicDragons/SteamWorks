package org.usfirst.frc6420.Attempt2.subsystems;

import org.opencv.core.Mat;

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
	private volatile boolean cam0enabled = true;
	
	public Vision() {
		cam0 = new UsbCamera( "Front Facing Cam", 0 ); //CameraServer.getInstance().startAutomaticCapture( "Front Facing Cam", 0 );
        cam0.setResolution( 320, 240 );
        cam0.setFPS( 20 );
        //cam0.setExposureManual( 15 );
        
        cam1 = new UsbCamera( "Rear Facing Cam", 1 );//CameraServer.getInstance().startAutomaticCapture( "Rear Facing Cam", 1 );
        cam1.setResolution( 320, 240 );
        cam1.setFPS( 20 );
        
        
		Thread t = new Thread(() -> {
            CvSink cvSink0 = CameraServer.getInstance().getVideo( cam0 );
            cvSink0.setEnabled( true );
            CvSink cvSink1 = CameraServer.getInstance().getVideo( cam1 );
            cvSink1.setEnabled( true );
            
            CvSource outputStream = CameraServer.getInstance().putVideo("Switcher", 320, 240);
            outputStream.setFPS( 20 );
            
            Mat image = new Mat();
            
            while(!Thread.interrupted()) {
            	if( cam0enabled /*Robot.oi.fancyStick.getRawButton( 2 )*/ ){
            		cvSink0.setEnabled( true );
            		cvSink1.setEnabled( false );
            		cvSink0.grabFrame( image );
            	}else{
            		cvSink1.setEnabled( true );
            		cvSink0.setEnabled( false );
            		cvSink1.grabFrame( image );
            	}
            	
            	outputStream.putFrame( image );
            }
		});
		t.start();
	}
	
	public void toggleCamera(){
		cam0enabled = !cam0enabled;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//setDefaultCommand( new CameraCommand() );
    }
}

