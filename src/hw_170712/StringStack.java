package hw_170712;

import java.util.Arrays;

public class StringStack {

	private String[] elements; 
	private static final int DEFAULT_MAX_SIZE = 4;
	private int size;

	StringStack(){
		this(DEFAULT_MAX_SIZE);
	}
	
	
	StringStack(int maxSize){
		elements = new String[maxSize];
	}
	
	
	public int size(){
		return size;
	}
	
	
	public String pop(){
		if(size <= 0) return null;
		String result = elements[--size];
		elements[size] = null;
		return result;
	}
	
	
	public boolean push(String smth){
		if(size >= elements.length) return false;
		elements[size++] = smth;
		return true;
	}
	
	
	public String tos(){
		return size <= 0 ? null : elements[size-1];	
	}
	
	
	public String toString(){
//		StringBuilder sb = new StringBuilder("[");
//		
//		if(size != 0){
//			
//			sb.append(elements[0]);
//			for(int i = 1; i < size; ++i){
//				sb.append(", " + elements[i]);
//			}
//			
//		}
//		
//		sb.append("]");
//		return sb.toString();
		return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
	}
}
