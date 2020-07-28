package test;

import java.util.HashMap;
import java.util.Iterator;

public class MaximumOccuringString {
		
	public static void maxOccur(String str) {
		int maxim =0;
		HashMap<String, Integer> maxO = new HashMap<>();
		String[] s = str.split(" ");
		for(String stmp: s) {
			if(maxO.get(stmp)!=null) {
				maxO.put(stmp, maxO.get(stmp)+1);
			}
			else {
			maxO.put(stmp, 1);
			}
			if(maxO.get(stmp)>maxim)
				maxim = maxO.get(stmp);
		}
		Iterator<String> maxOccr = maxO.keySet().iterator();
		while(maxOccr.hasNext()) {
			 String max = maxOccr.next();
			 if(maxO.get(max) == maxim) {
				 System.out.println("The word occured "+ maxO.get(max)+" times for "+max);
			 }
		}
	}
	
	public static void main(String[] args) {
		MaximumOccuringString.maxOccur("I am am am java prog prog");
	}
}
