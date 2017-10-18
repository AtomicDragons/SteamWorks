package org.usfirst.frc6420.Attempt2.commands;

import org.usfirst.frc6420.Attempt2.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class DropGear extends TimedCommand {
	private boolean isTimed = true;
	public DropGear(){
		super( 0 );
		isTimed = false;
	}
	public DropGear(double timeout ) {
		super(timeout);
		isTimed = true;
		// TODO Auto-generated constructor stub
	}
    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.gearage.open();
    }

	@Override
	protected boolean isFinished() {
		return isTimed && isTimedOut();
	}
	
	@Override
	protected void end(){
		Robot.gearage.close();
	}
}
