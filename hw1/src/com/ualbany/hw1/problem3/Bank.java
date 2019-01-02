package com.ualbany.hw1.problem3;

//Contains the Banks information
public class Bank {
	//fields
	private CheckingBankAccount checkingAccount = new CheckingBankAccount();//new checking account associated with the bank
	private String name; //name of the bank
	private Address address; //address of the bank
	
	//default constructor
	Bank(){
		checkingAccount = null;
		name = "";
		address = null;
	}
	
	//contructor when just the name of the bank is given
	//@Param n: name of the bank
	Bank(String n){
		name = n;
		checkingAccount = null;
		address = null;
	}
	
	//conturctor when all feilds are given
	//@Param c: the new checking account
	//@Param n: the name of the bank
	//@Param a: the banks address
	Bank(CheckingBankAccount c, String n, Address a){
		checkingAccount = c;
		name = n;
		address = a;
	}
	
	//sets the new checking account
	//@Param c: the new checking account
	public void setCheckingAccount(CheckingBankAccount c) {
		checkingAccount = c;
	}
	
	//sets the name of the bank
	//@Param n: the name of the bank
	public void setName(String n) {
		name = n;
	}
	
	//sets the address of the bank
	//@Param a: the address of the bank
	public void setAddress(Address a) {
		address = a;
	}
	
	//gets the checking account
	//@return checkingAccount: the new checking account
	public CheckingBankAccount getCheckingAccount() {
		return checkingAccount;
	}
	
	//gets the name of the bank
	//@return name: the name of the bank
	public String getName() {
		return name;
	}
	
	//gets the address of the bank
	//@return addres: the address of the bank
	public Address getAddress() {
		return address;
	}
	
	//main method to test the ChecnkingBankAccount, Address, Person, and Bank classes
	public static void main(String[] args) {
		//sets up new person object and intializes its fields
		Person person = new Person("John", "Smith");
		Address personAddress = new Address("165 Quail Street", "Apt. 2", "Albany", "NY", "12203");
		person.setAddress(personAddress);
		
		//sets up a new bank object and intializes its fields
		Bank bank = new Bank("KeyBank");
		Address bankAddress = new Address("1196 Western Ave", "Albany", "NY", "12203");
		bank.setAddress(bankAddress);
		
		//prints the name of the person and the bank
		System.out.println(person.getFirstName() + " " + person.getLastName());
		System.out.println(bank.getName());
		System.out.println("--------------------");

		//creates the new checking account for the person and intilazes its refrence in both the person and the bank
		CheckingBankAccount account = new CheckingBankAccount(1000);//checking account made with an intial deposit of 1000
		bank.setCheckingAccount(account);
		person.setChecking(account);
		
		//prints recite after depositing and withdrawing money
		account.deposit(1000);//deposits 1000 into the checking account
		person.print(); //prints persons information
		System.out.println("--------------------");
		account.withdraw(500);//withdraws 500 from the checking account
		person.print();
	}
}