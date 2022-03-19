package Services;

import java.util.Scanner;

import Domain.CustomerAnimals.Animal;
import Domain.CustomerAnimals.Species;

public class AnimaisServicos {
	public static void cadastrarAnimal(Animal animal) {
		Scanner leitor = new Scanner(System.in);
		String opcaoText;
		int opcaoNumber;
		System.out.println("-----Cadastro Animal-------------");
		System.out.println("---Nome Animal---");
		opcaoText = leitor.nextLine();
		animal.setName(opcaoText);
		System.out.println("---Especie---");
		System.out.println("1-Cachorro");
		System.out.println("2-Gato");
		opcaoNumber = leitor.nextInt();
		leitor.nextLine();
		if(opcaoNumber == Species.DOG.ID) {
			animal.setSpecies(Species.DOG);
		}else {
			animal.setSpecies(Species.CAT);
		}
		
		System.out.println("---Raça---");
		opcaoText = leitor.nextLine();
		animal.setBreed(opcaoText);
		
		System.out.println("---Animal Cadastrado com sucesso---");
		
	}
}
