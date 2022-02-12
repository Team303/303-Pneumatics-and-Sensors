package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.Constants;


public class Solenoid extends SubsystemBase{
    
    public static DoubleSolenoid solenoidRight;
    public static DoubleSolenoid solenoidLeft;

    public Solenoid(){
        solenoidRight = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.RINSOLENOIDPIN, Constants.ROUTSOLENOIDPIN);
        solenoidLeft = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.LINSOLENOIDPIN, Constants.LOUTSOLENOIDPIN);
    }

    public void rightToggle(){
        solenoidRight.toggle();
    }

    public void leftToggle(){
        solenoidLeft.toggle();
    }

}