package test;

import java.util.HashMap;
import java.util.Iterator;

public class MaximumOccuringChar{
	
static final int ASCII_SIZE = 256; 
public static char maximumOccurringCharacter(String text) {
// Write your code here
int count[] = new int[ASCII_SIZE]; 
   
    int len = text.length(); 
    for (int i=0; i<len; i++) 
        count[text.charAt(i)]++; 
   
    int max = -1;
    char result = ' ';

    for (int i = 0; i < len; i++) { 
        if (max < count[text.charAt(i)]) { 
            max = count[text.charAt(i)]; 
            result = text.charAt(i); 
        } 
    }
    System.out.println(result);
    return result;

    }

public static void maxCharOcc(String charac) {
	int max1 =0;
	char[] ch = charac.toCharArray();
	HashMap<Character, Integer> charMap = new HashMap<>();
	for(char ch1: ch) {
		if(charMap.get(ch1)!=null) {
			charMap.put(ch1, charMap.get(ch1)+1);
		}
		else {
		charMap.put(ch1, 1);
		}
		if(charMap.get(ch1)> max1) {
			max1 = charMap.get(ch1);
		}
	}

	Iterator<Character> chr = charMap.keySet().iterator();
	
	while(chr.hasNext()) {
		char maxChar = chr.next();
		if(charMap.get(maxChar) == max1) {
			System.out.println("The character "+maxChar+" with count " +charMap.get(maxChar));
		}
	}
		
	
}

public static void main(String[] args) {
	
//	MaximumOccuringChar.maximumOccurringCharacter("aaannbbccccdddeffffzzzazz");
	MaximumOccuringChar.maxCharOcc("aabbccdddeefff");
}
}