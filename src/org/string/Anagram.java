package org.string;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
	String a="gobi";
	String b="igb";
	if (a.length()==b.length()) {
		
	
	 char[] c = a.toCharArray();
	 char[] d = b.toCharArray();
	 Arrays.sort(c);
	 Arrays.sort(d);
	 
	 String e = String.valueOf(c);
	 String f = String.valueOf(d);
	 
	 if (e.equals(f)) {
		 System.out.println("anagram");
		
	} else {
		 System.out.println("not a anagram");
			
	}
	}
	else {
		 System.out.println(" not a anagram");
			
	}
	
	
	
	
	}	
	
	
	
	
	
	
	
}
	
