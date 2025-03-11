package org.oops.java;

public class AbstractionRealWorld {
	abstract static class ATM {
	    abstract void withdraw(double amount);  // Abstract method

	    public void checkBalance() {
	        System.out.println("Balance is being checked...");
	    }
	}

	private static class SBI_ATM extends ATM {
	    @Override
	    void withdraw(double amount) {
	        System.out.println("Processing SBI ATM withdrawal of $" + amount);
	    }
	}
	    public static void main(String[] args) {
	        ATM myATM = new SBI_ATM();
	        myATM.withdraw(500);
	        myATM.checkBalance();
	    }
}
