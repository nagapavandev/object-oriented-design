package org.core.java;

/**
 * Functional Interface is something which has only one abstract method. And methods belonging to java.lang.Object is fine to be added.
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
