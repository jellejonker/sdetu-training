package opdracht;

public class Student {
	private static int iD = 0; //Set a private static ID
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String userId;
	
	//Constructor
	Student(String name, String ssn) { //New Student constructor that takes name and SSN in the arguments
		this.name = name;
		this.ssn = ssn;
		email = (name.toLowerCase()).replaceAll("\\s+", "") + "@test.nl"; 	//Automatically create an email ID based on the name
		iD++;
		generateUserId();
		System.out.println("New student is created: " + name);
		System.out.println("ID: " + iD);
		System.out.println("SSN: " + ssn);
		System.out.println("Email: " + email);
		System.out.println("User ID: " + userId);
		System.out.println("-----------------------------------");
	}
	
	//Getters and setters -> Use encapsulation to set variables (phone, city, state)
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}	
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getState() {
		return state;
	}
	
	// Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
	public void generateUserId() {
		int r = (int) (Math.random() * (9000 - 1000) + 1000);
		userId = iD + r + ssn.substring(ssn.length()-4, ssn.length());
		//System.out.println("User ID: " + userId);
	}
	
}
