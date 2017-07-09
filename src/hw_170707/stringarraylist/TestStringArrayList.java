package hw_170707.stringarraylist;

import java.util.ArrayList;

import mytestframework.Asserts;

public class TestStringArrayList {

	public static void main(String[] args) {

		StringArrayList list1 = new StringArrayList();
				
		System.out.println(Asserts.assertEquals(list1.get(0), "ERROR"));
		System.out.println(Asserts.assertNotEquals(list1.get(0), "null"));
		System.out.println(Asserts.assertEquals(list1.size(), 0));
		System.out.println(Asserts.assertNotEquals(list1.size(), 1));
		System.out.println(Asserts.assertEquals(list1.toString(), "[]"));
		System.out.println(Asserts.assertNotEquals(list1.toString(), ""));
		
		list1.add("first");
		System.out.println(Asserts.assertEquals(list1.get(0), "first"));
		System.out.println(Asserts.assertNotEquals(list1.get(0), "second"));
		System.out.println(Asserts.assertEquals(list1.size(), 1));
		System.out.println(Asserts.assertNotEquals(list1.size(), 0));
		System.out.println(Asserts.assertEquals(list1.toString(), "[first]"));
		System.out.println(Asserts.assertNotEquals(list1.toString(), ""));
		
		list1.add("second");
		list1.add("third");
		System.out.println(Asserts.assertEquals(list1.toString(), "[first, second, third]"));
		System.out.println(Asserts.assertNotEquals(list1.toString(), "first"));
		
		
		StringArrayList list2 = new StringArrayList();
		System.out.println(Asserts.assertEquals(list2.set(0, "second"), "ERROR"));
		System.out.println(Asserts.assertEquals(list2.toString(), "[]"));
		
		list2.add("first");
		System.out.println(Asserts.assertEquals(list2.set(0, "second"), "first"));
		System.out.println(Asserts.assertEquals(list2.toString(), "[second]"));
		

		
	}

}
