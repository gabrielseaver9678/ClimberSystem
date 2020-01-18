/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ClimberSystem extends SubsystemBase {
  
  public WPI_TalonSRX climberTalon;

  public ClimberSystem() {
    climberTalon = new WPI_TalonSRX(Constants.climberTalonID);
  }

  public void set(double speed) {
    climberTalon.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
