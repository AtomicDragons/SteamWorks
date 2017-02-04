package org.usfirst.frc6420.Attempt2.commands;

import org.usfirst.frc6420.Attempt2.LVDash;
import org.usfirst.frc6420.Attempt2.Robot;

import edu.wpi.first.wpilibj.command.PIDCommand;

/**
 *
 */
public class AutoMove extends PIDCommand {

    public AutoMove( int encoderCounts ) {
    	super( 0.03, 0.0, 0.0 );
    	this.getPIDController().setPercentTolerance( 5.0 );
    	this.setSetpointRelative( encoderCounts );
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	//requires( Robot.driveBase );
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	LVDash.setString( 7, String.valueOf( Robot.driveBase.getAverageEncoderCount() ) );
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.getPIDController().onTarget();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }

	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return Robot.driveBase.getAverageEncoderCount();
	}

	@Override
	protected void usePIDOutput(double output) {
		// TODO Auto-generated method stub
		Robot.driveBase.driveArcade( -output, 0.0 );
	}
}
