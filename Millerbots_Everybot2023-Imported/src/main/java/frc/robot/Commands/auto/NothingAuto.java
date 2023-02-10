package frc.robot.Commands.auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Commands.arm.DefaultArm;
import frc.robot.Commands.drive.DefaultDrive;
import frc.robot.Commands.intake.DefaultIntake;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeSubsystem;

public class NothingAuto extends SequentialCommandGroup{
    
    public NothingAuto(DriveSubsystem drive, ArmSubsystem arm, IntakeSubsystem intake, int intakeCurrentLimit) {
        addCommands(
            new DefaultDrive(drive, 0.0, 0.0),
            new DefaultIntake(intake, 0.0, intakeCurrentLimit),
            new DefaultArm(arm, 0.0)
        );
    }
}
