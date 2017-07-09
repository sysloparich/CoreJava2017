package hw_170704.arraytostring;

public class ArrayToStringTransformer {
	
	public static void main(String[] args) {
		int [] test_array = {3,4, 7};
		toString(test_array);
	}

	private static void toString(int[] input) {
		String output = "[" + input[0];
		for(int i = 1; i < input.length; ++i){
			output += ", " + input[i];
		}
		output += "]";
		System.out.println(output);
	}
}
