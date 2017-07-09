package hw_170707.stringarraylist;

import java.util.Arrays;

public class StringArrayList {
	
	static final int DEFAULT_SIZE = 2;
	
	String[] elements = new String[DEFAULT_SIZE];
	
	//  [a,b,c,d,e,f]
	//   0 1 2 3 4 5
	
	int size = 0;

	public void add(String string) {
		
		if (size == elements.length) {
			elements = Arrays.copyOf(elements, elements.length * 2);
		}
		
		elements[size++] = string;
//		size = size + 1;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		if(size() != 0){
			sb.append(get(0)); 
			for(int i = 1; i < size(); ++i){
				sb.append(", " + elements[i]);
			}
		}
		sb.append("]");	
		return sb.toString();
	}
	
	//  [a,b,c,d,e,_]
	//   0 1 2 3 4 5
	//  [a,b,d,e,_,_]
	//   0 1 2 3 4 

	public void remove(int i) {
		if (i >= size || i < 0) {
			return;
		}
		
		System.arraycopy(elements, i+1, elements, i, --size - i);
		elements[size] = null;
		
	}
	
	public String get(int idx){
		if(hasIdxError(idx)){
			 return "ERROR";
		}
		return elements[idx];
	}

	private boolean hasIdxError(int idx) {
		return(idx > size || size < 1);
	}
	
	public int size(){
		return size;
	}
	

	public String set(int idx, String string) {
		if(hasIdxError(idx)){
			 return "ERROR";
		}
		String oldval = get(idx);
		elements[idx] = string;
		return oldval;
	}

}
