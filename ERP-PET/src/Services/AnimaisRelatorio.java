package Services;

import java.util.Scanner;

import Domain.CustomerAnimals.Animal;
import Domain.CustomerAnimals.Species;

public class AnimaisRelatorio {
	public static void exibirAnimal(Animal animal) {
		System.out.println("---Animal---");
		System.out.println("---Nome---");
		System.out.println(animal.getName());
		System.out.println("---Esp�cie---");
		System.out.println(animal.getSpecies());
		System.out.println("---Ra�a---");
		System.out.println(animal.getBreed());
		System.out.println("------------");
	}
	
	
}
