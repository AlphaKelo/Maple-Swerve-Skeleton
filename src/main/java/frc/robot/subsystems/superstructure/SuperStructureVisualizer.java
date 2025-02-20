package frc.robot.subsystems.superstructure;

import static edu.wpi.first.units.Units.*;

import edu.wpi.first.math.geometry.*;
import edu.wpi.first.units.measure.Distance;
import org.littletonrobotics.junction.Logger;

public class SuperStructureVisualizer {
    private static final Translation3d ARM_ZERO_POSITION = new Translation3d(0.265, 0, 0.37);
    private static final double ARM_ZERO_PITCH_RAD = Math.toRadians(130);

    public static void visualizeMechanisms(String key, Distance elevatorHeight, Rotation2d armAngle) {
        Translation3d elevatorHeightTranslation = new Translation3d(0, 0, elevatorHeight.in(Meters));
        Rotation3d armRotation = new Rotation3d(0, ARM_ZERO_PITCH_RAD - armAngle.getRadians(), 0);
        Pose3d[] poses = new Pose3d[] {
            // First stage elevator only ascends half the height.
            new Pose3d(elevatorHeightTranslation.div(2), new Rotation3d()),
            // Carriage ascends full height.
            new Pose3d(elevatorHeightTranslation, new Rotation3d()),
            // Arm ascends full height and rotates an angle
            new Pose3d(ARM_ZERO_POSITION.plus(elevatorHeightTranslation), armRotation)
        };
        Logger.recordOutput("SuperStructure/" + key, poses);
    }
}
