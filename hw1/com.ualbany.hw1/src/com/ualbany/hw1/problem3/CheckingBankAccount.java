package com.ualbany.hw1.problem3;

//Checking account object
public class CheckingBankAccount {
	//value in checking account
	private double value;
	
	//default constructor 
	CheckingBankAccount(){
		value = 0;
	}
	
	//constructor for initializing value
	//@Param v: value initially put into checking account
	CheckingBankAccount(double v){
		value = v;
	}
	
	//sets the value of the checking account
	//@Param v: Value to set in the checking account
	public void setValue(double v) {
		value = v;
	}
	
	//returns the value currently in the checking account
	//@return value: The value currently in the checking account
	public double getValue() {
		return value;
	}
	
	//withdraws the amount specified from the checking account
	//@Param amount: the amount to be withdrawn from the account
	public void withdraw(double amount) {
		//checks if the amount given is negative
		if(amount < 0) {
			System.out.println("Ammount withdrawn cannot be negative.");
		}
		//checks if the amount given exceeds the amount currently in the account
		else if(amount <= value) {
			value -= amount;//removes the amount from the total balance in the account
		}
		else {
			System.out.printf("Ammount withdrawn cannot exceed total balance: $%.2f\n" , value);
		}	
	}
	
	//deposits the amount into the checking account
	//@Param amount: amount to be deposited
	public void deposit(double amount) {
		//checks if the amount to be deposited is negative
		if(amount < 0) {
			System.out.println("Ammount deposited cannot be negative.");
		}
		else {
			value += amount;//adds the amount deposited to the total balance in the account
		}
	}
}
