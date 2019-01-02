package com.ualbany.hw1.problem2;

//imports
import java.lang.Math;//Math class
import java.util.Random;//Random class

//Methods to performs tasks in Problem 2
public class HW1Problem2 {
	//finds if two numbers are a multiple of each other
	//@Param firstInt: first integer
	//@Param secondInt: Second integer
	//@return true: if first number divisible by second number
	//@return false: if first number is not divisible by second number
	public boolean multiple(int firstInt, int secondInt) {
		//checks if remainder of the first number and the second number is zero
		if((firstInt % secondInt) == 0) {
			return true;
		}
		
		return false;
	}
	
	//gets the remainder of a number divided by 7
	//@Param i: integer to be divided by 7
	//@return remainder of i/7
	public int remainder(int i) {
		return i % 7;
	}
	
	//calculates the distance between two points
	//@Param x1: x1 coordinate
	//@Param y1: y1 coordinate
	//@Param x2: x2 coordinate
	//@Param y2: y2 coordinate
	//@return distance between the points
	public double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	}
	
	//simulates 10 random flips of a coin
	public void flip() {
		//declare variables
		Random rand = new Random();//creates new instance of random class
		int randInt; // random integer generated
		
		//loops 9 times to print out the result of the flips
		for(int i=0; i<9; i++) {
			randInt = rand.nextInt(2); // generates random int between 0 and 1
			
			//if number generated is 0 then the "coin" is heads
			if(randInt == 0) {
				System.out.print("Heads, ");
			}
			//if number is 1 the "coin" is tails
			else {
				System.out.print("Tails, ");
			}
		}
		
		//tenth flip with different print structure for formating purposes
		randInt = rand.nextInt(2);
		
		if(randInt == 0) {
			System.out.print("Heads");
		}
		else {
			System.out.print("Tails");
		}
	}
}
