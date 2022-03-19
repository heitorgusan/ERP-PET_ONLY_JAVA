package Domain.CustomerAnimals;

public class Animal {
	private String name;
	public Species species;
	private String breed;
	
	//Constructor
	public Animal(String name, String species, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}
	
	public Animal() {
		
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}
	
	
}
