package hw_170712;

public class StringStack {

	private String[] elements; 
	private static final int DEFAULT_MAX_SIZE = 4;
	private int size;

	StringStack(){
		this(DEFAULT_MAX_SIZE);
	}
	
	
	StringStack(int maxSize){
		elements = new String[maxSize];
		this.size = 0;
	}
	
	
	public int size(){
		return size;
	}
	
	
	public String pop(){
		return null;
	}
	
	
	public boolean push(String smth){
		if(size >= elements.length) return false;
		elements[size++] = smth;
		return true;
	}
	
	
	public String tos(){
		return null;
	}
	
	
	public String toString(){
		return super.toString();
	}
}
