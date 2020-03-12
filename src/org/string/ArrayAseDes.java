package org.string;

public class ArrayAseDes {
	public static void main(String[] args) {

		int a[] = { 10, 30, 80, 60, 70, 56, 90, 90, 100 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}System.out.println("Asending array");
		for (int i : a) {
			System.out.println(i);
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] <a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}System.out.println("Desending array");
		for (int i : a) {
			System.out.println(i);
		}

	}

}
