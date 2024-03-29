/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Lift extends Subsystem {

  public WPI_TalonSRX lift = RobotMap.lift;
  public DigitalInput forwardSwitch = RobotMap.liftUpSwitch;
  public DigitalInput reverseSwitch = RobotMap.liftDownSwitch;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    lift.setNeutralMode(NeutralMode.Brake);
  }

  public void liftUp () {
    lift.set(1);
  }

  public void liftStop () {
    lift.set(0);
  }

  public void liftDown () {
    lift.set(-1);
  }
}
