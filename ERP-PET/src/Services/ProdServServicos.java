package Services;

import java.util.Scanner;

import Domain.CustomerAnimals.ProdServ;
import Domain.CustomerAnimals.ProdutoServico;

public class ProdServServicos {

	public static void CadastrarProdServ(ProdServ prod,boolean isProduto) {
		Scanner leitor = new Scanner(System.in);
		String opcaoTexto;
		double opcaoNumber;
		
		System.out.println("Nome");
		opcaoTexto = leitor.nextLine();
		prod.setName(opcaoTexto);
		
		System.out.println("Grupo");
		opcaoTexto = leitor.nextLine();
		prod.setGroup(opcaoTexto);
		
		System.out.println("Preco");
		opcaoNumber = leitor.nextDouble();
		leitor.nextLine();
		prod.setPreco(opcaoNumber);
		
		if(isProduto) {
			prod.setPouS(ProdutoServico.PRODUTO);
		}else {
			prod.setPouS(ProdutoServico.SERVICO);
		}
	}
}