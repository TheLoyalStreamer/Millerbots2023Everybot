package frc.robot;

public final class Constants {
    public static final class ArmConstants {
        public static final int ARM_CURRENT_LIMIT_A = 20;
        public static final double ARM_OUTPUT_POWER = 0.4;
    }
    public static final class IntakeConstants {
        public static final int INTAKE_CURRENT_LIMIT_A = 25;
        public static final int INTAKE_HOLD_CURRENT_LIMIT_A = 5;
        public static final double INTAKE_OUTPUT_POWER = 1.0;
        public static final double INTAKE_HOLD_POWER = 0.07;
    }
    public static final class AutoConstants {
        static final double ARM_EXTEND_TIME_S = 2.0;
        static final double AUTO_THROW_TIME_S = 0.375;
        static final double AUTO_DRIVE_TIME = 6.0;
        static final double AUTO_DRIVE_SPEED = -0.25;
    }
}
