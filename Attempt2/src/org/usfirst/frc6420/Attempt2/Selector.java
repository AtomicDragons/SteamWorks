package org.usfirst.frc6420.Attempt2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Command;

public class Selector {
	private HashMap<DigitalInput, Command> commands;
	
	public void addCommand( DigitalInput port, Command command ){
		commands.put( port,  command );
	}
	
	public Command getSelected(){
		Iterator it = commands.entrySet().iterator();
		while( it.hasNext() ){
			Map.Entry pair = (Map.Entry)it.next();
			if( ((DigitalInput)(pair.getKey())).get() ){
				return (Command) pair.getValue();
			}
			it.remove();
		}
		return null;
	}
}
