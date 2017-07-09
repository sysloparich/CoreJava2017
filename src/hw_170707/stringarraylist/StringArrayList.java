package hw_170707.stringarraylist;

import mytestframework.Asserts;

public class StringArrayList {

	private static final String HELLO = "Hello";

	public static void main(String[] args) {
		
		
		String s = "   Hello ";
		String s2 = HELLO;  // trimmed
		String s3 = "  Hello";
		String s4 = "Hello  ";
		String s5 = "  He l l o  ";
		//             ^1     ^2   
		String s6 = "";

		System.out.println(Asserts.assertEquals(trim(s6), ""));
		System.out.println(Asserts.assertNotEquals(trim(s6), HELLO));		
		
		System.out.println(Asserts.assertEquals(trim(s2), s2));
		System.out.println(Asserts.assertNotEquals(trim(s2), s5));

		System.out.println(Asserts.assertEquals(trim(s4), s2));
		System.out.println(Asserts.assertNotEquals(trim(s4), s4));
		
		System.out.println(Asserts.assertEquals(trim(s3), HELLO));
		System.out.println(Asserts.assertNotEquals(trim(s3), s3));
		
		System.out.println(Asserts.assertEquals(trim(s), HELLO));
		System.out.println(Asserts.assertNotEquals(trim(s), s));
		
		System.out.println(Asserts.assertEquals(trim(s5), "He l l o"));
		System.out.println(Asserts.assertNotEquals(trim(s5), s5));
		
		

	}
	
	private static String trim(String s) {

		if (s == null || s.length() == 0) {
			return s;
		}
		
		if (hasNoTrailingOrLeadingSpaces(s)) {
			return s;
		}
		
		int i = 0;
		int j = s.length()-1;
		while(s.charAt(i) <= ' ') ++i;
		while(s.charAt(j) <= ' ') --j;
		
		return s.substring(i,j+1);
	}

	private static boolean hasNoTrailingOrLeadingSpaces(String s) {
		return s.indexOf(' ') != 0 && s.lastIndexOf(' ') != s.length() - 1;
	}

}
