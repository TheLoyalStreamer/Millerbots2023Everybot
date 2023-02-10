package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Commands.auto.ConeAuto;
import frc.robot.Commands.auto.CubeAuto;
import frc.robot.Commands.auto.NothingAuto;
import frc.robot.Constants.AutoConstants;
import frc.robot.Constants.IntakeConstants;
import frc.robot.Constants.ArmConstants;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeSubsystem;

public class RobotContainer {
    private final DriveSubsystem m_driveSubsystem = new DriveSubsystem();
    private final ArmSubsystem m_armSubsystem = new ArmSubsystem();
    private final IntakeSubsystem m_intakeSubsystem = new IntakeSubsystem();
    private final Command m_nothingAuto = new NothingAuto(m_driveSubsystem, m_armSubsystem, m_intakeSubsystem, IntakeConstants.INTAKE_CURRENT_LIMIT_A);
    private final Command m_coneAuto = new ConeAuto(m_driveSubsystem, m_armSubsystem, m_intakeSubsystem, AutoConstants.ARM_EXTEND_TIME_S, AutoConstants.AUTO_THROW_TIME_S, AutoConstants.AUTO_DRIVE_TIME, ArmConstants.ARM_OUTPUT_POWER, IntakeConstants.INTAKE_CURRENT_LIMIT_A, AutoConstants.AUTO_DRIVE_SPEED, IntakeConstants.INTAKE_OUTPUT_POWER);
    private final Command m_cubeAuto = new CubeAuto(m_driveSubsystem, m_armSubsystem, m_intakeSubsystem, 0.0, 0.0, 0.0, 0.0, 0, 0.0, 0.0);
    private static final String kNothingAuto = "do nothing";
    private static final String kConeAuto = "cone";
    private static final String kCubeAuto = "cube";
    private final SendableChooser<String> m_chooser = new SendableChooser<>();
    public RobotContainer() {
        m_chooser.setDefaultOption("do nothing", kNothingAuto);
        m_chooser.addOption("cone and mobility", kConeAuto);
        m_chooser.addOption("cube and mobility", kCubeAuto);
        SmartDashboard.putData("Auto choices", m_chooser);
    }
    public Command getAutonomousCommand() {
        if(m_chooser.getSelected() == kNothingAuto) {
            return m_nothingAuto;
        }
        if(m_chooser.getSelected() == kCubeAuto) {
            return m_cubeAuto;
        }
        if(m_chooser.getSelected() == kConeAuto) {
            return m_coneAuto;
        }
        return m_nothingAuto;
    }
}
