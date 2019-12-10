/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Cylinder extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public DoubleSolenoid solenoid1 = new DoubleSolenoid(RobotMap.PCM, RobotMap.solenoid1Channel1, RobotMap.solenoid1Channel2);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void forward() {
    solenoid1.set(DoubleSolenoid.Value.kForward);
  }

  public void reverse() {
    solenoid1.set(DoubleSolenoid.Value.kReverse);
  }

  public void off() {
    solenoid1.set(DoubleSolenoid.Value.kOff);
  }
}