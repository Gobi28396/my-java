package org.string;

public class Vowles {
	public static void main(String[] args) {
		String s= new String("GOpinath");
	int v=0,n=0;
	String low = s.toLowerCase();
		for (int j = 0; j < s.length(); j++) {
			char c = low.charAt(j);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				v++;	
			}
			else {
			n++;
			}
			
		}
		
		
		System.out.println(v);
		System.out.println(n);
		
		
	}

}
