package DvdoOOP;

public class MainClassAnimal {
	public static void main(String[] args) {
		
		Animal animal = new Animal("Human",22,"Homo Sapience",75);
		
		Human raja = new Human("Raja",22,75,2,true);
		//System.out.println(raja.getSpecies());
		//raja.getLegs(2);
		
		Female rani = new Female("Rani",22,65,2,true,'F',true);
		//rani.eat();
		raja.eat();
		//animal.eat();(q1)
		
		
		//System.out.println(raja.getLegs(2));
		
		
		// maam when am calling all this 3 methords by using object ref how it is being executed . 
		//maam can we use this and super in static methods . why compile time error
	
	}

}
