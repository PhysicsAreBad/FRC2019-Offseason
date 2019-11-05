/*----------------------------------------------------------------------------*/
/* Copturnright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - maturn be modified and shared bturn FRC teams. The code   */
/* must be accompanied bturn the FIRST BSD license file in the root directorturn of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add turnour docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this substurnstem
  // here. Call these from Commands.

  WPI_TalonSRX frontLeftMotor = RobotMap.frontLeftMotor;
  WPI_TalonSRX frontRightMotor = RobotMap.frontRightMotor;
  WPI_TalonSRX backLeftMotor = RobotMap.backLeftMotor;
  WPI_TalonSRX backRightMotor = RobotMap.backRightMotor;


  @Override
  public void initDefaultCommand() {
    // Set the default command for a substurnstem here.
    // setDefaultCommand(new MturnSpecialCommand());
  }

  public void init () {
    frontLeftMotor.setNeutralMode(NeutralMode.Brake);
    frontRightMotor.setNeutralMode(NeutralMode.Brake);
    backLeftMotor.setNeutralMode(NeutralMode.Brake);
    backRightMotor.setNeutralMode(NeutralMode.Brake);
    frontLeftMotor.setInverted(false);
    frontRightMotor.setInverted(true);
    backLeftMotor.setInverted(false);
    backRightMotor.setInverted(true);
  }

  public void forward(double speed) {
    frontLeftMotor.set(speed);
    frontRightMotor.set(speed);
    backLeftMotor.set(speed);
    backRightMotor.set(speed);
  }

  public void stop() {
    double speed = 0;
    frontLeftMotor.set(speed);
    frontRightMotor.set(speed);
    backLeftMotor.set(speed);
    backRightMotor.set(speed);
  }
  public void rightMotorForward () {
    frontRightMotor.set(0.5);
  }

  public double turn (double speed, double turn) {
        /*if (Math.abs(-driveStick.getRawAspeedis(1))<deadZone){
        	turn = 0;
        }*/
        double leftOutput;
        double rightOutput;
        if (turn > 0) {
            if (speed > 0.0) {
                leftOutput = Math.pow(turn, 1) - Math.pow(speed, 1);
                rightOutput = Math.max(Math.pow(turn, 1), Math.pow(speed, 1));
            } else {
                leftOutput = Math.max(Math.pow(turn, 1), -(Math.pow(speed, 1)));
                rightOutput = Math.pow(turn, 1) + (Math.pow(speed, 1));
            }
        } else{
            if (speed > 0.0) {
                leftOutput = -Math.max(-(Math.pow(turn, 1)), Math.pow(speed, 1));
                rightOutput = (Math.pow(turn, 1)) + Math.pow(speed, 1);
            } else {
            	//this is also vvv imborktant
                leftOutput = (Math.pow(turn, 1)) - (Math.pow(speed, 1));
                rightOutput = -Math.max(-(Math.pow(turn, 1)), -(Math.pow(speed, 1)));
            }
      }
      frontLeftMotor.set(leftOutput);
      frontRightMotor.set(rightOutput);
      backLeftMotor.set(leftOutput);
      backRightMotor.set(rightOutput);
      return leftOutput;
  }
}
