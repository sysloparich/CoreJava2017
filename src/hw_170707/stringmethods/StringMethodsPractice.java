package hw_170707.stringmethods;

import mytestframework.Asserts;

public class StringMethodsPractice {

	private static final String HELLO = "Hello";
	
	public static void main(String[] args) {			
			
		String s = "   Hello ";
		String s2 = HELLO;  // trimmed
		String s3 = "  Hello";
		String s4 = "Hello  ";
		String s5 = "  He l l o  ";
		//             ^1     ^2   
		String s6 = "";
		
		String replace1 = "SOME";
		String replace2 = "OME";
		String replace3 = "SOMS";
		String replace4 = "";
		
		System.out.println(Asserts.assertEquals(replace(replace1,'S','K'),"KOME"));
		System.out.println(Asserts.assertNotEquals(replace(replace1,'S','K'),"SOME"));
		
		System.out.println(Asserts.assertEquals(replace(replace2,'S','K'),"OME"));
		System.out.println(Asserts.assertNotEquals(replace(replace2,'S','K'),"KOME"));
		
		System.out.println(Asserts.assertEquals(replace(replace3,'S','K'),"KOMK"));
		System.out.println(Asserts.assertNotEquals(replace(replace3,'S','K'),"KOME"));
		
		System.out.println(Asserts.assertEquals(replace(replace4,'S','K'),""));
		System.out.println(Asserts.assertNotEquals(replace(replace4,'S','K'),"SOME"));
		
		
		
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
	
	
	private static String replace(String inputstr, char from, char to) {
		if(isStringNullOrEmpty(inputstr)){
			return inputstr;
		}
		String outputstr = "";
		for(int i = 0; i < inputstr.length(); ++i){
			if(from == inputstr.charAt(i)){
				outputstr += to;
			}
			else{
				outputstr += inputstr.charAt(i);
			}
		}
		return outputstr;
	}
	

	private static boolean isStringNullOrEmpty(String inputstr) {
		return(inputstr == null || inputstr.length() == 0);
	}
	

	private static String trim(String s) {
		
		if(isStringNullOrEmpty(s)){
			return s;
		}
		
		if(hasNoTrailingOrLeadingSpaces(s)) {
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
	
