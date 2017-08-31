package worker;

public class UseWorker {
	
	public static void main(String[] args) {
		
		Worker worker = new Worker();
		
		worker.execute(() -> {
			System.out.print("hello, ");
		});

		worker.execute(() -> {
			System.out.println("world!");
		});
		
		worker.shutdown();
		
		worker.execute(() -> {
			System.out.println("world1!");
		});
		worker.execute(() -> {
			System.out.println("world2!");
		});
	}

}