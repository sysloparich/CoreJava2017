package worker;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;

public class Worker implements Executor {
	
	static final Runnable POISON_PILL = () -> {};

	private boolean stop = false;
	
	BlockingQueue<Runnable> tasks = new BlockingQueue<>();

	
	public Worker() {
		new Thread(this::processTasks).start();
	}

	@Override
	public void execute(Runnable command) {
		
		if(stop) throw new IllegalStateException();
		if(command == POISON_PILL) stop = true;
		tasks.put(command);
		
	}
	
	private void processTasks() {
		while (true) {
			Runnable task = tasks.take();
			if (task == POISON_PILL) {
				return;
			}
			Optional.ofNullable(task).ifPresent(r -> r.run());
		}
		
	}
	
	public void shutdown() {
		//tasks.put(POISON_PILL);
		execute(POISON_PILL);
	}
	
	public List<Runnable>  shutdownNow() {
		// TODO
		return null;
	}
	
}