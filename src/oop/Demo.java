package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	
	void eat(){
		System.out.println(email);
	}
	void sleep(){
		System.out.println(name + " is sleeping");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		//Instantiate an object
		Person person1 = new Person();
		
		//Define properties
		person1.name = "Joe";
		person1.email = "joe@testmail.com";
		person1.phone = "1234567890";
		
		//Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
				
		
		/*
		//Person
		
		//Atributes, variables, adjectives, descripters
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "123456789";
		
		//Action, activity, behavior
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		//What if we wanted to do this for another person?
		String name2 = "Sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "123456789";
		
		//Action, activity, behavior
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
		
		//What about binding attributes and properties together?
	}
	
	//Enhance by adding functions to minimize code
	
	static void walking (String name) {
		System.out.println(name + " is walking");
	*/	
	}
	

}
