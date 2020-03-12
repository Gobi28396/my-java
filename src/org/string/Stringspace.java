package org.string;

public class Stringspace {
	public static void main(String[] args) {
		String s="i am gobinath  h r u ";
		String[] split = s.split(" ");
		String n="";
		for (int i = 0; i < split.length; i++) {
			
				n=n+split[i];
			
			
			
			
		}

		System.out.println(n);
		
	}

}
