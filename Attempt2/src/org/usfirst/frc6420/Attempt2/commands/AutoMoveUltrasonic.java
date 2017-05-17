package org.usfirst.frc6420.Attempt2.commands;

import org.usfirst.frc6420.Attempt2.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoMoveUltrasonic extends Command {
	private int target;
    public AutoMoveUltrasonic( int target ) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.target = target;
    	requires( Robot.driveBase );
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveBase.driveArcade( 0.5, 0.0 );
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.driveBase.getUltrasonicLevel() < target;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveBase.driveArcade( 0, 0 );
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
  
}
