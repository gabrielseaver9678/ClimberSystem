/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSystem extends SubsystemBase {
  
  private WPI_TalonSRX rearLeftTalon;
  private WPI_TalonSRX rearRightTalon;
  private WPI_TalonSRX frontLeftTalon;
  private WPI_TalonSRX frontRightTalon;

  private SpeedControllerGroup leftDrive;
  private SpeedControllerGroup rightDrive;

  public DifferentialDrive dDrive;

  public DriveSystem() {
    rearLeftTalon = new WPI_TalonSRX(Constants.rearLeftID);
    rearRightTalon = new WPI_TalonSRX(Constants.rearRightID);
    frontLeftTalon = new WPI_TalonSRX(Constants.frontLeftID);
    frontRightTalon = new WPI_TalonSRX(Constants.frontRightID);

    leftDrive = new SpeedControllerGroup(rearLeftTalon, frontLeftTalon);
    rightDrive = new SpeedControllerGroup(rearRightTalon, frontRightTalon);

    dDrive = new DifferentialDrive(leftDrive, rightDrive);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
