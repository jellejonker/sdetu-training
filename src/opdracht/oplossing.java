package opdracht;

public class oplossing {

	public static void main(String[] args) {
		//Create Student
		Student2 stu1 = new Student2 ("Jelle", "123654789");
		Student2 stu2 = new Student2 ("Jan", "546987123");
		Student2 stu3 = new Student2 ("Henk", "159753654");
		
		stu1.enroll("Math151");
		stu1.enroll("Eng345");
		stu1.enroll("His211");
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(600);
		stu1.checkBalance();
		System.out.println(stu1.toString());

	}

}

class Student2 {
	//Properties
	private static int iD = 0;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	
	
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	//Constructor
	public Student2 (String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	
	//Getters and setters
	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@test.nl";
		System.out.println("Your email: " + email);
	}
	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * (max - min));
		randNum = randNum + min;
		userId = iD + "" + randNum + ssn.substring(5);
		System.out.println(userId);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment: $" + amount);
		balance = balance - amount;
	}
	
	public void checkBalance() {
		System.out.println("Balance: $"+ balance);
	}
	
	public void showCourses() {
		System.out.println("Courses: "+ courses);
	}
	
	public String toString() {
		return "[NAME: " + name + " ]\n[COURSES: " + courses + " ]\n[Balance: " + balance + " ]";
		
	}
	
}
