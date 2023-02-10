package frc.robot.Commands.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;

public class DefaultIntake extends CommandBase{
    private final IntakeSubsystem m_intakeSubsystem;
    private final double m_percent;
    private final int m_amps;

    public DefaultIntake(IntakeSubsystem subsystem, double percent, int amps) {
        m_intakeSubsystem = subsystem;
        m_percent = percent;
        m_amps = amps;
    }
    @Override
    public void execute() {
        m_intakeSubsystem.setIntakeMotor(m_percent, m_amps);
    }
    @Override
    public void end(boolean interrupted) {

    }
    @Override
    public boolean isFinished() {
        return false;
    }
}
