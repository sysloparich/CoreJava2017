package hw_170823;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyCounter {

	public static void main(String[] args) {

		List<String> list = new ArrayList();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("one");
		list.add("three");
		list.add("four");
		list.add("one");
		
		System.out.println(freqCounterWithPut(list));
		System.out.println(freqCounterWithPutIfAbsent(list));
		//System.out.println(freqCounterWithMerge(list));
		
		
		
	}

	private static Map<String,Integer> freqCounterWithMerge(List<String> list) {

		Map<String, Integer> map = new TreeMap<>();

		
		
		return map;
	}

	private static Map<String,Integer> freqCounterWithPutIfAbsent(List<String> list) {

		Map<String, Integer> map = new TreeMap<>();

		for (String string : list) {
			
			Integer count = map.putIfAbsent(string, 1);
			if(count != null) map.put(string, ++count);
			
		}
		
		return map;
	}

	private static Map<String,Integer> freqCounterWithPut(List<String> list) {

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

}
