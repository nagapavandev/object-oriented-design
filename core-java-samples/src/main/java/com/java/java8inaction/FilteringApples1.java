package com.java.java8inaction;

import java.util.*;
import java.util.function.Predicate;

public class FilteringApples1{

    public static void main(String ... args){

        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                                              new Apple(155, "green"),
                                              new Apple(120, "red"));	
        
        /*
         * Method Reference
         * */

        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
        List<Apple> greenApples = filterApples(inventory, FilteringApples1::isGreenApple);
        System.out.println(greenApples);
        
        // [Apple{color='green', weight=155}]
        List<Apple> heavyApples = filterApples(inventory, FilteringApples1::isHeavyApple);
        System.out.println(heavyApples);
        
        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
        List<Apple> greenApples2 = filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));
        System.out.println(greenApples2);
        
        // [Apple{color='green', weight=155}]
        List<Apple> heavyApples2 = filterApples(inventory, (Apple a) -> a.getWeight() > 150);
        System.out.println(heavyApples2);
        
        /*
         *  lambda expression in Java. 
         *  Specifically, it’s a predicate because it returns a boolean value
         * */
        /*
         * lambda expressions are used to implement functional interfaces
         *  (interfaces with a single abstract method)
         */
        // []
        List<Apple> weirdApples = filterApples(inventory, (Apple a) -> a.getWeight() < 80 || 
                                                                       "brown".equals(a.getColor()));
        System.out.println(weirdApples);
        
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory){
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory){
            if (apple.getWeight() > 150) {
                result.add(apple);
            }
        }
        return result;
    }

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor()); 
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }       



}
