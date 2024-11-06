package org.core.java;

/**
 * Final variables
 * Final methods
 * Final class
 * Final parameters
 * 
 * final variables are used when you want to ensure that a variable's
 *  value cannot be changed after initialization. T
 *  hey can be instance variables, local variables, or method parameters.
 *  
 *  static final variables are constants that belong to the class itself 
 *  (rather than to individual instances), and their value cannot be changed once assigned.
 *   These are typically used for class-wide constants.
 *
 */
public class FinalVariable 
{
	   static final String APP_NAME = "MyApp";  // Class-level constant
	    final int id;                            // Instance-level constant
	    final int x = 10; // Final instance variable
	    static int z; // static instance variable

	    FinalVariable(int id) {
	        this.id = id;  // Final variable can be assigned once in the constructor
	    }
	    
	    void someMethod(final String name) {
	        final int x = 20; // Final local variable
	        System.out.println(x);
	        // x = 30; // This will cause a compile-time error
	        // name = "Naga pavan"; // This will cause a compile-time error
	        System.out.println("x in some method is :"+ x);
	        System.out.println("name in some method is :"+ name);
	        System.out.println("z in some method before initialization is :"+ FinalVariable.z);
	        FinalVariable.z=50;
	        System.out.println("z in some method after initialization is :"+ FinalVariable.z);
	    }
    public static void main( String[] args )
    {
    	FinalVariable obj1 = new FinalVariable(1);
    	FinalVariable obj2 = new FinalVariable(2);

    	obj1.someMethod("final name");
          // Both objects have their own 'id' value, but APP_NAME is the same across all objects
          System.out.println("App Name: " + APP_NAME);
          System.out.println("App Name via class Name: " + FinalVariable.APP_NAME);
          System.out.println("Object 1 ID: " + obj1.id);
          System.out.println("Object 2 ID: " + obj2.id);
    }
}
