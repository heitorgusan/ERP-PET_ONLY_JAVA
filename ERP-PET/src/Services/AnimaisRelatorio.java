package Services;

import Domain.CustomerAnimals.Animal;

public class AnimaisRelatorio {
	public static void exibirAnimal(Animal animal) {
		System.out.println("Nome: "+animal.getName() + "\nEsp�cie: " + animal.getSpecies().RACA +"\nRa�a: "+animal.getBreed());
	}
	
	
}
