package seven.lesson16;

import java.math.*;

public class CalculateForce {
	
	// F = mg(cos@)
	private final double GRAVITY = 9.810d;
	private double hillAngle = 60d;
	private double theWeight = 10.0d;
	private double theForceF;
	
	
	public CalculateForce() {
		
	}
	
	
	public double getHillAngle() {
		return hillAngle;
	}

	public void setHillAngle(double hillAngle) {
		this.hillAngle = hillAngle;
	}

	public double getTheWeight() {
		return theWeight;
	}

	public void setTheWeight(double theWeight) {
		this.theWeight = theWeight;
	}

	public double getTheForceF() {
		return theWeight * GRAVITY * Math.abs(Math.cos(hillAngle));
	}

	public void setTheForceF(double theForceF){
		
		this.theForceF = theForceF;
	}

	public double getGRAVITY() {
		return GRAVITY;
	}



}