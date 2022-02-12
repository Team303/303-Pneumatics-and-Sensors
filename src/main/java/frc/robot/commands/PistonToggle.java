// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.


package frc.robot.commands; 

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;


public class PistonToggle extends CommandBase {
  
  String side;
  public PistonToggle(String side) {
      addRequirements(Robot.solenoid);
      this.side = side;
      
  }
  
  @Override
  public void initialize() {
    if (side.toLowerCase() == "right"){
        Robot.solenoid.rightToggle();
    }
    else{
        Robot.solenoid.leftToggle();
    }
  }  
  
}