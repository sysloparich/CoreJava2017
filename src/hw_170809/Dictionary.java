package hw_170809;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import hw_170809.Dictionary.Pair;

public class Dictionary<K,V> implements Iterable<Pair<K,V>> {

	private static final int MAX = 3;

	public static class Pair<K,V> {
		public Pair(K key2, V value2) {
			key = key2;
			value = value2;
		}

		K key;
		V value;
	}

	@SuppressWarnings("unchecked")
	List<Pair<K, V>>[] data = new List[MAX];

	public void put(K key, V value) {
		
		int index = hash(key);
		if (data[index] == null) {
			data[index] = new ArrayList<>();
		}

		Pair<K,V> pair = getPair(key);

		if (pair == null) {
			data[index].add(new Pair<K,V>(key, value));
			return;
		}

		pair.value = value;

	}

	private int hash(K key) {
		return key.hashCode() & 0x7FFFFFFF % data.length;
	}

	public V get(K key) {
		Pair<K,V> pair = getPair(key);
		return pair == null ? null : pair.value;
	}

	private Pair<K,V> getPair(K key) {
		int index = hash(key);
		List<Pair<K,V>> list = data[index];
		if (list == null) { // guard condition
			return null;
		}
		for (Pair<K,V> pair : list) {
			if (pair.key.equals(key)) {
				return pair;
			}
		}

		return null;
	}

	@Override
	public Iterator<Pair<K,V>> iterator() {
		return new Iterator<Dictionary.Pair<K,V>>() {
			int currentElement = -1;
			Iterator<Pair<K,V>> listIterator = null;

			@Override
			public boolean hasNext() {

				if (listIterator != null && listIterator.hasNext()) {
					return true;
				}

				listIterator = null;

				for (++currentElement; listIterator == null
						&& currentElement < data.length; currentElement++) {
					List<Pair<K,V>> list = data[currentElement];
					if (list == null) {
						continue;
					}
					listIterator = list.iterator();
					if (!listIterator.hasNext()) {
						continue;
					}
					return listIterator.hasNext();
				}

				return false;
			}

			@Override
			public Pair<K,V> next() {
				if (!hasNext()) {
					throw new IllegalArgumentException();
				}
				return listIterator.next();
			}
		};
	}

}