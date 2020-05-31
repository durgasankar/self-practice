package DvdoOOP;

public class Animal {
	
	private String name;
	private int age;
	private String species;
	private int weight;
	
	public Animal(String name, int age, String species, int weight) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.weight = weight;
	}
	public void eat() {
		System.out.println("All aminals eat food for survival");
	}
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getSpecies() {
		return "Homo Sapience";
	}
	public int getWeight() {
		return weight;
	}
	
}

