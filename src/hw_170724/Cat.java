package hw_170724;

public class Cat implements Pet{

	private Brain brain = this.new Hungry();
	
	private class Hungry implements Brain{

		@Override
		public void feed() {
			doMyau();
			wiggle();
			doMurr();
			doMurr();
			doMurr();
			brain = Cat.this.new Fed();
		}

		@Override
		public void play() {
			doMyau();
			wiggle();			
			wiggle();	
		}

		@Override
		public void caress() {
			doMurr();
			doMurr();
			wiggle();		
		}

		@Override
		public void scratch() {
			doMyau();
			doMyau();			
		}
		
	}
	
	class Fed implements Brain{

		@Override
		public void feed() {
			doMyau();
			
		}

		@Override
		public void play() {
			doMyau();
			doMyau();
			wiggle();
			brain = Cat.this.new Hungry();
		}

		@Override
		public void caress() {
			doMurr();
			doMurr();
			doMurr();
			doMurr();		
		}

		@Override
		public void scratch() {
			doMurr();
			wiggle();
			doMurr();
			wiggle();			
		}
		
	}


	public void doMurr() {
		System.out.println("Murrrrrr");		
	}

	public void wiggle() {
		System.out.println("Cat wiggle");		
	}

	public void doMyau() {
		System.out.println("Myauu");		
	}
	
	
	@Override
	public void feed() {
		brain.feed();		
	}

	@Override
	public void play() {
		brain.play();		
	}

	@Override
	public void caress() {
		brain.caress();	
	}

	@Override
	public void scratch() {
		brain.scratch();		
	}

}
