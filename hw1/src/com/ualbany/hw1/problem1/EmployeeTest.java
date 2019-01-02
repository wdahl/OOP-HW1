package com.ualbany.hw1.problem1;

//Tests the Employee class
public class EmployeeTest {
	//Main method
	public static void main(String args[]) {
		//Declared variables
		Employee employee1 = new Employee();//creates a new Employee object for employee 1
		Employee employee2 = new Employee("Jane", "Doe", -2000.0);//creates a new employee object for employee 2 and initializes its fields.
		double newEmployee1Salary; //monthly salary of employee 1 after a 10% raise
		double newEmployee2Salary; //monthly salary of employee 2 after a 10% raise
		
		//Initializes fields for employee 1
		employee1.setFirstName("John");
		employee1.setLastName("Smith");
		employee1.setSalary(4000);
		
		//Prints out the Yearly salary of both employees
		System.out.println("Yearly salary for " + employee1.getFirstName()
		+ " " + employee1.getLastName() + " is " + employee1.getSalary()*12 + ".");
		
		System.out.println("Yearly salary for " + employee2.getFirstName()
		+ " " + employee2.getLastName() + " is " + employee2.getSalary()*12 + ".");
		
		//gives both employees a 10% raise
		newEmployee1Salary = (employee1.getSalary() * .10) + employee1.getSalary();
		newEmployee2Salary = (employee2.getSalary() * .10) + employee2.getSalary();
		
		//Initializes the employees new salary
		employee1.setSalary(newEmployee1Salary);
		employee2.setSalary(newEmployee2Salary);
		
		//Prints out both employees new salary after the 10% raise
		System.out.println("The new yearly salary for " + employee1.getFirstName()
		+ " " + employee1.getLastName() + " is " + employee1.getSalary()*12 + ".");
		
		System.out.println("The new yearly salary for " + employee2.getFirstName()
		+ " " + employee2.getLastName() + " is " + employee2.getSalary()*12 + ".");
		
	}
}
