package mytestframework;

public class UnitTest {
	public static boolean assertEquals(int actual, int expected) {
		return actual==expected;
	}

	public static boolean assertNotEquals(int actual, int expected) {
		return actual!=expected;
	}
}
