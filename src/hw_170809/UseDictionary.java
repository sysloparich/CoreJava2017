package hw_170809;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

import hw_170809.Dictionary.Pair;

public class UseDictionary {
	
	public static void main(String[] args) {
		
		Dictionary<Integer, Integer> d1 = new Dictionary();
		Dictionary<Integer, Integer> d2 = new Dictionary();
		Dictionary<Integer, Integer> d3 = new Dictionary();
			
		System.out.println("add 1000 elements :" + calculateFillingTime(d1, 1000));
		System.out.println("add 10000 elements :" + calculateFillingTime(d2, 10000));
		System.out.println("add 100000 elements :" + calculateFillingTime(d3, 100000));
		

		System.out.println("Search element which is not present (in 1000) : " + calculateSearchingTime(d1, 1_000_067));
		System.out.println("Search element which is not present (in 10000) : " + calculateSearchingTime(d2, 1_000_067));
		System.out.println("Search element which is not present (in 100000) : " + calculateSearchingTime(d3, 1_000_067));
	
		
		d1.put(1_000_067, 667);
		d2.put(1_000_067, 667);
		d3.put(1_000_067, 667);

		
		System.out.println("Search element which is present (in 1000) : " + calculateSearchingTime(d1,1_000_067));
		System.out.println("Search element which is present (in 10000) : " + calculateSearchingTime(d2,1_000_067));
		System.out.println("Search element which is present (in 100000) : " + calculateSearchingTime(d3,1_000_067));
		
	}
	
	private static long calculateSearchingTime(Dictionary<Integer, Integer> dictionary, int key) {
		Instant start = Instant.now();
		dictionary.get(key);
		Instant stop = Instant.now();
		return Duration.between(start, stop).toNanos();	
	}

	private static long calculateFillingTime(Dictionary<Integer, Integer> dictionary, int size) {
		Random r = new Random();
		Instant start = Instant.now();
		for(int i = 0; i < size; ++i){
			dictionary.put(r.nextInt(100000), r.nextInt());
		}
		Instant stop = Instant.now();
		return Duration.between(start, stop).toNanos();		
	}

}