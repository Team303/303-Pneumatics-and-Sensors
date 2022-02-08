package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class CompressorOff extends CommandBase {

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public CompressorOff() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.compressorPneumatcs);
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    Robot.compressorPneumatcs.disable();
  }
}
