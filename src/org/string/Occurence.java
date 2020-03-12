package org.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurence {
	public static void main(String[] args) {
		String s = "gopinathraj";
		String substring = s.substring(8);
		System.out.println(substring+" "+s.subSequence(0, 8));
		char[] t = s.toCharArray();
		Map<Character, Integer> m = new LinkedHashMap<>();
		for (char c : t) {
			if (m.containsKey(c)) {
				Integer I = m.get(c);
				m.put(c, I + 1);
			} else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
	}
}
