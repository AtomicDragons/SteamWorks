package org.usfirst.frc6420.Attempt2.commands;

import org.usfirst.frc6420.Attempt2.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class CameraCommand extends InstantCommand {
	private boolean debug = false;
    public CameraCommand( boolean debugging ) {
        super();
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        debug = debugging;
        requires( Robot.vision );
    }

    // Called once when the command executes
    protected void initialize() {
    	if( debug ){
    		Robot.vision.setForRobot();
    	}else{
    		Robot.vision.toggleCamera();
    	}
    }

}
