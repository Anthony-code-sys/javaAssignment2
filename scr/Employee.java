// Employee class extends Person

public class Employee extends Person {
	
	// Employee specific instance variables
	
	public String employeeId;
	public String position;
	
	// Default constructor
	
	public Employee() {
		
		super(); // Call parent constructor
		this.employeeId = " ";
		this.position = " ";
	}
	
	// Parameterized constructor
	
	public Employee(String name, int age, String address, String employeeId, String position) {
		
		super(name, age, address); //Call parent constructor
		this.employeeId = employeeId;
		this.position = position;
	}
	
	// Getters and setters methods for Employee variables
	
	public String getEmployeeId() {
		return employeeId; 
	}
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	// Override toString to include employee details
	
	@Override 
	public String toString() {
		
		return super.toString() + ", Employee ID: " + employeeId + ", Position: " + position;
	}
	

}