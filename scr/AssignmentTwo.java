public class AssignmentTwo {

	
    // main method
	 public static void main(String[] args) {  

        AssignmentTwo assignment = new AssignmentTwo();
		 
		 
		 System.out.println(" Park Rides Visitor Management System \n");
		 
		 System.out.println(" Part Three : Queue Management \n");
		 assignment.partThree();

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
    public void partFourA(){}
    public void partFourB(){}
    public void partFive(){}
    public void partSix(){}
    public void partSeven(){} 

}