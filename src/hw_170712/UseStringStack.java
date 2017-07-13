package hw_170712;

import mytestframework.Asserts;

public class UseStringStack {

	public static void main(String[] args) {
		
		StringStack stack = new StringStack();
		
		boolean check1 = stack.push("first");
		System.out.println(Asserts.assertEquals(check1, true));
		System.out.println(Asserts.assertNotEquals(check1, false));
		
		stack.push("second");
		stack.push("third");
		stack.push("fourth");

		check1 = stack.push("fifth");
		System.out.println(Asserts.assertEquals(check1, false));
		System.out.println(Asserts.assertNotEquals(check1, true));
		
		String tosString = stack.tos();		
		System.out.println(Asserts.assertEquals(tosString, "fourth"));
		System.out.println(Asserts.assertNotEquals(tosString, "third"));
		
		StringStack stack1 = new StringStack();
		tosString = stack1.tos();		
		if(tosString == null) System.out.println(true);
		System.out.println(Asserts.assertNotEquals(tosString, "first"));
		
		System.out.println(Asserts.assertEquals(stack.size(), 4));
		System.out.println(Asserts.assertNotEquals(stack.size(), 3));
		
	}

}
