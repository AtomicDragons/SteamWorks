package org.usfirst.frc6420.Attempt2.commands;

import org.usfirst.frc6420.Attempt2.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class CameraCommand extends InstantCommand {

    public CameraCommand() {
        super();
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires( Robot.vision );
    }

    // Called once when the command executes
    protected void initialize() {
    	Robot.vision.toggleCamera();
    }

}
