package org.string;

public class Amstrong1 {
public static void main(String[] args) {
	
	for (int n =1 ; n <=1000; n++) {
		
		
		int j=0,i=0,a;
		 a=n;
	while(a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
	}
		if (n==j) {
		
		System.out.println(j);
		
	}
	}}
}
