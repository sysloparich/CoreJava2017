package hw_170710.stringlinkedlist;

import mytestframework.Asserts;

public class UseStringLinkedList {

	public static void main(String[] args) {
			
//			StringLinkedList list = new StringLinkedList();
//			list.add("one");
//			list.add("two");
//			list.add("three");
//			
//			System.out.println(list);
//			
//			System.out.println(list.remove("two"));
//			
//			System.out.println(list);
//			
//			list = new StringLinkedList();
//			
//			System.out.println(list.remove("two"));
//			
//			list.add("One");
//			System.out.println(list.remove("two"));
//			System.out.println(list.remove("One"));
//			
//			System.out.println(list);
		
		
			StringLinkedList list = new StringLinkedList();
			list.add("one");
			list.add("two");
			list.add("three");
			
			String tmp = null;
			tmp = list.remove(1);
			System.out.println(Asserts.assertEquals(tmp, "two"));
			System.out.println(Asserts.assertNotEquals(tmp, "one"));
			System.out.println(list);
			
			tmp = list.remove(1);
			System.out.println(Asserts.assertEquals(tmp, "three"));
			System.out.println(Asserts.assertNotEquals(tmp, "one"));
			System.out.println(list);
			
			tmp = list.remove(1);
			if(tmp == null) System.out.println("ERROR INDEX OR EMPTY LIST"); 
			System.out.println(list);
			
			tmp = list.remove(0);
			System.out.println(Asserts.assertEquals(tmp, "one"));
			System.out.println(Asserts.assertNotEquals(tmp, "null"));
			System.out.println(list);
			
			tmp = list.remove(0);
			if(tmp == null) System.out.println("ERROR INDEX OR EMPTY LIST");  
			System.out.println(list);
			
	}
	
}
