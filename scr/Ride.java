// Manages theme park rides, queues, and visitor history

public class Ride{
	
	// Ride instance variables
	
	private String rideName;
	private int minHeight;
	private int maxRider; // Maximum riders per cycle
	private Employee rideOperator; // Employee operating the ride
	    
    
    // Default constructor
    public Ride() {
        this.rideName = "";
        this.minHeight = 0;
        this.maxRider = 1;
        this.rideOperator = null;
    }
    
    // Parameterized constructor
    public Ride(String rideName, int minHeight, int maxRider, Employee rideOperator) {
        this.rideName = rideName;
        this.minHeight = minHeight;
        this.maxRider = maxRider;
        this.rideOperator = rideOperator;
    }
    
    // Getters and setters
    public String getRideName() {
        return rideName;
    }
    
    public void setRideName(String rideName) {
        this.rideName = rideName;
    }
    
    public int getMinHeight() {
        return minHeight;
    }
    
    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }
    
    public int getMaxRider() {
        return maxRider;
    }
    
    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }
    
    public Employee getRideOperator() {
        return rideOperator;
    }
    
    public void setRideOperator(Employee rideOperator) {
        this.rideOperator = rideOperator;
    }
}