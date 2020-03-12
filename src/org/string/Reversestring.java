package org.string;

public class Reversestring {

	public static void main(String[] args) {
		String s = "gobinath muthusamy";
		int length = s.length();

		for (int i = length; i > 0; i--) {
			char charAt = s.charAt(i - 1);
			System.out.print(charAt);

		}

	}
}
