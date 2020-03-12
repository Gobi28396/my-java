package org.string;

public class duplicatestrg {
	
	public static void main(String[] args) {
	
	String s1="abc";
	System.out.println(removeDuplicateChars(s1));
	System.out.println(s1);
	String s2="bde";
	System.out.println(removeDuplicateChars(s2));

	System.out.println(s2);
}
	private static String removeDuplicateChars(String str)
	{
		char[] ch=str.toCharArray();
		String str1="";
		for(char value : ch)
		{
			if(str1.indexOf(value)==-1)
			{
				str1+=value;
			}
		return str1;
	
		}
		//return str1;
		return str1;
	}
	}
