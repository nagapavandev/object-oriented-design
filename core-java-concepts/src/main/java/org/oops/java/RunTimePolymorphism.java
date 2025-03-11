package org.oops.java;

public class RunTimePolymorphism {
	static class Animal {
		public void makeSound() {
			System.out.println("Some generic animal sound...");
		}
	}

	static class Dog extends Animal {
		@Override
		public void makeSound() {
			System.out.println("Bark! Bark!");
		}
	}

	public static void main(String[] args) {
		Animal myAnimal = new Dog(); // Upcasting
		myAnimal.makeSound(); // Calls overridden method in Dog class
	}
}
