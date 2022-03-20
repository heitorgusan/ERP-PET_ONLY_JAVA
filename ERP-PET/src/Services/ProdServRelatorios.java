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
					System.out.println(produtosServicos.indexOf(produtoServ) + " " +produtoServ .getName());
				}
			}else {
				if(produtoServ.getPouS() == ProdutoServico.SERVICO) {
					System.out.println(produtosServicos.indexOf(produtoServ) + " " +produtoServ .getName());
				}
			}
		}
		System.out.println();
		System.out.println("-----Fim Lista--------");
		
	}
	
	public static void msgListaVazia() {
		System.out.println("A Lista está vazia, cadastre antes");
		System.out.println();
	}
}
