/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
  public static WPI_TalonSRX frontRightMotor = new WPI_TalonSRX(4);
  public static WPI_TalonSRX backRightMotor = new WPI_TalonSRX(3);
  public static WPI_TalonSRX frontLeftMotor = new WPI_TalonSRX(1);
  public static WPI_TalonSRX backLeftMotor = new WPI_TalonSRX(2);

  public static WPI_TalonSRX lift = new WPI_TalonSRX(99);

  public static DigitalInput liftUpSwitch = new DigitalInput(1);
  public static DigitalInput liftDownSwitch = new DigitalInput(2);

  public static final int PCM = 98;

  public static final int solenoid1Channel1 = 0;
  public static final int solenoid1Channel2 = 1;
}
