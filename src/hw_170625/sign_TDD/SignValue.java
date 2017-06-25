package hw_170625.sign_TDD;

public class SignValue {
	static int signCalc(int i) {
		if(i > 0) return 1;
		else if(i < 0) return -1;
		return 0;
	}
}
