package org.core.java;

import java.util.*;

/**
 * Comparable is an internal mechanism.
 * When you use Comparable, the class itself must implement the compareTo() method to define 
 * how objects of that class should be compared. 
 * This means you are modifying the class itself to support comparison. 
 * The class becomes aware of how to compare its instances with each other.
 * 
 * Comparator, on the other hand, is an external mechanism.
 * The Comparator interface allows you to create separate classes or functions that can compare objects
 * of any class, without requiring the objects' class to implement Comparable. 
 * This means you can keep the original class unchanged and still provide custom sorting logic using Comparator.
 */
public class PersonComparator {
    private int age;
    private String name;

    // Constructor
    public PersonComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
    
    public static void main(String[] args) {
        // Create a list of people
        List<PersonComparator> people = new ArrayList<>();
        people.add(new PersonComparator("Alice", 30));
        people.add(new PersonComparator("Bob", 25));
        people.add(new PersonComparator("Charlie", 35));
        people.add(new PersonComparator("David", 20));

        System.out.println("Before sorting by age:");
        System.out.println(people);

        // Sort using the custom PersonAgeComparator
        Collections.sort(people, new PersonAgeComparator());

        System.out.println("After sorting by age:");
        System.out.println(people);

        // Alternatively, you can also use a lambda expression for the same comparator
        // Collections.sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
    }
}

// External Comparator for comparing Person by age
class PersonAgeComparator implements Comparator<PersonComparator> {
    @Override
    public int compare(PersonComparator p1, PersonComparator p2) {
        // Compare by age (ascending order)
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}