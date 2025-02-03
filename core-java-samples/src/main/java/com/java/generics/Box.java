package com.java.generics;
import java.util.*;
import java.util.stream.Stream;

import com.java.java8inaction.Apple;

/*
 * A type parameter is a placeholder used in generics to represent a type that will be 
 * specified later when the class, interface, or method is instantiated or invoked. 
 * Type parameters allow you to write more flexible and reusable code while maintaining 
 * type safety
 * 
 */
public class Box<T> {
	
	 private T value;
	    
	    public void setValue(T value) {
	        this.value = value;
	    }

	    public T getValue() {
	        return value;
	    }
/*
 * The class Box<T> has a type parameter T, and the method printArray doesn't need to 
 * declare its own type parameter <T> because it can directly use the class's type T.
 * public <T> void printArray(T[] array)
 * 	    
 */
	   
		public T[] printArray(T[] array) {
			/*
			 * for (U element : array) { System.out.print(" "+element); }
			 */
			Arrays.stream(array).forEach(System.out::println);
			return array;
	    }

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 *  Starting from Java 7, the compiler can infer the type from the variable declaration
 *  on the left-hand side. As a result, you don't need to repeat the type on the 
 *  right-hand side when creating the object. Instead, you can use the diamond 
 *  operator <> to allow the compiler to infer the correct type.
 *  
 *  new Box<>() allows the compiler to infer that the object being created is a 
 *  Box<Integer> because it matches the type of the reference (Box<Integer>).
 *  
 */
		Box<Integer> box = new Box<>();
		box.setValue(10);
		Integer value = box.getValue();
		System.out.println("value is "+value);
		Integer [] sampleBoxes = {1,15,20,25,10,5};
		// String [] sampleBoxes = {"1","15","20","25","10","5"};
		 Integer[] output =box.printArray(sampleBoxes);
		
		Stream.of(output)
		 .map(element -> "Lambda element: " + element) 
	      .forEach(System.out::println);
		
	//	Comparable number = 10;
	//      number.compareTo("10");
	  Comparable<Integer> number = 10;
	  System.out.println("bigger or smaller "+number.compareTo(11));
      
      List <Apple> appleList = new ArrayList<>();
      appleList.add(new Apple(50, "orange"));
      appleList.add(new Apple(20, "black"));
      appleList.add(new Apple(30, "red"));
      appleList.add(new Apple(40, "blue"));
      appleList.add(new Apple(10, "pineapple"));
      
      System.out.println("Before Sorted by weight (Comparable): " + appleList);
      Collections.sort(appleList);
      System.out.println("Sorted by weight (Comparable): " + appleList);
      
      Comparator<Apple> byWeight = (p1, p2) -> Integer.compare(p1.getWeight(), p2.getWeight());
      Collections.sort(appleList, byWeight);
      System.out.println("Sorted by weight (Comparator): " + appleList);

      // Using Comparator to sort by name
      Comparator<Apple> byName = (p1, p2) -> p1.getColor().compareTo(p2.getColor());
      Collections.sort(appleList, byName);
      System.out.println("Sorted by color (Comparator): " + appleList);
      
      
	}
}
