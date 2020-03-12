package org.string;

public class Pattern {
	public static void main(String[] args) {
		System.out.println("Pattern 1");
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {	
			System.out.print(" *");	
			}
			System.out.println();
		}
		System.out.println("Pattern 2");
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j <5-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				
			System.out.print("* ");
				
			}
			System.out.println();
		}
		System.out.println("Pattern 3");
		for (int i = 5; i>0; i--) {
			for (int j = 0; j <5-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				
			System.out.print("* ");
				
			}
			System.out.println();
		}
		
		System.out.println("Pattern 4");
		for (int i = 5; i>0; i--) {
			for (int j = 0; j < i; j++) {
				
			System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
		System.out.println("Pattern 5");
		for (int i = 5; i>0; i--) {
			for (int j = 1; j < i; j++) {
				
			System.out.print(j);
				
			}
			System.out.println();
		}
		
		System.out.println("Pattern 6");
		for (int i = 0; i<5; i++) {
			for (int j = 1; j <= i; j++) {
				
			System.out.print(j);
				
			}
			System.out.println();
		}
		
		System.out.println("Pattern 7");
		for (int i = 5; i>0; i--) {
			
			for (int j = 0; j <i; j++) {
				
			System.out.print(i);
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
