package org.usfirst.frc.team4959.robot.commands.AutoModes;

import org.usfirst.frc.team4959.robot.commands.AutoCommands.DriveStraight;
import org.usfirst.frc.team4959.robot.commands.AutoCommands.GyroDrive;
import org.usfirst.frc.team4959.robot.commands.AutoCommands.GyroTurning;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightBoilerToRightGear extends CommandGroup {

	public RightBoilerToRightGear() {

		// Turn into the boiler (Drive straight and let it curve into it)

		// Shoot

		// Back up about a foot
		addSequential(new GyroDrive(0.5, -0.5));

		// Turn around just under 180
		addSequential(new GyroTurning(-160, 0.6));

		// Drive Straight in the direction of the right gear
		addSequential(new DriveStraight(0.6, 0.7));

		// Track Tape Near Gear Drop Location

		// Load Gear

		// Get past baseline (Back up and turn, then drive)
		addSequential(new GyroDrive(0.2, -0.7));
		addParallel(new GyroTurning(-75, 0.7));
		addSequential(new GyroDrive(0.5, -0.5));
		addSequential(new GyroTurning(-10, 0.1));
		addSequential(new GyroDrive(0.8, -0.6));
	}
}
