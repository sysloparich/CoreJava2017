package hw_genome;

import java.util.Random;

public class DataGenerator {
	
	static final byte[] ALPHABET = {'A', 'C', 'G', 'T'};
	
	static public byte[] generate(int size){
		byte[] data = new byte[size];
		
		Random random = new Random();
		
		for(int i=0; i<data.length; i++){
			int letterIndex = random.nextInt(ALPHABET.length);
			data[i] = ALPHABET[letterIndex];
		}
		
		return data;
	}
	
}
