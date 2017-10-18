package org.usfirst.frc6420.Attempt2;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *  A static class for interacting with the Labview dashboard
 */
public final class LVDash {
	
	private LVDash(){
		
	}
	
	  /**
	   * Sends data to the "Basic" tab string fields on the Labview Dashboard (0-9)
	   */
    public static void setString( int port, String str ){
    	if( port < 0 || port > 9 ){
    		throw new IllegalArgumentException( "port must be between 0 and 9" );
    	}
    	SmartDashboard.putString( "DB/String " + port, str );
    }
      /**
	   * Retrieves data from the "Basic" tab string fields on the Labview Dashboard (0-9)
	   */
    public static String getString( int port ){
    	if( port < 0 || port > 9 ){
    		throw new IllegalArgumentException( "port must be between 0 and 9" );
    	}
    	return SmartDashboard.getString( "DB/String " + port, "");
    }
    
    /**
	   * Sets the buttons on the "Basic" tab of the Labview Dashboard (0-3)
	   */
    public static void setButton( int port, boolean b ){
    	if( port < 0 || port > 3 ){
    		throw new IllegalArgumentException( "port must be between 0 and 3" );
    	}
    	SmartDashboard.putBoolean( "DB/Button " + port, b );
    }
    /**
	   * Retrieves the state of buttons on the "Basic" tab of the Labview Dashboard (0-3)
	   */
    public static boolean getButton( int port, boolean _default ){
    	if( port < 0 || port > 3 ){
    		throw new IllegalArgumentException( "port must be between 0 and 3" );
    	}
    	return SmartDashboard.getBoolean( "DB/String " + port, _default );
    }
    /**
	   * Sets the LEDs on the "Basic" tab of the Labview Dashboard (0-3)
	   */
    public static void setLED( int port, boolean b ){
    	if( port < 0 || port > 3 ){
    		throw new IllegalArgumentException( "port must be between 0 and 3" );
    	}
    	SmartDashboard.putBoolean( "DB/LED " + port, b );
    }
    
    /**
	   * Sets the sliders on the "Basic" tab of the Labview Dashboard (0-3)
	   */
    public static void setSlider( int port, double num ){
    	if( port < 0 || port > 3 ){
    		throw new IllegalArgumentException( "port must be between 0 and 3" );
    	}
    	if( num < 0 || num > 5 ){
    		throw new IllegalArgumentException( "num must be between 0 and 5" );
    	}
    	SmartDashboard.putNumber( "DB/Slider " + port, num );
    }
    
    /**
	   * Retrieves the value of the sliders on the "Basic" tab of the Labview Dashboard (0-3)
	   */
    public static double getSlider( int port, int _default ){
    	if( port < 0 || port > 3 ){
    		throw new IllegalArgumentException( "port must be between 0 and 3" );
    	}
    	return SmartDashboard.getNumber( "DB/Slider " + port, _default );
    }
}

