package hw_170724;

public class Dog implements Pet {
	
	private Brain brain = this.new Hungry();
	
	private class Hungry implements Brain {

		@Override
		public void feed() {
			bark();
			wiggle();
			eat();
			bark();
			brain = Dog.this.new Fed();
		}

		@Override
		public void play() {
			bark();
			bite();
			bark();
		}

		@Override
		public void caress() {
			wiggle();
		}

		@Override
		public void scratch() {
			bark();	
			bark();	
			bark();				
		}
		
	}
	
	private class Fed implements Brain {
		
		@Override
		public void feed() {
			wiggle();
			wiggle();
		}
		
		@Override
		public void play() {
			bark();
			wiggle();
			jump();
			jump();
			brain = Dog.this.new Hungry();
		}

		@Override
		public void caress() {
			wiggle();
			jump();
			wiggle();
			jump();
		}

		@Override
		public void scratch() {
			bark();		
		}
		
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
	
	
	private void jump() {
		System.out.println("jumps");
	}
	
	private void bite() {
		System.out.println("bites");
	}
	
	private void eat() {
		System.out.println("eats");
	}

	private void wiggle() {
		System.out.println("wiggle");
	}

	private void bark() {
		System.out.println("barks");
	}


}
