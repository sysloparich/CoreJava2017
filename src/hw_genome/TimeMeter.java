package hw_genome;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TimeMeter {

	private static final int GENOME_SIZE = 30000;

	public static void main(String[] args) {

		byte[] data = DataGenerator.generate(GENOME_SIZE);
		
		Instant start = Instant.now();
		GenomeWithHashSet.findDuplicates(data, Word.WORD_SIZE);
		Instant stop = Instant.now();
		System.out.println("GenomeWithHashSet : " + Duration.between(start, stop).toMillis());
		
		start = Instant.now();
		GenomeWithSort.findDuplicates(data, Word.WORD_SIZE);
		stop = Instant.now();
		System.out.println("GenomeWithSort : " + Duration.between(start, stop).toMillis());
			
		start = Instant.now();
		Genome.findDuplicates(data, Word.WORD_SIZE);
		stop = Instant.now();
		System.out.println("Genome : " + Duration.between(start, stop).toMillis());
		
	}

}
