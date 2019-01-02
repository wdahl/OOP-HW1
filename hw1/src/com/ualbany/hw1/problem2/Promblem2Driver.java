package com.ualbany.hw1.problem2;

public class Promblem2Driver {
	public static void main(String[] args) {
		//declare variables
		HW1Problem2 test = new HW1Problem2();//creates instance of the HW1Problme2 class
		
		//tests multiple method
		System.out.println(test.multiple(4, 2)); //true
		System.out.println(test.multiple(3, 2)); //false
		
		//tests remainder method
		System.out.println(test.remainder(15));//1
		
		//tests distance method
		System.out.println(test.distance(0, 0, 1, 1));//sqrt(2)
		
		//tests flip method
		test.flip();

	}
}
