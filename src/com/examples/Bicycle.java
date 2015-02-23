package com.examples;

/**
 * Bicycle class applied for to practice inheritance concepts.
 * @dateAndTime Feb 18, 2015 - 06:30:56 AM
 * @category #DesignPatterns  
 * @author yeisonvargas
 * @email yei558@gmail.com
 */
public class Bicycle {
	
	public int cadence;
	public int gear;
	public int speed;
	
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		cadence = startCadence;
		gear = startGear;
		speed = startSpeed;
	}
	
	public void setCadence(int newValue) {
		cadence = newValue;
	}
	
	public void setGear(int newValue) {
		gear = newValue;
	}
	
	// Protected
	protected void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	// Default
	void  speedUp(int increment) {
		speed += increment;
	}

}
