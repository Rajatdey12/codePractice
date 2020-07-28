package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class TopElement {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
       // Scanner sc2= new Scanner(System.in);
//        Scanner sc3 = new Scanner(System.in);
        String str="";
        
            int t= Integer.parseInt(sc1.nextLine());
            for(int k =1 ; k <= t;k++) {
                int n = Integer.parseInt(sc1.nextLine());
                TreeMap<String, Integer> tm = new TreeMap<>();
                List<String> al = new ArrayList<>();
                int max = Integer.MIN_VALUE;
                String res;
                for (int i = 1; i <= n; i++) {
                    if(!(str=sc1.nextLine()).isEmpty()){
                    	al.add(str);
                    }
//                    System.out.println(str);
 
                    
                    
                }
//                System.out.println(al);
                for (String s : al) {
                    if (s.equals("top")) {
                        res = "";
                        //System.out.println(tm);
                        for (Map.Entry<String, Integer> entry : tm.entrySet()) {
                            if (entry.getValue() > max) {
                                max = entry.getValue();
                                res = entry.getKey();
                            } else if (entry.getValue() == max) {
                                if (res.isEmpty())
                                    res = res + entry.getKey();
                                else
                                    res = res + " " + entry.getKey();
                            }
                        }
                        System.out.println(res);
                    } else {
                        // System.out.println(s);
                        String a[] = s.split(" ");
                        Integer c = tm.get(a[0]);
                        c = (c == null) ? Integer.parseInt(a[1]) : c + Integer.parseInt(a[1]);
                        tm.put(a[0], c);
                    }
                }
                
            }
            
//            sc3.close();
//            sc2.close();
            sc1.close();



    }
}