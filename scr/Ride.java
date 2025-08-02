import java.util.*;

// Ride class implements RideInterface
// Manages theme park rides, queues, and visitor history

public class Ride implements RideInterface{
	
	// Ride instance variables
	
	private String rideName;
	private int minHeight;
	private int maxRider; // Maximum riders per cycle
	private Employee rideOperator; // Employee operating the ride
	private int numOfCycles; // Number of cycles run
	    
	// Collections for managing visitors
    private Queue<Visitor> visitorQueue; // Queue for waiting visitors
    private LinkedList<Visitor> rideHistory; // History of visitors who took the ride
    
    // Default constructor
    public Ride() {
        this.rideName = "";
        this.minHeight = 0;
        this.maxRider = 1;
        this.rideOperator = null;
        this.numOfCycles = 0;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }
    
    // Parameterized constructor
    public Ride(String rideName, int minHeight, int maxRider, Employee rideOperator) {
        this.rideName = rideName;
        this.minHeight = minHeight;
        this.maxRider = maxRider;
        this.rideOperator = rideOperator;
        this.numOfCycles = 0;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
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
    
    public int getNumOfCycles() {
        return numOfCycles;
    }
    
    @Override 
    public void addVisitorToQueue(Visitor visitor) {
    	
    	if (visitor != null) {
    		
    		visitorQueue.offer(visitor);
    		 System.out.println("Visitor " + visitor.getName() + " added to queue successfully.");
    	} else {
            System.out.println("Failed to add visitor to queue - visitor is null.");
            }
    	
    	}
    
    @Override 
    public void removeVisitorFromQueue() {
    	
    	 if (!visitorQueue.isEmpty()) {
             Visitor removed = visitorQueue.poll();
             System.out.println("Visitor " + removed.getName() + " removed from queue successfully.\n");
         } else {
             System.out.println("Failed to remove visitor - queue is empty.");
         }
    	 
    }
    
	@Override
	public void printQueue() {
		
		if (visitorQueue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
            
		}
            
            System.out.println("Visitors in queue:\n");
            int position = 1;
            for (Visitor visitor : visitorQueue) {
                System.out.println(position + ". " + visitor.toString());
                position++;
		}
	}

	
	@Override
	public void addVisitorToHistory(Visitor visitor) {
		
        if (visitor != null) {
            rideHistory.add(visitor);
            System.out.println("Visitor " + visitor.getName() + " added to ride history successfully.");
        } else {
            System.out.println("Failed to add visitor to history - visitor is null.");
        }

	}

	@Override
	public boolean checkVisitorFromHistory(Visitor visitor) {
		
		 boolean found = rideHistory.contains(visitor);
	        if (found) {
	            System.out.println("Visitor " + visitor.getName() + " is in the ride history.");
	        } else {
	            System.out.println("Visitor " + visitor.getName() + " is not in the ride history.");
	        }
	        return found;
	}

	@Override
	public int numberOfVisitors() {
		
		 int count = rideHistory.size();
	        System.out.println("Number of visitors in ride history: " + count+"\n");
	        return count;
	}

	@Override
	public void printRideHistory() {
		
		if (rideHistory.isEmpty()) {
            System.out.println("Ride history is empty.");
            return;
        }
		
		 System.out.println("Ride History:\n");
	       
		 // Using Iterator as required 
		 
		 Iterator<Visitor> iterator = rideHistory.iterator();
		 int position = 1;
		 while (iterator.hasNext()) {
			 Visitor visitor = iterator.next();
			 System.out.println(position + ". " + visitor.toString());
			 position++;
		 }
	}
		
	@Override
	public void runOneCycle() {
		
		// Checking if ride operator is assigned
		if (rideOperator == null) {
			System.out.println("Cannot run ride - no ride operator assigned.");
			return;
			
		}
		
		// Checking if there are visitors in queue
		if (visitorQueue.isEmpty()) {
			
			System.out.println("Cannot run ride - no visitors in queue.");
			return;
			
		}
		
		 // Run the cycle - move visitors from queue to history
        int ridersThisCycle = Math.min(maxRider, visitorQueue.size());
        System.out.println("Running ride cycle - taking " + ridersThisCycle + " visitors on the ride.\n");

        for (int i = 0; i < ridersThisCycle; i++) {
            Visitor visitor = visitorQueue.poll();
            rideHistory.add(visitor);
            System.out.println("Visitor " + visitor.getName() + " is now on the ride!");
        }
        
        numOfCycles++;
        System.out.println("Ride cycle completed. Total cycles run: " + numOfCycles);
		
	}
		
}
	
