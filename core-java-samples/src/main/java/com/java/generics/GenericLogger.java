package com.java.generics;

public class GenericLogger {
    // Generic logging method that can handle any type.
    public static <T> void log(T t) {
        System.out.println("Generic log: " + t);
    }
    
    // Specialized logging method for String messages.
    public static void log(String s) {
        // Imagine special formatting for string messages.
        System.out.println("String log (formatted): " + s.toUpperCase());
    }
    
    public static void main(String[] args) {
        // Call with a String literal.
        log("Hello World");
        
        // Call with an Integer.
        log(100);
    }
}

