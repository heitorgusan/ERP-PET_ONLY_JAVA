package Services;

import java.util.List;

import Domain.CustomerAnimals.ProdServ;
import Domain.CustomerAnimals.ProdutoServico;

public class ProdServRelatorios {
	public static void exibirProdServ(List<ProdServ> produtosServicos, boolean isProd) {
		System.out.println("----------Lista----------");
		System.out.println();
		if(produtosServicos.isEmpty()) {
			ProdServRelatorios.msgListaVazia();
			System.out.println("-----Fim Lista--------");
			
			return;
		}
		for(ProdServ produtoServ : produtosServicos) {
			if(isProd) {
				
				if(produtoServ.getPouS() == ProdutoServico.PRODUTO) {
					System.out.println("Id "+produtosServicos.indexOf(produtoServ) + " | " +produtoServ .getName() + " | R$"+ produtoServ.getPreco());
				}
			}else {
				if(produtoServ.getPouS() == ProdutoServico.SERVICO) {
					System.out.println("Id "+produtosServicos.indexOf(produtoServ) + " | " +produtoServ .getName() + " | R$"+ produtoServ.getPreco());
				}
			}
		}
		System.out.println();
	
		
	}
	
	public static void msgListaVazia() {
		System.out.println("A Lista de produtos/serviços está vazia, cadastre antes");
		System.out.println();
	}
}
