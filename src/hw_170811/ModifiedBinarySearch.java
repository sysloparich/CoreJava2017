package hw_170811;

import java.util.Arrays;
import java.util.Random;

public class ModifiedBinarySearch {
	
	public static int binarySearch(int[] a, int key){
		
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi){
			int mid = lo + (hi-lo)/2;
			if(key < a[mid]) {
				hi = mid - 1;
			}
			else {
				if(key > a[mid]) {
					lo = mid + 1;
				}					
				else return mid;
			}
		}
		
		return -lo;
	}

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] a = new int[20];
		
		for(int i = 0; i < a.length; ++i){
			a[i] = r.nextInt(30);
		}
		
		Arrays.sort(a);
		
		for(int i = 0; i < a.length; ++i){
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(binarySearch(a,10));
		
	}

}
