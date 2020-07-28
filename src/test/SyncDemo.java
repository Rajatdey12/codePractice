package test;

class counter {
	int count;
	
	public void increment() {
		count+=1;
	}
}

public class SyncDemo {

	public static void main(String[] args) throws InterruptedException {
		counter c = new counter();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized(this) {
				for(int i=0; i<1000; i++)
					c.increment();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized(this) {
				for(int i=0; i<1000; i++)
					c.increment();
				}
				
			}
		});
		
		t1.start();
//		t1.join();
		t2.start();
		t2.join();
		System.out.println("count "+c.count);
	}
}
