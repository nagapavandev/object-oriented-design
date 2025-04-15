package org.oops.java;

/**
 * Inheritance allows a child class to inherit properties and methods from a
 * parent class. (Code Reusability)
 * 
 */

public class Inheritance {
	// Parent Class
	static class Vehicle {
		String brand = "Toyota";

		public void start() {
			System.out.println("Vehicle is starting...");
		}
	}

	// Child Class (Inherits from Vehicle)
	private static class Car extends Vehicle {
		int wheels = 4;

		public void showDetails() {
			System.out.println("Car Brand: " + brand); // Inherited property
			System.out.println("Number of wheels: " + wheels);
		}
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.start(); // Inherited method
		myCar.showDetails();
	}
}
