package com.java.samples;

import java.io.*;
import java.util.Locale;


/**
 * Serializable interface in Java is a marker interface—it doesn't declare any methods but indicates that a class can be serialized.
 * Serialization is the process of converting an object's state into a byte stream, which can then be saved to a file,sent over a network,
 * or stored in a database. Deserialization is the reverse process, where the byte stream is converted back into an object.
 * */
class Student implements Serializable {
 // Recommended to declare a serialVersionUID for version control
 private static final long serialVersionUID = 1L;
 
 private String name;
 private int age;
 
 // Constructor
 public Student(String name, int age) {
     this.name = name;
     this.age = age;
 }
 
 // Getter methods
 public String getName() {
     return name;
 }
 
 public int getAge() {
     return age;
 }
 
 // For a readable representation of the object
 @Override
 public String toString() {
     return "Student{name='" + name + "', age=" + age + "}";
 }
}

public class SimpleSerializableClass {
 public static void main(String[] args) {
     // Create an instance of Student
     Student student = new Student("Alice", 20);
     
     // Serialize the student object to a file
     try (FileOutputStream fileOut = new FileOutputStream("student.txt");
          ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
         out.writeObject(student);
         System.out.println("Serialized data is saved in student.ser");
     } catch (IOException i) {
         i.printStackTrace();
     }
     
     // Deserialize the student object from the file
     Student deserializedStudent = null;
     try (FileInputStream fileIn = new FileInputStream("student.txt");
          ObjectInputStream in = new ObjectInputStream(fileIn)) {
         deserializedStudent = (Student) in.readObject();
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
     
     // Display the deserialized object
     System.out.println("Deserialized Student: " + deserializedStudent);
 }
}

