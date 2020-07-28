package test;

import java.util.Scanner;

public class FibonacciCalculator { 
	public static void main(String args[]) { 
		
		System.out.println("Enter number upto which Fibonacci series to print: "); 
		@SuppressWarnings("resource")
		int number = new Scanner(System.in).nextInt(); 
		System.out.println("Fibonacci series upto " + number +" numbers : "); 
		
		for(int i=1; i<=number; i++){ 
			System.out.print(fibonacci(i) +" "); 
			} 
		}
	
	public static int fibonacci(int number){ 
		if(number == 1 || number == 2){ 
			return 1; 
			} 
		return fibonacci(number-1) + fibonacci(number -2); //tail recursion 
	}
}

