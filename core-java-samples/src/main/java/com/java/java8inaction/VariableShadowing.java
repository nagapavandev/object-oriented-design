package com.java.java8inaction;

public class VariableShadowing
{
	public final int value = 4;
	public void doIt()
	{
		int value = 6;
	//	Runnable r = new RunnableWithRunA(){
		Runnable r = new Runnable(){
			public final int value = 5;
			public void run(){
				int value = 10;
				System.out.println(this.value);
				System.out.println(value);
				}
			
			/*
			 * public void runA(){ int value = 10;
			 * System.out.println("runnable a "+this.value);
			 * System.out.println("runnable a "+value); }
			 */
		};
		r.run(); 
//		 ((RunnableWithRunA) r).runA(); 
	}
	public static void main(String...args)
	{       
		VariableShadowing m = new VariableShadowing();
		m.doIt(); // ???   
	}
//	  interface RunnableWithRunA extends Runnable {
//	        void runA();
//	    }
}
