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
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

		System.out.println(worker.shutdownNow().size());
		
//		worker.shutdown();
//		
//		worker.execute(() -> {
//			System.out.println("world1!");
//		});
//		worker.execute(() -> {
//			System.out.println("world2!");
//		});
		
	}

}