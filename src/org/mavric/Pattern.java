package org.mavric;

public class Pattern {
	public static void main(String[] args) {
		int n=5;
		for (int i = 1; i <5; i++) {
			for (int j = 0; j <5-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
		System.out.println();
	}}

}
