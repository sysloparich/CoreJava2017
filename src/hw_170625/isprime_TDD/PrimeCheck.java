package hw_170625.isprime_TDD;

public class PrimeCheck {

	static boolean isPrime(int i) {
		if(i <= 1) return false;
		else if (i == 2 || i == 3) return true;
		return(i%2!=0 && i%3!=0);
	}

}
