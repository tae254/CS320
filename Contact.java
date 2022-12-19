package contactService;

public class Contact {
	private String firstName;
	private String lastName;
	private String id;
	private String phoneNumber;
	private String address;
	
	
	// If statements to check requirements 
	
	public Contact(String firstName, String lastName, String id, String phoneNumber, String address) {
		
		super();
		
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Please enter First Name in the correct format");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Please enter Last Name in the correct format");
		}
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID format");
		}
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.address = address;
		
			
	
	}
	// getter functions
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getID() {
		return id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	
	// setter functions
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setID(String id) {
		this.id = id;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Contact: firstName = " + firstName + ", lastName = " + lastName + 
				", id = " + id + ", phoneNumber = " + phoneNumber + ", address = " + address;
	}

}
