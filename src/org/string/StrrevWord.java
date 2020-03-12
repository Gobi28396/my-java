package org.string;

public class StrrevWord {
	public static void main(String[] args) {
		
		String s="hi hru hello  wru/";
		String res="";
		String[] g = s.split(" ");
		for (int i = 0; i < g.length; i++) {
			
			String j=g[i];
			String rev="";
			for (int k = j.length(); k >0; k--) {
				char c= j.charAt(k-1);
				rev=rev+c;
				
			}
			
			
			res=res+rev+" "; 
		}
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}