package hw_170724;

interface HamsterBrain extends Brain {
	
}

public class Hamster implements Pet{
	
	private HamsterBrain brain = new HungryHam(this);
	
	public void setBrain(HamsterBrain hb) {
		this.brain = hb;
	}
	
	public HamsterBrain getBrain() {
		return brain;
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
	
	public void chew(){
		System.out.println("chew chew chew");
	}

	public void sniff(){
		System.out.println("ff ff ff");
	}
	
	public void run(){
		System.out.println("run");
	}
	
}

class HungryHam implements HamsterBrain {
	
	private Hamster ham;
	
	public HungryHam(Hamster ham){
		this.ham = ham;
	}

	@Override
	public void feed() {
		ham.chew();
		ham.chew();
		ham.chew();
		ham.setBrain(new FedHam(ham));
	}

	@Override
	public void play() {
		ham.run();
		ham.run();
	}

	@Override
	public void caress() {
		ham.run();
		ham.sniff();
	}

	@Override
	public void scratch() {
		ham.sniff();
		ham.sniff();
		ham.sniff();
	}
	
}

class FedHam implements HamsterBrain {
	
	private Hamster ham;
	
	public FedHam(Hamster ham){
		this.ham = ham;
	}	

	@Override
	public void feed() {
		ham.run();
		ham.sniff();
		ham.chew();
	}

	@Override
	public void play() {
		ham.run();
		ham.setBrain(new HungryHam(ham));	
	}

	@Override
	public void caress() {
		ham.sniff();
		
	}

	@Override
	public void scratch() {	
		ham.run();
	}
	
}
