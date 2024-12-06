package com.stuypulse.robot.subsystems.HoodShooter;

import com.stuypulse.robot.Robot;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HoodShooter extends SubsystemBase {

    public static final HoodShooter instance;

    static {
        if (Robot.isReal()) {
            instance = new HoodShooterImpl();
        } else {
            instance = new HoodShooter();
        }
    }

    public static HoodShooter getInstance() {
        return instance;
    }
    
    public HoodShooter() {
        
    }

}
