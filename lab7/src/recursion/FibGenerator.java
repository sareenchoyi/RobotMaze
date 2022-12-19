package recursion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FibGenerator {
	private static int[] knownFibonacciValues = new int[50];
	private int[] callCounter;
	public int nthFib(int n) {
		callCounter = new int[n+1];
		return computeFibRecurse(n);
		
		
	}
	
	private int computeFibRecurse(int n) {
		callCounter[n] += 1;
		
		if(knownFibonacciValues[n] !=0) {
			
			return knownFibonacciValues[n];
			
		}
		
		Logger.getGlobal().info("Entering fib. n=" + n);
		if(n == 1 || n == 2) {
			return 1;
			
			
		}
		
		else {
			int first = computeFibRecurse(n-1);
			int second = computeFibRecurse(n-2);
			Logger.getGlobal().info("Exiting fib. return=" + first + second);
			knownFibonacciValues[n] = first + second;
			return first + second;
			
			
			}
		
		
		
	}
	
	public void printCallCounter() {
		for(int i = 0; i < callCounter.length; i++) {
			
			System.out.println(callCounter[i] + "calls to computeFibRecurse{" + i + ")");
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("STARTING"); 
		FibGenerator fib = new FibGenerator(); 
		
		//System.out.println(fib.nthFib(4));
		
		//for (int i = 1; i <= 10;i++) {
			//System.out.println(i+ ":" + fib.nthFib(i));
			
		//}
		System.out.println(fib.nthFib(20));
		fib.printCallCounter();
		Logger.getGlobal().setLevel(Level.OFF);
	
		
	}

}
