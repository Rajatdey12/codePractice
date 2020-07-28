package test;

/*--Multithreading is a Java feature that allows concurrent execution of two or more parts of a program 
for maximum utilization of CPU. Each part of such program is called a thread. 
So, threads are light-weight processes within a process.--*/

public class Multithreading extends Thread {
	int i=0;
	public void run() {
		try {
			while(i<1000) {
			// Displaying the thread that is running 
            System.out.println ("Thread " + 
                  Thread.currentThread().getId() + 
                  " is running");
            		i+=1;
			}
			while(i<5000) {
				System.out.println("Print this in middle times but want to see the threading multitasking");
				i+=1;
			}
		}
		catch(Exception e){
			 // Throwing an exception 
            System.out.println ("Exception is caught"); 
		}
	}
	
	
	public static void main(String[] args) {
		 Multithreading t1 = new Multithreading(); 
		 t1.start();      
	}
}
