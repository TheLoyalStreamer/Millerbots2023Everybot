package frc.robot.Commands.drive;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class DefaultDrive extends CommandBase{
    private final DriveSubsystem m_driveSubsystem;
    private final double m_forward;
    private final double m_turn;

    public DefaultDrive(DriveSubsystem subsystem, double forward, double turn) {
        m_driveSubsystem = subsystem;
        m_turn = turn;
        m_forward = forward;
    }
    @Override
    public void execute() {
        m_driveSubsystem.setDriveMotors(m_forward, m_turn);
    }
    @Override
    public void end(boolean interrupted) {

    }
    @Override
    public boolean isFinished() {
        return false;
    }
}
