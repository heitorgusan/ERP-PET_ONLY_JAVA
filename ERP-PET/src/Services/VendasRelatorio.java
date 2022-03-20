package Services;

import java.util.List;

import Domain.CustomerAnimals.Invoice;

public class VendasRelatorio {
	public static void exibirVendas(List<Invoice> vendas){
		System.out.println("---------Hist�rico de Vendas--------------");
		System.out.println();
		if(vendas.isEmpty()) {
			System.out.println("N�o h� hist�rico de vendas, a lista est� vazia.");
			System.out.println();
			System.out.println("----------Fim Hist�rico de Vendas------------");
			return;
		}
		for(Invoice venda : vendas) {
			System.out.println(venda.getCliente().getName() + " R$"+venda.getTotal());
		}
		System.out.println();
		System.out.println("----------Fim Hist�rico de Vendas------------");
	}
}
