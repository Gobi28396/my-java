package org.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class List2map {
	public static void main(String[] args) {
		int i=0;
	
	List<Integer> l=new ArrayList<>();
	l.add(10);
	l.add(101);
	l.add(101);
	l.add(103);
	l.add(104);
	l.add(105);
	
	List<String> s=new ArrayList<>();
	s.add("gobi1");
	s.add("gobi12");
	s.add("gobi13");
	s.add("gobi14");
	s.add("gobi15");
	s.add("gobi16");
	Map<Integer, String> m=new TreeMap<>();
	for (String x : s) {
		m.put(l.get(i++), x);
		
	}
	System.out.println(m);
		Map<Integer, String> n=new TreeMap<>();

	for (int j = 0; j <l.size(); j++) {
		n.put(l.get(j), s.get(j));
		
	}
	
	System.out.println("\n\n");
	System.out.println(n);
	

}
}