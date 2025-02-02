package frc.robot.constants;

import static edu.wpi.first.units.Units.*;

import edu.wpi.first.units.measure.LinearVelocity;
import edu.wpi.first.units.measure.Time;
import frc.robot.commands.drive.AutoAlignment;
import frc.robot.utils.CustomPIDs.MaplePIDController;

public class DriveControlLoops {
    public static final Time DISCRETIZE_TIME = Seconds.of(0.03);
    public static final LinearVelocity SWERVE_VELOCITY_DEADBAND = MetersPerSecond.of(0.03);
    public static final MaplePIDController.MaplePIDConfig CHASSIS_ROTATION_CLOSE_LOOP =
            new MaplePIDController.MaplePIDConfig(
                    Math.toRadians(300), Math.toRadians(90), 0, Math.toRadians(2), 0, true, 0);

    public static final MaplePIDController.MaplePIDConfig CHASSIS_TRANSLATION_CLOSE_LOOP =
            new MaplePIDController.MaplePIDConfig(3, 0.4, 0, 0.03, 0, false, 0);

    public static final double ROTATIONAL_LOOKAHEAD_TIME = 0.02, TRANSLATIONAL_LOOKAHEAD_TIME = 0.02;

    public static final boolean USE_TORQUE_FEEDFORWARD = true;

    public static final AutoAlignment.AutoAlignmentConfigurations REEF_ALIGNMENT_CONFIG_AUTONOMOUS =
            new AutoAlignment.AutoAlignmentConfigurations(
                    0.8,
                    Meters.of(0.5),
                    MetersPerSecond.of(1.5),
                    MetersPerSecond.of(2),
                    Meters.of(0.3),
                    MetersPerSecond.of(0.8),
                    MetersPerSecond.of(0.1),
                    MetersPerSecondPerSecond.of(2.5));

    public static final AutoAlignment.AutoAlignmentConfigurations REEF_ALIGNMENT_CONFIG =
            new AutoAlignment.AutoAlignmentConfigurations(
                    0.6,
                    Meters.of(0.6),
                    MetersPerSecond.of(1.5),
                    MetersPerSecond.of(1.8),
                    Meters.of(0.35),
                    MetersPerSecond.of(0.6),
                    MetersPerSecond.of(0.1),
                    MetersPerSecondPerSecond.of(2));

    public static final AutoAlignment.AutoAlignmentConfigurations STATION_ALIGNMENT_CONFIG =
            new AutoAlignment.AutoAlignmentConfigurations(
                    0.75,
                    Meters.of(0.6),
                    MetersPerSecond.of(3),
                    MetersPerSecond.of(3),
                    Meters.of(0.2),
                    MetersPerSecond.of(1),
                    MetersPerSecond.of(0.6),
                    MetersPerSecondPerSecond.of(4));
}
