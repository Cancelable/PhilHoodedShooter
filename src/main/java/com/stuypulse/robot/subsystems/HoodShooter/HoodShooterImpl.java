package com.stuypulse.robot.subsystems.HoodShooter;

import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.stuypulse.robot.constants.Ports;

public class HoodShooterImpl extends HoodShooter {
    
    // hood motor (hood)
    private CANSparkMax hoodMotor;

    // flywheel motors (goated)
    private CANSparkMax centralMotor;
    private CANSparkMax backMotor;

    // hood motor encoder
    private AbsoluteEncoder hoodEncoder;
    
    // flywheel motor encoder
    private AbsoluteEncoder centralEncoder;
    private AbsoluteEncoder backEncoder;

    public HoodShooterImpl() {
        hoodMotor = new CANSparkMax(Ports.SchoolShooter.HOOD, MotorType.kBrushless);
        centralMotor = new CANSparkMax(Ports.SchoolShooter.CENTRAL, MotorType.kBrushless);
        backMotor = new CANSparkMax(Ports.SchoolShooter.BACK, MotorType.kBrushless);

        hoodEncoder = hoodMotor.getAbsoluteEncoder();
        centralEncoder = centralMotor.getAbsoluteEncoder();
        backEncoder = backMotor.getAbsoluteEncoder();
    }

    void setHoodMotorSpeed(double hoodMotorSpeed) {
        hoodMotor.set(hoodMotorSpeed);
    }
        
    void setShooterSpeed(double centralSpeed, double backSpeed) {
        centralMotor.set(centralSpeed);
        backMotor.set(backSpeed);
    }

    double getHoodMotorSpeed() {
        return hoodMotor.get();
    }
    
}
