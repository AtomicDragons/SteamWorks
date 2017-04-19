package org.usfirst.frc6420.Attempt2.commands;

import org.usfirst.frc6420.Attempt2.LVDash;
import org.usfirst.frc6420.Attempt2.Robot;
import org.usfirst.frc6420.Attempt2.subsystems.DriveBase;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoMove extends Command {
	private int target;
	private double absolute_target;
	private DriveBase driveBase = Robot.driveBase;
	private double speed = 0.65;

    public AutoMove( int encoderCounts ) {
    	target = encoderCounts;
    }
    
    public AutoMove( int encoderCounts, double speed ){
    	this.speed = speed;
    	target = encoderCounts;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	absolute_target = driveBase.getAverageEncoderCount() + target;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	LVDash.setString( 8, String.valueOf( driveBase.getAverageEncoderCount() ) );
    	if( target > 0 ){
    		driveBase.driveArcadeAuto( -speed, 0 );
    	}else{
    		driveBase.driveArcadeAuto( speed, 0 );
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Math.abs( driveBase.getAverageEncoderCount() - this.absolute_target ) < 10;
    }

    // Called once after isFinished returns true
    protected void end() {
    	driveBase.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
