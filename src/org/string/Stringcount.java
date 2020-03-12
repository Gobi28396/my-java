package org.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class Stringcount {

	public static void main(String[] args) {
		String s="i am am java java class am";
		String[] f = s.split(" ");
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		
		Map<String, Integer> m=new LinkedHashMap<>();
		for (String x : f) {
			if (m.containsKey(x)) {
				Integer i = m.get(x);
				m.put(x, i+1);
			}
			else {
				m.put(x, 1);
			}
		}
		
		
		System.out.println(m);
	}
}
