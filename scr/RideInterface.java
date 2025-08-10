// RideInterface methods that Ride class must implement

public interface RideInterface {
	
	// Queue management methods

	// To add a visitor to the queue
	void addVisitorToQueue(Visitor visitor);
	
	// To remove a visitor from the queue
	void removeVisitorFromQueue();
	
	// To print the list of waiting visitors in the queue
	void printQueue();
	
	// Ride operation method
	void runOneCycle();
	
	// History management methods
	
	// To add a visitor to the ride history
	void addVisitorToHistory(Visitor visitor);
	
	// To check whether the visitor is in the ride history
	boolean checkVisitorFromHistory(Visitor visitor);
	
	// To return the number of Visitors in the ride history
    int numberOfVisitors();
    
    // To print the list of visitors who took the rides
    void printRideHistory();
}