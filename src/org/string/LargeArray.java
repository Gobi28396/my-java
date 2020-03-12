package org.string;

public class LargeArray {
	
	public static void main(String[] args) {
		
		int a[]= {3,4,7,9,58,67,04,35,76,13,45,98,67};
		int big=a[0];
		int small=a[a.length-1];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>big) {
				big=a[i];
					}
			if (a[i]<small) {
				small =a[i];
			}
	
		}
		
		
		System.out.println(big+"\n"+small);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int t=0;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				if (a[i]>a[j]) {
//					
//					t=a[i];
//					a[i]=a[j];
//					a[j]=t;
//					
//				}
//			}
//			
//		}
//		
//		
//		System.err.println(a[0]);
//		System.out.println(a[a.length-1]);
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
