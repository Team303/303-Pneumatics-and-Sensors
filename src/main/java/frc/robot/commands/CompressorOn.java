// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.CompressorPneumatcs;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

/** An example command that uses an example subsystem. */
public class CompressorOn extends CommandBase {

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public CompressorOn() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.compressorPneumatcs);
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    Robot.compressorPneumatcs.enable();
  }
}
