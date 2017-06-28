package hw_170628.binary;

import mytestframework.Asserts;

public class BinaryTest {

	public static void main(String[] args) {
		System.out.println(Asserts.assertEquals(BinaryTransform.bTransform(20), "1010"));
		System.out.println(Asserts.assertNotEquals(BinaryTransform.bTransform(20), "101"));
		
		System.out.println(Asserts.assertEquals(BinaryTransform.bTransform(247), "11110111"));
		System.out.println(Asserts.assertNotEquals(BinaryTransform.bTransform(19), "101"));
		
		System.out.println(Asserts.assertEquals(BinaryTransform.bTransform(1), "1"));
		System.out.println(Asserts.assertNotEquals(BinaryTransform.bTransform(1), "10"));
		
		System.out.println(Asserts.assertEquals(BinaryTransform.bTransform(0), "0"));
		System.out.println(Asserts.assertNotEquals(BinaryTransform.bTransform(0), "1"));
	}

}
