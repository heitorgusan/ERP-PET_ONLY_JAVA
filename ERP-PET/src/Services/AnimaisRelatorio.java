package Services;

import Domain.CustomerAnimals.Animal;

public class AnimaisRelatorio {
	public static void exibirAnimal(Animal animal) {
		System.out.println("Nome: "+animal.getName() + "\nEspécie: " + animal.getSpecies().RACA +"\nRaça: "+animal.getBreed());
	}
	
	
}
