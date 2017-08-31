package worker;
import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T> {

	Queue<T> items = new LinkedList<>();
	
	public Queue<T> getItems() {
		return items;
	}
	
	public void put(T item) {
		synchronized (items) {
			items.offer(item);
			items.notify();
		}
	}
	
	public void addFirst(T item) {
		synchronized (items) {
			((LinkedList<T>) items).addFirst(item);
			items.notify();
		}
	}
	
	public T take() {
		synchronized (items) {
			while (items.isEmpty()) { // to prevent spurious wake-up
				try {
					items.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return items.poll();
		}
	}
	
}

