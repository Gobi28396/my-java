package org.string;

public class Arrays {

	public static void main(String[] args) {
		int a[] = new int[100];

		a[0] = 1;
		a[1] = 2;
		a[2] = 5;
		a[3] = 28;
		a[4] = 67;
		int i=0;
		for (int j = 0; j <=100; j++) {
			if(i<a.length&& j==a[i]) {
				i++;
			}
			
			else 
				System.out.println(j);
		} 


	}
}
