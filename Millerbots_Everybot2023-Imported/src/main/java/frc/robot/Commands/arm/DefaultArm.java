package frc.robot.Commands.arm;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;

public class DefaultArm extends CommandBase{
    private final ArmSubsystem m_armSubsystem;
    private final double m_percent;

    public DefaultArm(ArmSubsystem subsystem, double percent) {
        m_armSubsystem = subsystem;
        m_percent = percent;
    }
    @Override
    public void execute() {
        m_armSubsystem.setArmMotor(m_percent);
    }
    @Override
    public void end(boolean interrupted) {

    }
    @Override
    public boolean isFinished() {
        return false;
    }
}
