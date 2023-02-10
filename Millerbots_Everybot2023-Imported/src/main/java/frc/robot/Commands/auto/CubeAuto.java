package frc.robot.Commands.auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Commands.arm.DefaultArm;
import frc.robot.Commands.drive.DefaultDrive;
import frc.robot.Commands.intake.DefaultIntake;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeSubsystem;

public class CubeAuto extends SequentialCommandGroup {
    public CubeAuto(DriveSubsystem drive, ArmSubsystem arm, IntakeSubsystem intake, double armExtendTime, double autoThrowTime, double autoDriveTime, double armOutputPower, int intakeCurrentLimit, double autoDriveSpeed, double intakeOutputPower) {
        addCommands(
            new DefaultDrive(drive, 0.0, 0.0),
            new DefaultIntake(intake, 0.0, intakeCurrentLimit),
            new DefaultArm(arm, armOutputPower).withTimeout(armExtendTime),
            new DefaultArm(arm, 0.0),
            new DefaultIntake(intake, -intakeOutputPower, intakeCurrentLimit).withTimeout(autoThrowTime),
            new DefaultIntake(intake, 0.0, intakeCurrentLimit),
            new DefaultArm(arm, -armOutputPower).withTimeout(armExtendTime),
            new DefaultArm(arm, 0.0),
            new DefaultDrive(drive, autoDriveSpeed, 0.0).withTimeout(autoDriveTime),
            new DefaultDrive(drive, 0.0, 0.0),
            new DefaultIntake(intake, 0.0, intakeCurrentLimit),
            new DefaultArm(arm, 0.0)
        );
    }
}
