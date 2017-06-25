package hw_170625.sign_TDD;

public class SignTest {

	public static void main(String[] args) {
		System.out.println(UnitTest.assertEquals(SignValue.signCalc(-1),-1));
		System.out.println(UnitTest.assertNotEquals(SignValue.signCalc(-1),1));
		System.out.println(UnitTest.assertNotEquals(SignValue.signCalc(-1),0));
		
		System.out.println(UnitTest.assertEquals(SignValue.signCalc(1),1));
		System.out.println(UnitTest.assertNotEquals(SignValue.signCalc(1),-1));
		System.out.println(UnitTest.assertNotEquals(SignValue.signCalc(1),0));
		
		System.out.println(UnitTest.assertEquals(SignValue.signCalc(0),0));
		System.out.println(UnitTest.assertNotEquals(SignValue.signCalc(0),1));
		System.out.println(UnitTest.assertNotEquals(SignValue.signCalc(0),-1));
		
		System.out.println(UnitTest.assertEquals(SignValue.signCalc(Integer.MAX_VALUE),1));
		System.out.println(UnitTest.assertNotEquals(SignValue.signCalc(Integer.MAX_VALUE),-1));
		System.out.println(UnitTest.assertNotEquals(SignValue.signCalc(Integer.MAX_VALUE),0));
		
		System.out.println(UnitTest.assertEquals(SignValue.signCalc(Integer.MIN_VALUE),-1));
		System.out.println(UnitTest.assertNotEquals(SignValue.signCalc(Integer.MIN_VALUE),1));
		System.out.println(UnitTest.assertNotEquals(SignValue.signCalc(Integer.MIN_VALUE),0));
	}

}
