package org.usfirst.frc6420.Attempt2.commands;

import org.usfirst.frc6420.Attempt2.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DropGear extends Command {
    public DropGear(  ) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires( Robot.gearDrop );
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.gearDrop.open();
    }

	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	protected void end(){
		Robot.gearDrop.close();
	}
}
