package test;

import java.util.*;

class Attack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count=0;
        String c1="";
        for (int n = 0; n < t; n++) {
        	int r = sc.nextInt();
        	int c = sc.nextInt();
        	for(int i=0; i< r; i++) {
        			
        			c1 = sc.next();
        			char[] cArray = c1.toCharArray();
        			int k;
        			for(k=0; k< cArray.length; k++) {
        				if(cArray[k] == 'n') {
        					count+=1;
                		
                	}
        				
        			}
        			System.out.println(cArray[k]+" "+count);
        		}
        	
//        	System.out.println(li1);
        	
            
        }
        
    }
}
