package Services;

import java.util.List;

import Domain.CustomerAnimals.Invoice;

public class VendasRelatorio {
	public static void exibirVendas(List<Invoice> vendas){
		for(Invoice venda : vendas) {
			System.out.println(venda.getCliente().getName() + " R$"+venda.getTotal());
		}
	}
}
