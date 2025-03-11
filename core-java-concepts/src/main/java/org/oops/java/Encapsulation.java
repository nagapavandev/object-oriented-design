package org.oops.java;

/**
 * Encapsulation is the process of wrapping data (variables) and code (methods)
 * together as a single unit while restricting direct access to the data.
 */

public class Encapsulation {
	private static class Employee { // Fully restricted
		private String name;
		private int age;

		// Getter method to access private variable
		public String getName() {
			return name;
		}

		// Setter method to modify private variable
		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			if (age > 0) { // Validation before setting the value
				this.age = age;
			}
		}
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("John Doe");
		emp.setAge(30);

		System.out.println("Name: " + emp.getName());
		System.out.println("Age: " + emp.getAge());
	}

}
