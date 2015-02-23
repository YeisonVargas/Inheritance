package com.examples;

import com.others.MountainBike;

/**
 * Test class applied for to practice inheritance concepts and create objects. 
 * @dateAndTime Feb 18, 2015 - 06:30:56 AM
 * @category #DesignPatterns  
 * @author yeisonvargas
 * @email yei558@gmail.com
 */
public class Test {

	public static void main(String[] args) {
		Bicycle obj0 = new Bicycle(15, 30, 25);
		// Protected and Default don't work - MountainBike and Test are in com.others package.
		// obj0.applyBrake(5);
		// obj0.speedUp(5);
		// It works. - Test is in com.examples package and MountainBike is in com.others package.
		   obj0.applyBrake(14);
		   obj0.speedUp(45);
		
		Bicycle obj1 = new MountainBike(1, 2, 3, 4);
		// Protected and Default don't work - MountainBike and Test are in com.others package.
		// obj2.applyBrake(8);
		// obj2.speedUp(3);
		// It works. - Test is in com.examples package and MountainBike is in com.others package.
		   obj1.applyBrake(10);
		   obj1.speedUp(15);
			
		MountainBike obj2 = new MountainBike(0, 20, 0, 0);
		// Protected and Default don't work - MountainBike and Test are in com.others package.
		// obj2.applyBrake(8);
		// obj2.speedUp(3);
		// Default don't work - Test is in com.examples package and MountainBike is in com.others package.
		   obj2.applyBrake(5); // This is Protected.	
		
	}

}
