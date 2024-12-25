package com.java.samples;
import java.util.*;

public class SimpleLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create a list of strings
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using a Lambda expression to print each name in the list
        names.forEach(name -> System.out.println(name));
        
        Integer [] agesArray = {40, 45, 35};
        
        List<Integer> ages = Arrays.asList(agesArray);

        // Using a Lambda expression to print each name in the list
        ages.forEach(age -> System.out.println(age));

	}

}
