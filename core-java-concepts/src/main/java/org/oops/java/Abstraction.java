package org.oops.java;

/**
 * Abstraction is the process of hiding implementation details and showing only
 * the necessary functionality.
 * 			The implementation details are hidden, exposing only what’s necessary.
 */
public class Abstraction {
	abstract static class Animal {
		abstract void makeSound(); // Abstract method (no implementation)

		public void sleep() {
			System.out.println("Sleeping...");
		}
	}

	private static class Dog extends Animal {
		@Override
		void makeSound() {
			System.out.println("Woof! Woof!");
		}
	}

	// 2nd example
	interface Vehicle {
		void start(); // Abstract method (must be implemented by subclasses)
	}

	static class Car implements Vehicle {
		@Override
		public void start() {
			System.out.println("Car is starting...");
		}
	}

	public static void main(String[] args) {
		Animal myDog = new Dog();
		myDog.makeSound(); // Outputs: Woof! Woof!
		myDog.sleep(); // Outputs: Sleeping...

		Vehicle myCar = new Car();
		myCar.start(); // Outputs: Car is starting...
	}
}
