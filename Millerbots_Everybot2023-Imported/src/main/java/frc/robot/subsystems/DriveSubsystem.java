package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase{
    CANSparkMax driveLeftSpark = new CANSparkMax(1, MotorType.kBrushed);
    CANSparkMax driveRightSpark = new CANSparkMax(2, MotorType.kBrushed);
    VictorSPX driveLeftVictor = new VictorSPX(3);
    VictorSPX driveRightVictor = new VictorSPX(4);
    public DriveSubsystem() {
        driveLeftSpark.setInverted(false);
        driveLeftVictor.setInverted(false);
        driveRightSpark.setInverted(false);
        driveRightVictor.setInverted(false);
    }
    /**
     * @param forward
     * @param turn
     */
    public void setDriveMotors(double forward, double turn) {
        SmartDashboard.putNumber("drive forward power (%)", forward);
        SmartDashboard.putNumber("drive turn power (%)", turn);
    
        double left = forward - turn;
        double right = forward + turn;
    
        SmartDashboard.putNumber("drive left power (%)", left);
        SmartDashboard.putNumber("drive right power (%)", right);
    
        driveLeftSpark.set(left);
        driveLeftVictor.set(ControlMode.PercentOutput, left);
        driveRightSpark.set(right);
        driveRightVictor.set(ControlMode.PercentOutput, right);
      }
}
