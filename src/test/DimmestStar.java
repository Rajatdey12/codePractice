package test;



import java.util.*;

class DimmestStar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int n = 0; n < t; n++) {
            int s = sc.nextInt();
        TreeMap<Integer,List<Integer>> map = new TreeMap<Integer,List<Integer>>();
        TreeMap<Integer,List<Integer>> map1 = new TreeMap<Integer,List<Integer>>();
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> arrayList1 = new ArrayList<Integer>();
        List<Integer> arrayList2 = new ArrayList<Integer>();
            for(int i = 0; i<s; i++){
              int a = sc.nextInt();
              int  b = sc.nextInt();
        arrayList.add(a);
        arrayList1.add(b);
        

    //     System.out.println(arrayList1);
    // System.out.println(arrayList);
    
    for(int i1=0; i1<arrayList.size(); i1++){
        for(int j=i1+1; j<arrayList.size(); j++){
        if(arrayList.get(i1) == arrayList.get(j) || arrayList1.get(i1) == arrayList1.get(j)){
            arrayList2.add(arrayList1.get(i1));
            arrayList2.add(arrayList1.get(j));
            
        }
    }
    map.put(arrayList.get(i1), arrayList2);
}
}
System.out.println(map);

}
}
}