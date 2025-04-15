package com.java.java8inaction;

public class Apple implements Comparable<Apple>{
    private int weight = 0;
    private String color = "";

    public Apple(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Apple{" +
               "color='" + color + '\'' +
               ", weight=" + weight +
               '}';
    }

    @Override
	public int compareTo(Apple o) {
		return  Integer.compare(this.weight, o.weight);
	}
}
