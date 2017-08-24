package hw_170823;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;

public class FrequencyCounter {

	public static void main(String[] args) {

		List<String> list = new ArrayList(); //non-empty list
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("one");
		list.add("three");
		list.add("four");
		list.add("one");
		printAllCases(list);
		
		List<String> list1 = new ArrayList(); // empty list		
		printAllCases(list1);
		
//		List<String> list2 = new ArrayList(); // non-empty list with null, causes Exceptions in frequency counters
//		list2.add(null);
//		printAllCases(list2);
//		
//		printAllCases(null); // list == null, causes Exceptions in frequency counters
		
	}

	public static void printAllCases(List<String> list) {
		try {
			System.out.println("freqCounterWithPut:");
			System.out.println(freqCounterWithPut(list));
		} catch (DataFormatException e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println("freqCounterWithPutIfAbsent:");
			System.out.println(freqCounterWithPutIfAbsent(list));
		} catch (DataFormatException e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println("freqCounterWithMerge:");
			System.out.println(freqCounterWithMerge(list));
		} catch (DataFormatException e) {
			System.err.println(e.getMessage());
		}
	}

	private static Map<String,Integer> freqCounterWithMerge(List<String> list) throws DataFormatException {

		if(checkIfNull(list)) throw new DataFormatException("in freqCounterWithMerge");

		Map<String, Integer> map = new TreeMap<>();

		for (String string : list) {
			
			//map.merge(string, 1, (a,b) -> Integer.sum(a, b));
			map.merge(string, 1, Integer::sum);
			
		}
		
		return map;
	}

	private static Map<String,Integer> freqCounterWithPutIfAbsent(List<String> list) throws DataFormatException {

		if(checkIfNull(list)) throw new DataFormatException("in freqCounterWithPutIfAbsent");

		Map<String, Integer> map = new TreeMap<>();

		for (String string : list) {
			
			Integer count = map.putIfAbsent(string, 1);
			if(count != null) map.put(string, ++count);
			
		}
		
		return map;
	}

	private static Map<String,Integer> freqCounterWithPut(List<String> list) throws DataFormatException {
		
		if(checkIfNull(list)) throw new DataFormatException("in freqCounterWithPut");

		Map<String, Integer> map = new TreeMap<>();
		
		for (String string : list) {
			
			if(!map.containsKey(string)) map.put(string, 1);
			else{
				int count = map.get(string);
				map.put(string, ++count);
			}
			
		}
		
		return map;
		
	}
	
	private static boolean checkIfNull(List<String> list) {
		
		if(list == null) return true;
		
		for (String string : list) {
			if(string == null) return true;
		}
		
		return false;
		
	}

}
