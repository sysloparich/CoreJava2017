package mytestframework;

public class Asserts {
	public static boolean assertEquals(int actual, int expected) {
		return actual==expected;
	}

	public static boolean assertNotEquals(int actual, int expected) {
		return actual!=expected;
	}

	public static boolean assertEquals(boolean actual, boolean expected) {
		return actual==expected;
	}
	
	public static boolean assertNotEquals(boolean actual, boolean expected) {
		return actual!=expected;
	}
	
	public static boolean assertEquals(String actual, String expected) {
		return expected.equals(actual);
	}
	
	public static boolean assertNotEquals(String actual, String expected) {
		return !expected.equals(actual);
	}
}
