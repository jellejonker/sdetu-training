package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoise = "Ring";
		bookTitle = "The lord of the rings";
		
		if (bookTitle.contains("ring")) {
			System.out.println("The book contains the word " + wordChoise);
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Jelle";
		String lastName = "Jonker";
		String SSN = "123456789";
		
		System.out.println("There are "+ SSN.length() + " digits in your SSN");
		
		//Print the initials plus last 4 digits of SSN 
		System.out.println(firstName.substring(0, 1));
		System.out.println(lastName.substring(0, 3));
		System.out.println(SSN.substring(5));
	}

}
