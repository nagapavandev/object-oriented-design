package org.core.java;

/**
 *  functional interface is something which has only one abstract method. And methods belonging to java.lang.Object is fine to be added.
 * 
 * The default keyword in an interface is used to provide a default implementation for a method. 
 * This allows you to add new methods to an interface without breaking the existing implementations. 
 * In the context of a functional interface (an interface with exactly one abstract method), you can still have one or more default methods. 
 * These default methods do not count as abstract methods, so the interface remains functional and can still be used with lambda expressions.
 * 
 * */

@FunctionalInterface
interface Abcd {
    void method1();
    default void method2() {
        System.out.println("Default method2");
    }
    default void method3() {
        System.out.println("Default method3");
    }
    static void helper() {
        System.out.println("Helper");
    }
}
