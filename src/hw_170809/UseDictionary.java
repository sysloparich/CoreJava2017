package hw_170809;

import hw_170809.Dictionary.Pair;

public class UseDictionary {
	
	public static void main(String[] args) {
		
//		Dictionary<String,String> d = new Dictionary<>();
//		
//		d.put("Pete", "New York");
//		d.put("John", "Boston");
//		d.put("Вася", "Москва");
//		d.put("Петя", "Москва");
//		d.put("Боря", "Москва");
//		d.put("Оля", "Москва");
//		d.put("Жанна", "Москва");
//		d.put("Маша", "Москва");
//		d.put("Вано", "Москва");
//		
//		System.out.println(d.get("Ann"));
//		System.out.println(d.get("John"));
//		System.out.println(d.get("Вася"));
//		
//		d.put("Вася", "Петербург");
//		System.out.println(d.get("Вася"));
//		
//		for (Pair<String,String> pair : d) {
//			System.out.println(pair.key + " : " + pair.value);
//		}
		
		Dictionary<Integer,String> d = new Dictionary<>();
		
		d.put(1, "New York");
		d.put(3, "Boston");
		d.put(27, "Москва");
		d.put(3, "Москва");
		d.put(6, "Москва");
		d.put(5, "Москва");
		d.put(0, "Москва");
		d.put(-1, "Москва");
		d.put(23, "Москва");
		
		System.out.println(d.get(6));
		System.out.println(d.get(0));
		System.out.println(d.get(3));
		
		d.put(7, "Петербург");
		System.out.println(d.get(7));
		
		for (Pair<Integer,String> pair : d) {
			System.out.println(pair.key + " : " + pair.value);
		}
		
	}

}