package Domain.CustomerAnimals;

public class Animal {
	private String name;
	private String species;
	private String breed;
	
	//Constructor
	public Animal(String name, String species, String breed) {
		super();
		this.name = name;
		this.species = species;
		this.breed = breed;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
}
