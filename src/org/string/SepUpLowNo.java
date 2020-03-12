package org.string;

public class SepUpLowNo {

	public static void main(String[] args) {
		char c = ' ';
		int i = c;
		System.out.println(i);
		String u = "", l = "", z = "", d = "";

		int upper = 0, lower = 0, digit = 0, spl = 0;
		String s = "Gobi28396@gmail.com";
		for (int j = 0; j < s.length(); j++) {
			char v = s.charAt(j);
			if (v >= 'A' && v <= 'Z') {
				upper++;
				u = u + v;
			} else if (v >= 'a' && v <= 'z') {
				lower++;
				l = l + v;
			} else if (v >= '0' && v <= '9') {
				digit++;
				d = d + v;

			} else {
				spl++;
				z = z + v;
			}
		}

		System.out.println("upper" + upper + " " + u);
		System.out.println("digit" + digit + " " + d);
		System.out.println("lower" + lower + " " + l);
		System.out.println("spl" + spl + " " + z);
	}
}
