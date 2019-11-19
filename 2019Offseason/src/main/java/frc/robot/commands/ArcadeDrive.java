/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;

public class ArcadeDrive extends Command {
  DriveTrain driveTrain = Robot.driveTrain;  
  public ArcadeDrive() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    driveTrain.init();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double stick1 = Robot.oi.stick.getY();
    double stick2 = Robot.oi.stick2.getY();
    /*if (stick1 <= 0.2 || stick1 >= -0.2) {
      stick1 = 0;
    }
    if (stick2 <= 0.2 || stick2 >= -0.2) {
      stick2 = 0;
    }*/
    driveTrain.arcadeDrive(-stick1*0.5, -stick2*0.5);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    driveTrain.arcadeDrive(0, 0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
