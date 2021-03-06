package hw_170628.octal;

import mytestframework.Asserts;

public class OctalTest {

	public static void main(String[] args) {
		System.out.println(Asserts.assertEquals(OctalTransform.oTransform(0), "0"));
		System.out.println(Asserts.assertNotEquals(OctalTransform.oTransform(0), "1"));
		System.out.println(Asserts.assertEquals(OctalTransform.oTransform(7), "7"));
		System.out.println(Asserts.assertNotEquals(OctalTransform.oTransform(7), "24"));
		System.out.println(Asserts.assertEquals(OctalTransform.oTransform(8), "10"));
		System.out.println(Asserts.assertNotEquals(OctalTransform.oTransform(8), "24"));
		
		System.out.println(Asserts.assertEquals(OctalTransform.oTransform(20), "24"));
		System.out.println(Asserts.assertNotEquals(OctalTransform.oTransform(20), "25"));
		System.out.println(Asserts.assertEquals(OctalTransform.oTransform(17), "21"));
		System.out.println(Asserts.assertNotEquals(OctalTransform.oTransform(17), "20"));
		
		System.out.println(Asserts.assertEquals(OctalTransform.oTransform(Integer.MAX_VALUE), "17777777777"));
		System.out.println(Asserts.assertNotEquals(OctalTransform.oTransform(Integer.MAX_VALUE), "24"));
		
		System.out.println(Asserts.assertEquals(OctalTransform.oTransform(Integer.MIN_VALUE), "20000000000"));
		System.out.println(Asserts.assertNotEquals(OctalTransform.oTransform(Integer.MIN_VALUE), "24"));
		
		System.out.println(Asserts.assertEquals(OctalTransform.oTransform(-17), "37777777757"));
		System.out.println(Asserts.assertNotEquals(OctalTransform.oTransform(-17), "20"));
		System.out.println(Asserts.assertEquals(OctalTransform.oTransform(-20), "37777777754"));
		System.out.println(Asserts.assertNotEquals(OctalTransform.oTransform(-20), "37777777753"));

	}

}
