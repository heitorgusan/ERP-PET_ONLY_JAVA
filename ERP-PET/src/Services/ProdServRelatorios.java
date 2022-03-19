package Services;

import java.util.List;

import Domain.CustomerAnimals.ProdServ;
import Domain.CustomerAnimals.ProdutoServico;

public class ProdServRelatorios {
	public static void exibirProdServ(List<ProdServ> produtosServicos, boolean isProd) {
	
		for(ProdServ produtoServ : produtosServicos) {
			if(isProd) {
				
				if(produtoServ.getPouS() == ProdutoServico.PRODUTO) {
					System.out.println(produtoServ .getName());
				}
			}else {
				if(produtoServ.getPouS() == ProdutoServico.SERVICO) {
					System.out.println(produtoServ .getName());
				}
			}
		}
		
	}
}
