package org.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListSetWithMap {
	public static void main(String[] args) {
		Set<String> s=new TreeSet<>();
	int i=0;
	s.add("gobi1");
	s.add("gobi12");
	s.add("gobi13");
	s.add("gobi14");
	s.add("gobi15");
	s.add("gobi16");

List<Integer> l=new ArrayList<>();
l.add(10);
l.add(102);
l.add(101);
l.add(103);
l.add(104);
l.add(105);

Map<Integer, String> m=new TreeMap<>();

for (String x : s) {
	
	m.put(l.get(i++), x);

		}

System.out.println("\n");
System.out.println(m);
System.out.println("list set with map");
	


	


}
}