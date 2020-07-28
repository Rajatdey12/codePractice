package test;

public class Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String giv = "{ { } { } }  } { {} }}";
		char[] cArray = giv.toCharArray();
		int count =0;
		int count1=0;
		int balanced =0;
		for(int i=0; i<=cArray.length-1; i++) {
			if(cArray[i] == '{') {
				balanced+=1;
			}
			if(cArray[i] == '}') {
				count+=1;
			}
			count1=Math.min(count, balanced);

	}
		//System.out.println("Balanced");
		System.out.println(count1);
		
	
	}
}
