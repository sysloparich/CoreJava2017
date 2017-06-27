package hw_170625.mod_TDD;

import mytestframework.UnitTest;

public class ModTest {

	public static void main(String[] args) {
		try{		
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(3,3),0));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(3,3),1));		
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(4,3),1));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(4,3),0));		
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(3,4),3));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(3,4),0));
			
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(-3,4),-3));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(-3,4),3));		
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(-3,-4),-3));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(-3,-4),3));		
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(3,-4),3));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(3,-4),-3));		
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(-9,4),-1));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(-9,4),1));		
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(-9,-4),-1));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(-9,-4),1));		
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(9,-4),1));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(9,-4),-1));
			
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(3,-3),0));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(3,-3),-1));
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(-3,-3),0));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(-3,-3),-1));
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(-3,3),0));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(-3,3),-1));
			
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(0,-4),0));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(0,-4),1));		
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(0,4),0));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(0,4),1));
			
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(Integer.MAX_VALUE,2),1));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(Integer.MAX_VALUE,2),0));
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(Integer.MIN_VALUE,2),0));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(Integer.MIN_VALUE,2),1));
			
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(Integer.MAX_VALUE,Integer.MIN_VALUE),2147483647));
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(Integer.MAX_VALUE,-Integer.MIN_VALUE),2147483647));
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(-Integer.MAX_VALUE,Integer.MIN_VALUE),-2147483647));
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(-Integer.MAX_VALUE,-Integer.MIN_VALUE),-2147483647));
			
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(Integer.MAX_VALUE,Integer.MIN_VALUE),-2147483647));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(Integer.MAX_VALUE,-Integer.MIN_VALUE),-2147483647));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(-Integer.MAX_VALUE,Integer.MIN_VALUE),2147483647));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(-Integer.MAX_VALUE,-Integer.MIN_VALUE),2147483647));
			
			
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(Integer.MIN_VALUE,Integer.MAX_VALUE),-1));
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(-Integer.MIN_VALUE,Integer.MAX_VALUE),-1));
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(Integer.MIN_VALUE,-Integer.MAX_VALUE),-1));
			System.out.println(UnitTest.assertEquals(CalcMod.modCalculate(-Integer.MIN_VALUE,-Integer.MAX_VALUE),-1));
			
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(Integer.MIN_VALUE,Integer.MAX_VALUE),1));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(-Integer.MIN_VALUE,Integer.MAX_VALUE),1));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(Integer.MIN_VALUE,-Integer.MAX_VALUE),1));
			System.out.println(UnitTest.assertNotEquals(CalcMod.modCalculate(-Integer.MIN_VALUE,-Integer.MAX_VALUE),1));
		}
		catch(ArithmeticException ex){
			System.err.println("Division by zero");
		}

	}

}
