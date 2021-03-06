package org.usfirst.frc.team4959.robot.commands.AutoModes;

import org.usfirst.frc.team4959.robot.commands.AutoCommands.Delay;
import org.usfirst.frc.team4959.robot.commands.AutoCommands.DriveStraight;
import org.usfirst.frc.team4959.robot.commands.AutoCommands.GyroDrive;
import org.usfirst.frc.team4959.robot.commands.GearDrop.CloseDrop;
import org.usfirst.frc.team4959.robot.commands.GearDrop.ExtendDrop;
import org.usfirst.frc.team4959.robot.commands.GearDrop.OpenDrop;
import org.usfirst.frc.team4959.robot.commands.GearDrop.RetractDrop;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Drops gear at center drop then goes and shoots at the right boiler
 */
public class CentGearToRightBoiler extends CommandGroup {

	// GyroDrive(Time, Speed)
	// GyroTurning(Turn, Speed)
	// DriveStraight(Time, Speed)

	public CentGearToRightBoiler() {

		// Drive to the airship
		addSequential(new DriveStraight(1.0, 0.5));
		addSequential(new DriveStraight(0.9, 0.2));
		addSequential(new GyroDrive(0.1, 0));

		// Release Gear
		addSequential(new ExtendDrop());
		addSequential(new Delay(0.2));
		addSequential(new OpenDrop());
		addSequential(new Delay(0.2));
		addSequential(new RetractDrop());

		// Back up from the airship
		// addSequential(new Delay(0.5));
		// addSequential(new DriveStraight(1, -0.6));
		addSequential(new DriveStraight(0.3, -0.5));
		addParallel(new CloseDrop());
		// addSequential(new GyroTurning(-0.1, 0.6));

		// // 90 degree turn towards boiler direction
		// // addSequential(new Delay(.3));
		// addSequential(new GyroTurning(75, -0.6));
		//
		// // Drive towards boiler direction
		// addSequential(new DriveStraight(2, 0.6));
		//
		// // Turn directly towards boiler
		// addSequential(new GyroTurning(15, 0.6));
		//
		// // Drive to boiler wall
		// addSequential(new DriveStraight(1, 0.7));
		// addSequential(new DriveStraight(1.3, 0.4));
		// addSequential(new DriveStraight(0.1, 0));
		//
		// // Shoot
		// addSequential(new AutoLoadAndShoot());
		//
		// // yolo it
		//
		// // skrt skrt
		// addSequential(new DriveStraight(0.5, -0.7));
		// addSequential(new GyroTurning(24, 0.6));
		// addSequential(new DriveStraight(0.3, -1.0));
	}
}