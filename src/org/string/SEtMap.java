package org.string;

public class SEtMap {

	public static void main(String[] args) {
		int num = 15323;
		
		int count = 0;

		while (num > 0) {

			count++;
			num = num / 10;
		}
		System.out.println("Number of digits :" + count);
	}
}