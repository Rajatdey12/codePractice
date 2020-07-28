package test;

public class GreaterChar {
	
	public static void grater(String charac) {
		char[] carray = charac.toCharArray();
		int max=0;
		
		for(char ch: carray) {
			max = Math.max(max, (int) ch);
//			System.out.println((int) ch);
		}
		System.out.println("value:-----"+max);
		Character c1 = (char) max;
		String s1 = Character.toString((char) max);
		System.out.println("Character----> " +c1);
		System.out.println("String-----> " +s1);
	}
	
	public static void reverseStr(String str) {
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		
//		GreaterChar.grater("abcfgiaknml");
		GreaterChar.reverseStr("I am good for the day");

	}

}