package hw_170724;

import java.util.ArrayList;
import java.util.List;

public class TakeCare {

	public static void main(String[] args) {
		
		List<Pet> pets = new ArrayList<>();
		
		pets.add(new Dog());
		pets.add(new Cat());
		
		for(Pet pet : pets){
			pet.play();
			System.out.println("---");
			pet.feed();
			System.out.println("---");
			pet.feed();
			System.out.println("---");
			pet.play();
			System.out.println("---");
			pet.play();
			System.out.println("---");
			pet.scratch();
			System.out.println("---");
			pet.caress();
			System.out.println("---");
			pet.feed();
			System.out.println("---");
			pet.scratch();
			System.out.println("---");
			pet.caress();
			System.out.println("=========================");
		}
		
	}

}
