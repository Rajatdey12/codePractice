package se8;

public class ClassLoaderTest {
	
	public static void main(String[] args) {
		ClassLoaderTest t = new ClassLoaderTest();
		System.out.println("Main class loaded --> " + t.getClass().getName());
	}
}