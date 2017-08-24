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
		
		Map<String, Integer> map = freqCounterWithPut(list);
		System.out.println(map);
		
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
