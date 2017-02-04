package org.usfirst.frc6420.Attempt2.commands;

import org.usfirst.frc6420.Attempt2.Robot;
import org.usfirst.frc6420.Attempt2.subsystems.DriveBase.Gear;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class ShiftCommand extends InstantCommand {
	private Gear target;

    public ShiftCommand( Gear target ) {
        super();
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        //requires( Robot.driveBase );
        this.target = target;
    }

    // Called once when the command executes
    protected void initialize() {
    	Robot.driveBase.shift( target );
    }

}
