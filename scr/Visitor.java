// Visitor class extends Person

public class Visitor extends Person {
	
	// Visitor specific instance variables
	
	private String ticketType;
	private String visitDate;
	
	// Default constructor
	
	public Visitor() {
		
		super();
		this.ticketType = " ";
		this.visitDate = " ";
	}
	
	// Parameterized constructor
	
	public Visitor(String name, int age, String address, String ticketType, String visitDate) {
		super(name, age, address);
		this.ticketType = ticketType;
		this.visitDate =  visitDate;
		
	}
	
	// Getter and setter methods for Visitor variables
	
	public String getTicketType() {
		return ticketType;
		
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;	
		
	}
	
	public String getVisitDate() {
		return visitDate;
		
	}
	
	public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
        
    }
	
	 // Override toString to include visitor details
	
	@Override
	public String toString() {
		
		return super.toString() + ", Ticket Type: " + ticketType + ", Visit Date: " + visitDate;
	}
	

}
