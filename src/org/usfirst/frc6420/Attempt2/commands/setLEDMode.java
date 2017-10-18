package org.usfirst.frc6420.Attempt2.commands;

import org.usfirst.frc6420.Attempt2.Robot;
import org.usfirst.frc6420.Attempt2.subsystems.RIODuino;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class setLEDMode extends InstantCommand {
	
	private RIODuino ledcontroller = Robot.ledcontroller;
	private RIODuino.Mode mode;

    public setLEDMode( RIODuino.Mode mode ) {
        super();
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        this.mode = mode;
        requires( Robot.ledcontroller );
    }

    // Called once when the command executes
    protected void initialize() {
    	ledcontroller.setMode( this.mode );
    }

}
