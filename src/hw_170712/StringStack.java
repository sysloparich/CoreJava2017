package hw_170712;

public class StringStack {

	private String[] elements; 
	private static final int DEFAULT_MAX_SIZE = 4;
	private int size;

	StringStack(){
		this(DEFAULT_MAX_SIZE);
	}
	
	
	StringStack(int size){
		this.size = size;
	}
	
	
	public int size(){
		return size;
	}
	
	
	public String pop(){
		return null;
	}
	
	
	public boolean push(String smth){
		return false;
	}
	
	
	public String tos(){
		return null;
	}
	
	
	public String toString(){
		return super.toString();
	}
}
