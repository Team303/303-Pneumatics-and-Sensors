// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;


public class CompressorPneumatcs extends SubsystemBase {
  
  /** Creates a new ExampleSubsystem. */
  
  Compressor compressor;

  public CompressorPneumatcs() {
    compressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void enable(){
    compressor.enableDigital();
  }
  
  public void disable() {
    compressor.disable();
  }

  public double currentGet() {
    return compressor.getCurrent();
  }
}
