package org.core.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * The Comparable interface is used to define the natural ordering of objects of a class. 
 * A class that implements Comparable must implement the compareTo() method, 
 * which compares the current object with another object of the same class.
 */

public class PersonComparable implements Comparable<PersonComparable> {
    private String name;
    private int age;

    public PersonComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(PersonComparable other) {
        return Integer.compare(this.age, other.age); // Sort by age
     //   return Integer.valueOf(this.age).compareTo(Integer.valueOf(other.age)); // Sort by age
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
        List<PersonComparable> people = Arrays.asList(
            new PersonComparable("pavan", 35),
            new PersonComparable("naga", 20),
            new PersonComparable("tanguturi", 15)
        );
        
//        Boolean b = people.add(new PersonComparable("pavan", 35));
//        System.out.println(b);

        Collections.sort(people);  // Sorts by age
        System.out.println("comparable example "+people);
        /* ===========Lambda expression */
       Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
       System.out.println(people);
    }
}