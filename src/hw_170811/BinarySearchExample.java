package hw_170811;

import java.time.Duration;
import java.time.Instant;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

public class BinarySearchExample {

	private static final int NUMBER_OF_ELEMENTS = 1_000_000;

	public static void main(String[] args) {
		
		System.out.println("All time in Nanos");
		
		long llist = 0;
		long alist = 0;
		long tset = 0;

		LinkedList<A> linkedList = new LinkedList<>();	
		Instant start = Instant.now();		
		addElements(linkedList);		
		Instant stop = Instant.now();
		llist += Duration.between(start, stop).toNanos();
		System.out.println("LinkedList add 1_000_000 elements : " + Duration.between(start, stop).toNanos());
		
		ArrayList<A> arrayList = new ArrayList<>();		
		start = Instant.now();	
		addElements(arrayList);	
		stop = Instant.now();
		alist += Duration.between(start, stop).toNanos();
		System.out.println("ArrayList add 1_000_000 elements : " + Duration.between(start, stop).toNanos());	
		
		start = Instant.now();
		Collections.sort(linkedList);
		stop = Instant.now();
		llist += Duration.between(start, stop).toNanos();
		System.out.println("LinkedList sort 1_000_000 elements : " + Duration.between(start, stop).toNanos());
		
		start = Instant.now();
		Collections.sort(arrayList);
		stop = Instant.now();
		alist += Duration.between(start, stop).toNanos();
		System.out.println("ArrayList sort 1_000_000 elements : " + Duration.between(start, stop).toNanos());		
		
		
		TreeSet<A> treeSet = new TreeSet<>();
		start = Instant.now();		
		addElements(treeSet);			
		stop = Instant.now();
		tset += Duration.between(start, stop).toNanos();
		System.out.println("TreeSet add (and sort) 1_000_000 elements : " + Duration.between(start, stop).toNanos());
		
		A key = new A();
		
		System.out.println("Searching element : " + key.x);
		
		start = Instant.now();
		int index = Collections.binarySearch(linkedList, key);
		stop = Instant.now();
		llist += Duration.between(start, stop).toNanos();
		System.out.println("Index of element: " + index + "; LinkedList search : " + 
							Duration.between(start, stop).toNanos());
		
		start = Instant.now();
		index = Collections.binarySearch(arrayList, key);
		stop = Instant.now();
		alist += Duration.between(start, stop).toNanos();
		System.out.println("Index of element: " + index + "; ArrayList search : " + 
							Duration.between(start, stop).toNanos());
		
		start = Instant.now();
		boolean contains = treeSet.contains(key);
		stop = Instant.now();
		tset += Duration.between(start, stop).toNanos();
		System.out.println("Contains? " + contains + " TreeSet search : " + 
							Duration.between(start, stop).toNanos());
		
		System.out.println("=========================");
		
		System.out.println("Full Time:");
		
		System.out.println("LinkedList " + llist);
		System.out.println(" ArrayList " + alist);
		System.out.println("   TreeSet " + tset);
		
	}

	private static void addElements(AbstractCollection<A> structure) {
		A some = new A();
		for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
			structure.add(some);
			some = new A();
			//System.out.print(some);
		}
		some.resetRandom();
	}
	
}
