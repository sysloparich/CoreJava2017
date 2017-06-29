package hw_170628.hex;

import mytestframework.Asserts;

public class HexTest {

	public static void main(String[] args) {
		
		System.out.println(Asserts.assertEquals(HexTransform.hTransform(17), "11"));
		System.out.println(Asserts.assertNotEquals(HexTransform.hTransform(17), "10"));

		System.out.println(Asserts.assertEquals(HexTransform.hTransform(200), "C8"));
		System.out.println(Asserts.assertNotEquals(HexTransform.hTransform(200), "D8"));

		System.out.println(Asserts.assertEquals(HexTransform.hTransform(Integer.MAX_VALUE), "7FFFFFFF"));
		System.out.println(Asserts.assertNotEquals(HexTransform.hTransform(Integer.MAX_VALUE), "7FFFFFFD"));	
		
		System.out.println(Asserts.assertEquals(HexTransform.hTransform(Integer.MIN_VALUE), "80000000"));
		System.out.println(Asserts.assertNotEquals(HexTransform.hTransform(Integer.MIN_VALUE), "7FFFFFFD"));	
		
		System.out.println(Asserts.assertEquals(HexTransform.hTransform(-200), "FFFFFF38"));
		System.out.println(Asserts.assertNotEquals(HexTransform.hTransform(-200), "D8"));
		
		System.out.println(Asserts.assertEquals(HexTransform.hTransform(-17), "FFFFFFEF"));
		System.out.println(Asserts.assertNotEquals(HexTransform.hTransform(-17), "10"));
		
	}

}
