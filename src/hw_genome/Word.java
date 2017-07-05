package hw_genome;

class Word implements Comparable<Word> {
	
	byte[] data;
	int offset;
	
	static final int WORD_SIZE = 10;
	
	public Word(byte[] data, int i) {
		this.data = data;
		offset = i;
	}

	@Override
	public int compareTo(Word otherWord) {
		for (int i = 0; i < Word.WORD_SIZE; i++) {
			int diff = data[offset + i] - data[otherWord.offset + i];
			if (diff != 0) {
				return diff;
			}
		}
		return 0;
	}
	
	@Override
	public boolean equals(Object object) {
		if(object == null) return false;
		if(!(object instanceof Word)) return false;
		if(this == object) return true;
		Word other = (Word) object;
		if(other.compareTo(this) != 0) return false; 
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 59;
		for(int i = offset; i < offset + Word.WORD_SIZE; ++i){
			result = prime*result + (int)data[i];
		}
		return result;
	}
	
}