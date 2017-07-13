package hw_170712;

import mytestframework.Asserts;

public class UseStringStack {

	public static void main(String[] args) {
		
		StringStack stack = new StringStack();
		
		boolean check1 = stack.push("first");
		System.out.println(Asserts.assertEquals(check1, true));
		System.out.println(Asserts.assertNotEquals(check1, false));
		
	}

}
