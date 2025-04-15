package com.java.generics;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * Producer (? extends T): When you're only reading.
 * 
 * Consumer (? super T): When you're only writing.
 * 
 * Upper Bounded Wildcards (? extends T)
 * Imagine you have a container that produces fruits (it "extends" a fruit type). 
 * You know whatever comes out of this container is some kind of fruit, but you don’t know if it’s an apple, an orange, or a pear. 
 * Since you don’t know the exact type, you’re safe to take fruits out, but if you try to put a new fruit in, you might accidentally add an incompatible type.
 *
 * Lower Bounded Wildcards (? super T)
 * Now consider a container that accepts fruits—this container can hold fruits or even things more general than fruit (like food). 
 * Here, you can safely add an apple because the container is guaranteed to accept at least that type of fruit. 
 * However, when you take something out, you can only be sure that it’s an object (or food), not necessarily a fruit.
 * 
 * Generics in Java are invariant, meaning that even if String is a subtype of Object, List<String> is not considered a subtype of List<Object>
 * 
 * */

public class WildLifeExample {
	
	// Animal is the base class
	static class Animal {
	    public void speak() {
	        System.out.println("Animal speaks");
	    }
	}

	// Dog is a subclass of Animal
	static class Dog extends Animal {
	    public void speak() {
	        System.out.println("Dog barks");
	    }
	}

	    // Upper bounded wildcard: any list of Animal or its subclasses.
	    public static void makeAnimalsSpeak(List<? extends Animal> animals) {
	        // You can read from the list and call methods defined in Animal.
	        for (Animal a : animals) {
	            a.speak();
	        }
	        // Adding a new Animal isn't allowed because you don't know the specific subtype.
	        // animals.add(new Dog()); // This line would cause a compile error.
	    }

	    // Lower bounded wildcard: a list that can hold Dog or any superclass of Dog.
	    public static void addDog(List<? super Dog> animals) {
	        // It's safe to add a Dog because the list can accept Dog or something more general.
	        animals.add(new Dog());
	    }

	    public static void main(String[] args) {
	        List<Dog> dogList = new ArrayList<>();
	        List<Animal> animalList = new ArrayList<>();

	        // Using upper bounded wildcard: works with Dog list because Dog extends Animal.
	        makeAnimalsSpeak(dogList);

	        // Using lower bounded wildcard: works with both Animal list and Dog list.
	        addDog(animalList);
	        addDog(dogList);

	        // Verify by having animals speak from the Animal list:
	        for (Animal a : animalList) {
	            a.speak(); // Expected output: "Dog barks"
	        }
	    }
}
