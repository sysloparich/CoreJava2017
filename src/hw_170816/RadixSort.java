package hw_170816;

public class RadixSort {

	public static void main(String[] args) {
		
		int[] b = {3,200,5,5,1,3,1,5,1,4,0,};
		
		b = doSort(b, 32, 2);
		for(int i = 0; i < b.length; ++i){
			System.out.print(b[i] + " ");
		}
		
	}

	public static int[] doSort(int[] a, int W, int R) {
		
		int N = a.length;
		int[] aux = new int[N];
		for(int d = 0; d < W; ++d){
			int[] count = new int[R+1];
			for(int i = 0; i < N; ++i){
				count[ ((a[i] >> (d)) & 1) + 1 ]++;
			}
			for(int r = 0; r < R; ++r){
				count[r+1] += count[r];
			}
			for(int i = 0; i < N; ++i){				
				aux[ count[ (a[i] >> (d)) & 1]++ ] = a[i];
			}
			for(int i = 0; i < N; ++i){
				a[i] = aux[i];
			}
		}
	  
		return a;
	}

}
