package com.java.samples;
import java.util.*;

public class SimpleLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create a list of strings
		/*Fixed length of arrayList will be returned*/
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using a Lambda expression to print each name in the list
        names.forEach(name -> System.out.println(name));
        
        Integer [] agesArray = {40, 45, 35};
        
        List<Integer> ages = new ArrayList<>(Arrays.asList(agesArray));
        
        ages.add(55);

        // Using a Lambda expression to print each name in the list
        ages.forEach(age -> System.out.println(age));
        Integer [] array = {1,4,5,10,9};
        List<Integer> list = new ArrayList<>(array.length);
        for (int num : array) {
            list.add(num);  // Convert each primitive int to Integer
        }
        
        list.add(55); 
        System.out.println(list);

	}

}
