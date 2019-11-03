/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  WPI_TalonSRX leftMotor = RobotMap.leftMotor;
  WPI_TalonSRX rightMotor = RobotMap.rightMotor;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void init () {
    leftMotor.setNeutralMode(NeutralMode.Brake);
    rightMotor.setNeutralMode(NeutralMode.Brake);
    leftMotor.setInverted(false);
    rightMotor.setInverted(true);
  }

  public void forward() {
    leftMotor.set(0.5);
    rightMotor.set(0.5);
  }

  public void stop() {
    leftMotor.set(0);
    rightMotor.set(0);
  }

  public void leftMotorForward () {
    leftMotor.set(0.5);
  }

  public void rightMotorForward () {
    rightMotor.set(0.5);
  }

}
