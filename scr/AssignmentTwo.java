public class AssignmentTwo {

	
    // main method
	 public static void main(String[] args) {  

        AssignmentTwo assignment = new AssignmentTwo();
		 
		 
		 System.out.println(" Park Rides Visitor Management System \n");
		 
		 System.out.println(" Part Three : Queue Management \n");
		 assignment.partThree();

         System.out.println(" Part FourA : Collection Management \n");
		 assignment.partFourA();
		 
		 System.out.println(" Part FourB : Sorting Collection \n");
		 assignment.partFourB();
		 
		 System.out.println(" Part Five : Running Ride Cycles \n");
		 assignment.partFive();

    }

    // Part Three : Demonstrate queue functionality 
	 
	 public void partThree() {
		 
		 // Creating a rollerCoaster ride
		 
		 Employee operator = new Employee("John Smith", 30, "123 Main St", "EMP001", "Ride Operator");
		 Ride rollerCoaster = new Ride("Super Roller Coaster", 140, 4, operator);
		 
		 // Creating visitors for rollerCoaster ride
		 
		 Visitor visitor1 = new Visitor("Alice Johnson", 25, "456 Oak Ave", "Premium Pass", "2024-07-23");
	     Visitor visitor2 = new Visitor("Bob Wilson", 32, "789 Pine St", "Day Pass", "2024-07-23");
	     Visitor visitor3 = new Visitor("Carol Brown", 28, "321 Elm St", "Premium Pass", "2024-07-23");
	     Visitor visitor4 = new Visitor("David Lee", 22, "654 Maple Ave", "Student Pass", "2024-07-23");
         Visitor visitor5 = new Visitor("Emma Davis", 35, "987 Cedar St", "Day Pass", "2024-07-23\n");
         
         // Adding visitors to queue 
         
         rollerCoaster.addVisitorToQueue(visitor1);
         rollerCoaster.addVisitorToQueue(visitor2);
         rollerCoaster.addVisitorToQueue(visitor3);
         rollerCoaster.addVisitorToQueue(visitor4);
         rollerCoaster.addVisitorToQueue(visitor5);
         
         // Remove one vistor from queue
         
         rollerCoaster.removeVisitorFromQueue();
         
         // Print queue
         
         rollerCoaster.printQueue();
         
	 }
	 
	 // Part FourA: Demonstrate collection (LinkedList) functionality
	 
	 public void partFourA() {
		 
		 // Creating wateradventure ride
		 
		 Employee operator = new Employee("Jane Doe", 28, "111 River Rd", "EMP002", "Ride Operator");
		 Ride waterRide = new Ride("Water Adventure", 120, 6, operator);
		 
		 // Creating visitors for wateradventure ride
		 
		 Visitor visitor1 = new Visitor("Mike Taylor", 29, "222 Beach St", "Premium Pass", "2024-07-23");
	     Visitor visitor2 = new Visitor("Sarah Wilson", 31, "333 Shore Ave", "Day Pass", "2024-07-23");
	     Visitor visitor3 = new Visitor("Tom Anderson", 26, "444 Ocean Blvd", "Premium Pass", "2024-07-23");
	     Visitor visitor4 = new Visitor("Lisa Garcia", 33, "555 Wave St", "Student Pass", "2024-07-23");
         Visitor visitor5 = new Visitor("Chris Martinez", 27, "666 Surf Ave", "Day Pass", "2024-07-23\n");
	        
		 // Adding visitors to ride history
         
         waterRide.addVisitorToHistory(visitor1);
         waterRide.addVisitorToHistory(visitor2);
         waterRide.addVisitorToHistory(visitor3);
         waterRide.addVisitorToHistory(visitor4);
         waterRide.addVisitorToHistory(visitor5);
         
         // Checking if a visitor is in history
         waterRide.checkVisitorFromHistory(visitor4);
         
         // Print number of visitors
         waterRide.numberOfVisitors(); 
         
         // Print all visitors in history
         waterRide.printRideHistory();
         
	    }
	 
	 // Part FourB : Demostrate sorting functionality
	 
	 public void partFourB() {
		 
		 // Creating a Tornado spin ride
		 
		 Employee operator = new Employee("Mark Johnson", 35, "777 Hill St", "EMP003", "Senior Operator");
		 Ride spinRide = new Ride("Tornado Spin", 130, 8, operator);
		 
		 // Creating visitors with diffrent names and ages for sorting
		 
		 Visitor visitor1 = new Visitor("Zoe Chen", 24, "888 Valley Rd", "Premium Pass", "2024-07-23");
		 Visitor visitor2 = new Visitor("Alex Brown", 30, "999 Mountain Ave", "Day Pass", "2024-07-23");
	     Visitor visitor3 = new Visitor("Alex Brown", 25, "101 Forest St", "Student Pass", "2024-07-23"); // Same name, different age
         Visitor visitor4 = new Visitor("Diana White", 28, "202 Lake Ave", "Premium Pass", "2024-07-23");
         Visitor visitor5 = new Visitor("Ben Parker", 32, "303 Park Blvd", "Day Pass", "2024-07-23");
         
         // Adding visitors to ride history
         
         spinRide.addVisitorToHistory(visitor1);
         spinRide.addVisitorToHistory(visitor2);
         spinRide.addVisitorToHistory(visitor3);
         spinRide.addVisitorToHistory(visitor4);
         spinRide.addVisitorToHistory(visitor5);
         
         // printing vistors before sorting
         
         System.out.println("Before sorting:");
         spinRide.printRideHistory();
         
         // Sort the collection
         spinRide.sortRideHistory();
         
         // After sorting
         spinRide.printRideHistory();
		 
	 }
	 
	 // Part Five : Demonstrate running a ride cycle
	 
	 public void partFive() {
		 
		 // creating a bumper car ride with max of 3 riders per cycle
		 
		 Employee operator = new Employee("Lisa Thompson", 32, "404 Sunset Dr", "EMP004", "Ride Operator");
		 Ride bumperCars = new Ride("Bumper Cars", 100, 3, operator);
		 
		 // Creating 10 visitors
		 
		 Visitor[] visitors = new Visitor[15];
		 for(int i = 0; i < 15; i++) {
			 
			 visitors[i] = new Visitor("Visitor" + (i + 1), 20 + i, "Address" + (i + 1), "Day Pass", "2024-07-23");
			 bumperCars.addVisitorToQueue(visitors[i]);
			 
		 }
		 
		 // Printing queue before running Cycle
		 System.out.print("Queue before running cycle :\n");
		 bumperCars.printQueue();
		 
		// Running one cycle
		 bumperCars.runOneCycle(); 
		 
		// Printing queue after running cycle
		 System.out.println("\nQueue after running one cycle:");
		 bumperCars.printQueue();
		 
		// Printing ride history
	    System.out.println("\nRide history after one cycle:");
	    bumperCars.printRideHistory();
		 
	 }
    public void partSix(){}
    public void partSeven(){} 

}