package com.ualbany.hw1.problem1;

//Holds name and salary information of an employee
public class Employee {
	//Instance variables 
	private String firstName; //first name of employee
	private String lastName; //last name of employee
	private double salary; //monthly salary of employee
	
	//constructor for Employee class when no parameters are given
	Employee() {
		firstName = "";
		lastName = "";
		salary = 0.0;
	}
	
	//constructor for Employee class when parameter are given
	//@Param fname: first name of employee
	//@Param lname: last name of employee
	//@Param s: monthly salary of employee
	Employee(String fname, String lname, double s){
		firstName = fname;
		lastName = lname;
		//checks if monthly salary given is negative
		//if so salary set to 0.0
		if(s < 0.0) {
			salary = 0.0;
		}
		else {
			salary = s;
		}
	}
	
	//sets first name of employee
	//@Param fname: first name of employee
	public void setFirstName(String fname) {
		firstName = fname;
	}
	
	//sets last name of employee
	//@Param lname: first name of employee
	public void setLastName(String lname) {
		lastName = lname;
	}
	
	//sets monthly salary of employee
	//@Param s: monthly salary of employee
	public void setSalary(double s) {
		if(s < 0.0) {
			salary = 0.0;
		}
		else {
			salary = s;
		}
	}
	
	//gets first name of the employee
	//@return firstName: first name of employee
	public String getFirstName() {
		return firstName;
	}
	
	//gets last name of the employee
	//@return lastName: last name of employee
	public String getLastName() {
		return lastName;
	}
	
	//gets monthly salary of the employee
	//@return salary: monthly salary of employee
	public double getSalary() {
		return salary;
	}
}
