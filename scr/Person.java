// Abstract Person class, base class for Employee and Visitor

public abstract class Person {
	
	// Three instance variables for person
	
	protected String name;
	protected int age;
	protected String address;
	
	// Default constructor
	
	public Person() {
		this.name = " ";
		this.age = 0;
		this.address = " ";
	}
	
	// Parameterized constructor
	
	public Person(String name, int age, String address) {
		
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	// Getters and setters methods for Person variables
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	// Override toString for printing person details
	
	@Override
	public String toString() {
		
		 return "Name: " + name + ", Age: " + age + ", Address: " + address;
	}
	
	
}