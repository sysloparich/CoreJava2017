package hw_170816;

import java.util.Arrays;
	
public class KeyIndexedCounting {

	public static void main(String[] args) {
		//a0 b1 c2 d3 e4 f5

		int[] a = {3,0,2,5,5,1,3,1,5,1,4,0,};
		int[] aux = new int[a.length];
		
		int R = 6;
		int N = a.length;
		int[] count = new int[R+1]; 
		
		for(int i = 0; i < N; ++i){
			count[a[i]+1]++;
		}
		for(int r = 0; r < R; ++r){
			count[r+1] += count[r];
		}
		for(int i = 0; i < N; ++i){
			aux[count[a[i]]++] = a[i];
		}
		for(int i = 0; i < N; ++i){
			a[i] = aux[i];
		}
				
		System.out.println(Arrays.toString(a));
		
	}

}
