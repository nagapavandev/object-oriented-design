package com.java.generics;

import java.util.Arrays;

public class ComparableSuper {
	static class Animal implements Comparable<Animal> {
	    String name;
	    
	    public Animal(String name) { 
	        this.name = name; 
	    }
	    
	    @Override
	    public int compareTo(Animal other) {
	        return this.name.compareTo(other.name);
	    }
	    
	    @Override
	    public String toString() {
	        return name;
	    }
	}

	static class Dog extends Animal {
	    public Dog(String name) { 
	        super(name); 
	    }
	}

	// Sorting method using <T extends Comparable<? super T>>
	public static <T extends Comparable<? super T>> void sort2(T[] array) {
	    for (int i = 0; i < array.length; i++) {
	        for (int j = i + 1; j < array.length; j++) {
	            if (array[i].compareTo(array[j]) > 0) {
	                T temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }
	    }
	}

	public static void main(String[] args) {
	    Dog[] dogs = { new Dog("Buddy"), new Dog("Charlie"), new Dog("Max") };
	    // This works because Dog inherits compareTo from Animal,
	    // and Animal implements Comparable<Animal>.
	    sort2(dogs);
	    System.out.println(Arrays.toString(dogs));
	}

}
