package hw_genome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenomeWithSort {

	private static final int GENOME_SIZE = 3000000;
	
	public static void findDuplicates(byte[] data, int w) {
		
		List<Word> list = new ArrayList<>();

		for (int i = 0; i <= data.length - w; i++) {
			list.add(new Word(data, i));
		}

		Collections.sort(list);
		
		int count = 0;
		if(list.size() > 1){
			for (int i = 1; i < list.size(); ++i) {
				if(list.get(i).compareTo(list.get(i-1)) == 0){
					count++;
				}
			}			
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {

		byte[] data = DataGenerator.generate(GENOME_SIZE);
		//byte[] data = {65,65,65,65,65,65,65,65,65,68,68,68,65};
		//byte[] data = {65,65,65};
		
		/*
		for (Word word : list) {
			byte[] wordBytes = Arrays.copyOfRange(data, word.offset,
					word.offset + WORD_SIZE);
			
			System.out.println(Arrays.toString(wordBytes));
		}
		*/
		
		findDuplicates(data, Word.WORD_SIZE);
		
	}


}
