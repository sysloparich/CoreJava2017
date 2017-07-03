package hw_170701;

public class MatrixProcessing {

	public static void main(String[] args) {
		
		int[][] triangle = {
				{0, },	
				{3, 4,},	
				{6, 7, 8},	
		};
		
		int[][] matrix = {
				{0, 1, 2 },	
				{3, 4, -5},	
				{6, 7, 8},	
				{7, -7, 8},	
				{-8, -7, 8},	
		};
		
		count(matrix);
		System.out.println();
		count(triangle);
		
	}

	private static void count(int[][] matrix) {
		
		int sum = 0;
		OUTER: for (int i = 0; i < matrix.length; i++) {
			int[] row = matrix[i];
			for (int j = 0; j < row.length; j++) {
				if(row[j] < 0){
					sum = 0;
					continue OUTER;
				}
				sum += row[j];
			}
			System.out.println(sum + " row: " + i);
			sum = 0;
		}
	
	}

}
