package hw_genome;

import java.util.HashSet;
import java.util.Set;

public class GenomeWithHashSet {
	
	private static final int GENOME_SIZE = 3000000;

	public static void findDuplicates(byte[] data, int w) {
		int counter = 0;
		
		Set<Word> words = new HashSet();
		for (int i = 0; i <= data.length - Word.WORD_SIZE; i++) {
			if(words.contains(new Word(data, i))){
				counter++;
			}
			else{
				words.add(new Word(data, i));
			}
		}
		
		System.out.println(counter);
	}
	
	public static void main(String[] args) {
		//byte[] data = {65,65,65,65,65,65,65,65,65,68,68,68,65};
		//byte[] data = {65,65,65};
		byte[] data = DataGenerator.generate(GENOME_SIZE);
		
		
		findDuplicates(data, Word.WORD_SIZE);
		/*
		Word a = new Word(data,0);
		Word b = new Word(data,7);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		*/
	}
}
