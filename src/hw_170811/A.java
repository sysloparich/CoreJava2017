package hw_170811;

import java.util.Random;

public class A implements Comparable<A>{

	static final int SEED = 67;
	static Random r = new Random(SEED);
	private static final int MAX_RANGE = 1_000_000;
	
	int x = r.nextInt(MAX_RANGE);
	
	@Override
	public String toString() {
		return Integer.toString(x);
	}

	@Override
	public int compareTo(A other) {
		return x - other.x;
	}	
	
	
}
