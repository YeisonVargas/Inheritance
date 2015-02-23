package com.others;

import com.examples.Bicycle;

/**
 * MountainBike class applied for to practice inheritance concepts.
 * @dateAndTime Feb 18, 2015 - 06:30:56 AM
 * @category #DesignPatterns  
 * @author yeisonvargas
 * @email yei558@gmail.com
 */
public class MountainBike extends Bicycle {

	public int mountainHeight;
	
	public MountainBike(int startCadence, int startSpeed, int startGear, int mountainHeight) {
		super(startCadence, startSpeed, startGear);
		this.mountainHeight = mountainHeight;
				
		// A subclass inherits all of the public and protected members of its parent,	
		// no mater what package	the	subclass	is	in.
		   applyBrake(1);
		// speedUp(10); It don't work because this is Default member. 
		// Private members never are inherited.
		// MountainBike and Bicycle are in the same package, Default and Protected work.
		// speedUp(12);
		// MountainBike and Bicycle are in the same package, public methods allow access private members.
		// this.setCadence(5); when cadence is private member.
		   
	}

	@Override
	public String toString() {
		return "MountainBike [mountainHeight=" + mountainHeight + ", cadence="
				+ cadence + ", gear=" + gear + ", speed=" + speed + "]";
	}
	

}
