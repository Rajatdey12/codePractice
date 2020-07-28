package test;

public class CallByValueEg {

	int data = 50;
	//Example 1	
	//changes will be in the local variable only
	void change(int data) {
		data = data+100;
		System.out.println("Data in Scope: "+data);
	}
	
	//Example 2
	//changes will be in the instance variable
		void change(CallByValueEg cv) {
			cv.data = cv.data+500;
		}
	
	public static void main(String[] args) {
		
		CallByValueEg cv = new CallByValueEg();
		cv.change(0);
		
		System.out.println("Before change eg1 is called: "+cv.data);
		cv.change(500);
		
		System.out.println("After change eg1 is called: "+cv.data);
		
		System.out.println("Before change eg2 is called: "+cv.data);
		
		cv.change(cv);
		
		System.out.println("After change eg2 is called: "+cv.data);
		
		
	}
}
