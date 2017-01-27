package org.usfirst.frc6420.Attempt2.commands;

import org.usfirst.frc6420.Attempt2.Robot;
import org.usfirst.frc6420.Attempt2.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Dashboard extends Command {

    public Dashboard() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putNumber("DB/String 0", RobotMap.rightDriveEncoder.getRate() );
    	SmartDashboard.putString( "DB/String 1", Robot.driveBase.getShiftMode().toString() );
    	SmartDashboard.putData( "DB/String 0", RobotMap.gyro );
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
