package hw_170811;

import java.util.Random;

public class A implements Comparable<A>{

	static Random r = new Random();
	int x = r.nextInt(10);
	
	@Override
	public String toString() {
		return Integer.toString(x);
	}

	@Override
	public int compareTo(A other) {
		return x - other.x;
	}	
	
	
}
