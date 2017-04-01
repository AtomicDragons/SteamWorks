package org.usfirst.frc6420.Attempt2.subsystems;

import org.usfirst.frc6420.Attempt2.RobotMap;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.tables.ITable;

/**
 *
 */
public class Vision extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public static UsbCamera cam0;
	private Solenoid visionLEDs = RobotMap.visionLEDs;
	private NetworkTable table;
	private double[] defaultPoint = new double[]{0,0};
	
	public Vision() {
		cam0 = CameraServer.getInstance().startAutomaticCapture( 0 );
		table = NetworkTable.getTable("pivision");
		cam0.setFPS(30);
		cam0.setResolution(320, 240);
	}
	
	public void setLEDs( boolean enabled ){
		visionLEDs.set( enabled );
	}
	
	public int getDegreesFromTarget(){
		ITable a = table.getSubTable( "0" );
		ITable b = table.getSubTable( "1" );
		double[] point = a.getNumberArray("point", defaultPoint);
		
		return 0;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//setDefaultCommand( new CameraCommand() );
    }
}

