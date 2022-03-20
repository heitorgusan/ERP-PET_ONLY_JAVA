package Services;

import java.util.List;

import Domain.CustomerAnimals.Invoice;

public class VendasRelatorio {
	public static void exibirVendas(List<Invoice> vendas){
		System.out.println("---------Histórico de Vendas--------------");
		System.out.println();
		if(vendas.isEmpty()) {
			System.out.println("Não há histórico de vendas, a lista está vazia.");
			System.out.println();
			System.out.println("----------Fim Histórico de Vendas------------");
			return;
		}
		for(Invoice venda : vendas) {
			System.out.println(venda.getCliente().getName() + " R$"+venda.getTotal());
		}
		System.out.println();
		System.out.println("----------Fim Histórico de Vendas------------");
	}
}
