package se8;

import java.util.*;

public class ClassLoaderTest {


	private String firstName;

	private Integer age;
	
	public static void main(String[] args) {
		ClassLoaderTest t = new ClassLoaderTest();

		System.out.println("Main class loaded --> " + t.getClass().getName());

		Map<Integer, String> m = new HashMap<>();
		m.put(1, "One");
		m.put(2, "Two");
		m.put(3, "Three");
		m.put(4, "Four");
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
		System.out.println(m.values());

		System.out.println(Math.cbrt(27.0));
		System.out.println(Math.pow(27.0, 0.33333333333));

		String s = null;
		int i = 0;
		while (i <= 5 && s == null) {
			s = null;
			i++;
		}

		System.out.println(Boolean.parseBoolean("gef"));

		int i1;
		for (i1 = 1; (i1*i1*i1) <= 1278; i1++) {
		}
		System.out.println(i1-1);

		Map<Integer, String> tMap = new HashMap<>();
		tMap.put(null, null);
		tMap.put(1, "One hai");
		tMap.put(2, null);
		tMap.put(null, "val hai");

		tMap.entrySet().removeIf(x -> x.getValue() == null || x.getKey() == null);

		System.out.println(tMap);
	}
}