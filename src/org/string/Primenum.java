package org.string;

public class Primenum {
public static void main(String[] args) {

	int n=27,flag=0;
	
	if (n==1 || n==0) {
	System.out.println("prime number");	
	}
	else {
	for (int i = 2; i < n/2; i++) {
		
		if (n%i==0) {
			flag=1;
		}
	}
		if (flag==0) {
			System.out.println("prime number");
		} else {
			System.out.println("not a prime number");

		}
		
	}
}
}