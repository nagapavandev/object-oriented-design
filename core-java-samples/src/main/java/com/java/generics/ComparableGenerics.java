package com.java.generics;

import java.util.Arrays;

public class ComparableGenerics {
	static class MyNumber implements Comparable<MyNumber> {
	    private int value;
	    
	    public MyNumber(int value) { 
	        this.value = value; 
	    }
	    
	    @Override
	    public int compareTo(MyNumber other) {
	        return Integer.compare(this.value, other.value);
	    }
	    
	    @Override
	    public String toString() {
	        return String.valueOf(value);
	    }
	}

	// Sorting method using <T extends Comparable<T>>
	public static <T extends Comparable<T>> void sort1(T[] array) {
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
	    MyNumber[] numbers = { new MyNumber(5), new MyNumber(3), new MyNumber(8) };
	    sort1(numbers);
	    System.out.println(Arrays.toString(numbers));
	}


}
