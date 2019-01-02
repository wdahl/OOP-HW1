package com.ualbany.hw1.problem3;

//Conatins information for a person object
public class Person {
	//Instance variables 
	private String firstName; //first name of person
	private String lastName; //last name of person
	private Address address = new Address(); //address of person
	private CheckingBankAccount checking = new CheckingBankAccount(); //checking account of person
	
	
	//constructor for Person class when no parameters are given
	Person() {
		firstName = "";
		lastName = "";
		address = null;
		checking = null;
	}
	
	//constructor when only first and last name are given
	//@Param fname: first name
	//@Param lname: last name
	Person(String fname, String lname){
		firstName = fname;
		lastName = lname;
		address = null;
		checking = null;
	}
		
	//constructor for Person class when parameter are given
	//@Param fname: first name of person
	//@Param lname: last name of person
	//@Param s: monthly salary of person
	Person(String fname, String lname, Address a, CheckingBankAccount c){
		firstName = fname;
		lastName = lname;
		address = a;
		checking = c;
	}
	
	//sets first name of person
	//@Param fname: first name of person
	public void setFirstName(String fname) {
		firstName = fname;
	}
	
	//sets last name of person
	//@Param lname: first name of person
	public void setLastName(String lname) {
		lastName = lname;
	}
	
	//sets the persons address
	//@Param a: the address
	public void setAddress(Address a) {
		address = a;
	}
	
	//sest the checking account for the person
	//@Param c: the checking account
	public void setChecking(CheckingBankAccount c) {
		checking = c;
	}
	
	//gets first name of the Person
	//@return firstName: first name of Person
	public String getFirstName() {
		return firstName;
	}
	
	//gets last name of the Person
	//@return lastName: last name of Person
	public String getLastName() {
		return lastName;
	}
	
	//gets the address of the person
	//@return address: the persons address
	public Address getAddress() {
		return address;
	}
	
	//gets the checking account of the person
	//@return checking: the checking account of the person
	public CheckingBankAccount getChecking() {
		return checking;
	}
	
	//prints out formated infomration of the person
	public void print() {
		System.out.println(firstName + " " + lastName);
		address.print();//print method in address class
		System.out.printf("Current Balance: $%.2f\n", checking.getValue());
	}
}
