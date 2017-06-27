package hw_170625.sign_TDD;

import mytestframework.Asserts;

public class SignTest {

	public static void main(String[] args) {
		System.out.println(Asserts.assertEquals(SignValue.signCalc(-1),-1));
		System.out.println(Asserts.assertNotEquals(SignValue.signCalc(-1),1));
		System.out.println(Asserts.assertNotEquals(SignValue.signCalc(-1),0));
		
		System.out.println(Asserts.assertEquals(SignValue.signCalc(1),1));
		System.out.println(Asserts.assertNotEquals(SignValue.signCalc(1),-1));
		System.out.println(Asserts.assertNotEquals(SignValue.signCalc(1),0));
		
		System.out.println(Asserts.assertEquals(SignValue.signCalc(0),0));
		System.out.println(Asserts.assertNotEquals(SignValue.signCalc(0),1));
		System.out.println(Asserts.assertNotEquals(SignValue.signCalc(0),-1));
		
		System.out.println(Asserts.assertEquals(SignValue.signCalc(Integer.MAX_VALUE),1));
		System.out.println(Asserts.assertNotEquals(SignValue.signCalc(Integer.MAX_VALUE),-1));
		System.out.println(Asserts.assertNotEquals(SignValue.signCalc(Integer.MAX_VALUE),0));
		
		System.out.println(Asserts.assertEquals(SignValue.signCalc(Integer.MIN_VALUE),-1));
		System.out.println(Asserts.assertNotEquals(SignValue.signCalc(Integer.MIN_VALUE),1));
		System.out.println(Asserts.assertNotEquals(SignValue.signCalc(Integer.MIN_VALUE),0));
	}

}
