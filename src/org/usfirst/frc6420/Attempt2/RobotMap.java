// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6420.Attempt2;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveBaseRightA;
    public static SpeedController driveBaseRightB;
    public static SpeedController driveBaseLeftA;
    public static SpeedController driveBaseLeftB;
    public static RobotDrive driveBaseDriveBaseController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DoubleSolenoid shift, gearDrop;
    public static Encoder rightDriveEncoder, leftDriveEncoder;
    public static ADXRS450_Gyro gyro;
    public static AnalogInput ultrasonicSensor;
    public static PowerDistributionPanel pdp;
    public static Solenoid visionLEDs;
    public static VictorSP climber;
    public static DigitalInput dio6, dio7, dio5;
    //public static UsbCamera cam0, cam1;

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveBaseRightA = new VictorSP(0);
        LiveWindow.addActuator("DriveBase", "Right A", (VictorSP) driveBaseRightA);
        
        driveBaseRightB = new VictorSP(1);
        LiveWindow.addActuator("DriveBase", "Right B", (VictorSP) driveBaseRightB);
        
        driveBaseLeftA = new VictorSP(2);
        LiveWindow.addActuator("DriveBase", "Left A", (VictorSP) driveBaseLeftA);
        
        driveBaseLeftB = new VictorSP(3); 
        LiveWindow.addActuator("DriveBase", "Left B", (VictorSP) driveBaseLeftB);
        
        driveBaseDriveBaseController = new RobotDrive(driveBaseLeftA, driveBaseLeftB,
              driveBaseRightA, driveBaseRightB);
        
        driveBaseDriveBaseController.setSafetyEnabled(true);
        driveBaseDriveBaseController.setExpiration(0.5);
        driveBaseDriveBaseController.setSensitivity(0.5);
        driveBaseDriveBaseController.setMaxOutput(1.0);
        
        dio6 = new DigitalInput( 6 );
        dio7 = new DigitalInput( 7 );
        dio5 = new DigitalInput( 5 );


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        climber = new VictorSP( 4 );
        rightDriveEncoder = new Encoder( 0, 1 );
        leftDriveEncoder = new Encoder( 2, 3, true );
        shift = new DoubleSolenoid( 6, 7 );
        gearDrop = new DoubleSolenoid( 0, 1 );
        gyro = new ADXRS450_Gyro();
        ultrasonicSensor = new AnalogInput( 0 );
        //imu = new ADIS16448_IMU();
        pdp = new PowerDistributionPanel();
        visionLEDs = new Solenoid( 3 );
    }
}