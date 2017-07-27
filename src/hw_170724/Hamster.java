package hw_170724;

public class Hamster implements Pet{

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		//throw new UnsupportedOperationException();		
	}

	@Override
	public void caress() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scratch() {
		//throw new UnsupportedOperationException();		
	}
	
	

}

class Helper{
	
	private Hamster hamster;
	
	private class Hungry implements Brain{

		@Override
		public void feed() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void play() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void caress() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void scratch() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class Fed implements Brain {

		@Override
		public void feed() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void play() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void caress() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void scratch() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public Helper(Hamster hamster){
		this.hamster = hamster;
	}
	
}
