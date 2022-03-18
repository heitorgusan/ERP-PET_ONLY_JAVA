package Services;

import java.util.List;

import Domain.CustomerAnimals.Customer;

public class ClientesRelatorio {
	public static void exibirClientes(List<Customer> customers, boolean exibirIndex) {
		System.out.println("----------");
		if(exibirIndex == false) {			
			for(Customer c : customers) {
				System.out.println(c.getName());
			}
			
		}else {
			for(Customer c : customers) {
				System.out.println("Id " +customers.indexOf(c) +"-"+c.getName());
			}
		}
		System.out.println("----------");
	}
	public static void exibirUnicoCliente(Customer clienteSelecionado) {
		System.out.println("---Cliente abaixo---");
		System.out.println("Nome: "+clienteSelecionado.getName());
		System.out.println("Email: " + clienteSelecionado.getEmail());
		System.out.println("Celular: "+clienteSelecionado.getMobileNumber());
		System.out.println("Endere�o: "+clienteSelecionado.getAddress());
		System.out.println("--------------------");
	}

}
