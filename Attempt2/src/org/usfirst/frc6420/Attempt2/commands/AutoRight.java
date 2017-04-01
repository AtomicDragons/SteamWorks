package org.usfirst.frc6420.Attempt2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoRight extends CommandGroup {

    public AutoRight() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    	addSequential( new AutoMove( 500 ) );
    	addSequential( new AutoTurn( -60 ) );
    	addSequential( new AutoMove( 110 ) );
    	addSequential( new WaitCommand( 1 ) );
    	addParallel( new DropGear( 2 )  );
    	addSequential( new AutoMove( -100 ) );
        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
