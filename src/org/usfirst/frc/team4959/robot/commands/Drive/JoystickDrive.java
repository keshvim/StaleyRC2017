package org.usfirst.frc.team4959.robot.commands.Drive;

import org.usfirst.frc.team4959.robot.Robot;
import org.usfirst.frc.team4959.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Allows user to drive robot with xbox controller
 */
public class JoystickDrive extends Command {

	DriveTrain drive;
	private double speedModifier = 1;

	public JoystickDrive(double speedModifier) {
		this.speedModifier = speedModifier;
		requires(Robot.driveTrain);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.driveTrain.worldOfTanksDrive(Robot.oi.getRightTrigger() * speedModifier,
				Robot.oi.getLeftTrigger() * speedModifier, Robot.oi.getLeftStickX() * speedModifier);

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
