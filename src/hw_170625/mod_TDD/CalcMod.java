package hw_170625.mod_TDD;

public class CalcMod {
	static int modCalculate(int i, int j) {
		int tmp = i/j;
		return (i-j*tmp);
	}
}
