package org.oops.java;

/**
 * Method Overriding
 */
/**
 * Checked Exception:- ClassNotFoundException: Throws when the program tries to
 * load a class at runtime but the class is not found because its not present in
 * the correct location or it is missing from the project. InterruptedException:
 * Thrown when a thread is paused and another thread interrupts it. IOException:
 * Throws when input/output operation fails InstantiationException: Thrown when
 * the program tries to create an object of a class but fails because the class
 * is abstract, an interface, or has no default constructor. SQLException:
 * Throws when there’s an error with the database. FileNotFoundException: Thrown
 * when the program tries to open a file that doesn’t exist
 * 
 * UnChecked Exception:- ArithmeticException: It is thrown when there’s an
 * illegal math operation. ClassCastException: It is thrown when you try to cast
 * an object to a class it does not belongs to. NullPointerException: It is
 * thrown when you try to use a null object (e.g. accessing its methods or
 * fields) ArrayIndexOutOfBoundsException: It occurs when we try to access an
 * array element with an invalid index. ArrayStoreException: It happens when you
 * store an object of the wrong type in an array. IllegalThreadStateException:
 * It is thrown when a thread operation is not allowed in its current state
 */
public class RunTimePolymorphism {
	static class Animal {
		public void makeSound() {
			System.out.println("Some generic animal sound...");
		}
	}

	static class Dog extends Animal {
		@Override
		public void makeSound() {
			try {
				System.out.println("Bark! Bark!");
			} catch (Exception e) {
				System.out.println("exception is " + e);
			}

		}
	}

	public static void main(String[] args) {
		Animal myAnimal = new Dog(); // Upcasting
		myAnimal.makeSound(); // Calls overridden method in Dog class
	}
}
