package hw_170625.isprime_TDD;

import mytestframework.Asserts;

public class PrimeTest {

	public static void main(String[] args) {
		System.out.println(Asserts.assertEquals(PrimeCheck.isPrime(1), false));
		System.out.println(Asserts.assertNotEquals(PrimeCheck.isPrime(1), true));
		
		System.out.println(Asserts.assertEquals(PrimeCheck.isPrime(2), true));
		System.out.println(Asserts.assertNotEquals(PrimeCheck.isPrime(2), false));
		System.out.println(Asserts.assertEquals(PrimeCheck.isPrime(3), true));
		System.out.println(Asserts.assertNotEquals(PrimeCheck.isPrime(2), false));
		
		System.out.println(Asserts.assertEquals(PrimeCheck.isPrime(4), false));
		System.out.println(Asserts.assertNotEquals(PrimeCheck.isPrime(4), true));
		System.out.println(Asserts.assertEquals(PrimeCheck.isPrime(5), true));
		System.out.println(Asserts.assertNotEquals(PrimeCheck.isPrime(5), false));
		System.out.println(Asserts.assertEquals(PrimeCheck.isPrime(6), false));
		System.out.println(Asserts.assertNotEquals(PrimeCheck.isPrime(6), true));

		System.out.println(Asserts.assertEquals(PrimeCheck.isPrime(Integer.MAX_VALUE), true));		
		System.out.println(Asserts.assertNotEquals(PrimeCheck.isPrime(Integer.MAX_VALUE), false));		
	}

}
