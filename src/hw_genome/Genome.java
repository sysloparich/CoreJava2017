package hw_genome;

public class Genome {

	private static final int GENOME_SIZE = 3000000;

	public static void findDuplicates(byte[] data, int w) {
		int counter = 0;
		
		for(int i = 0; i < data.length-w; ++i){
			for(int j = i+1; j < data.length-w+1; ++j){
				boolean found = true;
				for(int k = 0; k < w; ++k){
					if(data[i+k] != data[j+k]){
						found = false;
						break;
					}
				}
				if(found){
					counter++;
					break;
				}
			}
		}
		System.out.println(counter);
	}
	
	public static void main(String[] args) {
		
		byte[] data = DataGenerator.generate(GENOME_SIZE);
		//byte[] data = {65,65,65,65,65,65,65,65,65,68,68,68,65};
		//byte[] data = {65,65,65};
		
		//System.out.println(data);
		
		/*
		for(byte b:data){
			System.out.println((char)b);
		}
		*/
		
		findDuplicates(data, Word.WORD_SIZE);				
	}

}
