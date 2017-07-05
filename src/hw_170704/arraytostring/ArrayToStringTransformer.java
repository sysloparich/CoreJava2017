package hw_170704.arraytostring;

public class ArrayToStringTransformer {
	
	public static void main(String[] args) {
		int [] test_array = {3};
		toString(test_array);
	}

	private static void toString(int[] input) {
		String output = "";
		for(int i = 0; i < input.length; ++i){
			output += input[i];
		}
		System.out.println(output);
	}
}
