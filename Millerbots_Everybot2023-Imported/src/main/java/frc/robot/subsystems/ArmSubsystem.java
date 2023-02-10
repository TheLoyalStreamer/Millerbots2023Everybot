package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ArmConstants;;

public class ArmSubsystem extends SubsystemBase{
    CANSparkMax arm = new CANSparkMax(5, MotorType.kBrushless);
    public ArmSubsystem() {
        arm.setInverted(true);
        arm.setIdleMode(IdleMode.kBrake);
        arm.setSmartCurrentLimit(ArmConstants.ARM_CURRENT_LIMIT_A);
    }
    
    /**
     * 
     * @param percent
     */

    public void setArmMotor(double percent) {
        arm.set(percent);
        SmartDashboard.putNumber("arm power (%)", percent);
        SmartDashboard.putNumber("arm motor current (amps)", arm.getOutputCurrent());
        SmartDashboard.putNumber("arm motor temperature (C)", arm.getMotorTemperature());
    }
}
