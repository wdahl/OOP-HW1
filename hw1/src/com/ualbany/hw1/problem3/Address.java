package com.ualbany.hw1.problem3;

//Class to hold address infomration
public class Address {
	//Feilds
	private String addressLine1; //address line 1
	private String addressLine2;// address line 2
	private String city;//city
	private String state;//state
	private String zip;//zip
	
	//default constructor
	Address(){
		addressLine1 = "";
		addressLine2 = "";
		city = "";
		state = "";
		zip = "";
	}
	
	//Constructor when no address line 2 is given
	//@Param address1: address line 1
	//@Param c: city
	//@Param s: state
	//@Param z: zip
	Address(String address1, String c, String s, String z){
		addressLine1 = address1;
		addressLine2 = "";
		city = c;
		state = s;
		zip = z;
	}
	
	//Constructor when all fields are given
	//@Param address1: address line 1
	//@Param address2: address line 2
	//@Param c: city
	//@Param s: state
	//@Param z: zip
	Address(String address1, String address2, String c, String s, String z){
		addressLine1 = address1;
		addressLine2 = address2;
		city = c;
		state = s;
		zip = z;
	}
	
	//sets address line 1
	//@Param addres1: address line 1
	public void setAddressLine1(String address1) {
		addressLine1 = address1;
	}
	
	//sets address line 2
	//@Param addres2: address line 2
	public void setAddressLine2(String address2) {
		addressLine2 = address2;
	}
	
	//sets the city
	//@Param c: the city
	public void setCity(String c) {
		city = c;
	}
	
	//sets the state
	//@Param s: the state
	public void setState(String s) {
		state = s;
	}
	
	//sets the zip
	//@Param z: the zip
	public void setZip(String z) {
		zip = z;
	}
	
	//gets address line 1
	//@return addresLine1: address line 1
	public String getAddressLine1() {
		return addressLine1;
	}
	
	//get addres line 2
	//@return addresLine2: 
	public String getAddressLine2() {
		return addressLine2;
	}
	
	//gets the city
	//@return city: the city
	public String getCity() {
		return city;
	}
	
	//gets the state
	//@return state: the state
	public String getState() {
		return state;
	}
	
	//gets the zip
	//@return zip: the zip
	public String getZip() {
		return zip;
	}
	
	//Prints out formated address information 
	public void print() {
		System.out.println(addressLine1);
		//checks if there is a value for address line 2
		if(!addressLine2.equals("")) {
			System.out.println(addressLine2);
		}
		System.out.println(city + ", " + state + " " + zip);
	}
}
