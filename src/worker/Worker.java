package worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;

public class Worker implements Executor {
	
	private static final Runnable POISON_PILL = () -> {};
	private static final Runnable VERY_POISON_PILL = () -> {};

	private boolean stop = false;
	
	BlockingQueue<Runnable> tasks = new BlockingQueue<>();
	
	private Thread worker = new Thread(this::processTasks);
	
	public Worker() {
		worker.start();
	}

	@Override
	public void execute(Runnable command) {
		
		if(stop) throw new IllegalStateException();
		if(command == VERY_POISON_PILL) {			
			stop = true;
			tasks.addFirst(command);
		} 
		else {			
			if(command == POISON_PILL) stop = true;
			tasks.put(command);
		}
		
	}
	
	private void processTasks() {
		while (true) {
			Runnable task = tasks.take();
			if (task == POISON_PILL || task == VERY_POISON_PILL) {
				return;
			}
			Optional.ofNullable(task).ifPresent(r -> r.run());
		}
		
	}
	
	public void shutdown() {
		execute(POISON_PILL);
	}
	
	public List<Runnable> shutdownNow() {
		execute(VERY_POISON_PILL);
		return (List<Runnable>) tasks.getItems();
	}
	
}