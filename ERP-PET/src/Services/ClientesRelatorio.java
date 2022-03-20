package Services;

import java.util.List;

import Domain.CustomerAnimals.Animal;
import Domain.CustomerAnimals.Customer;

public class ClientesRelatorio {
	public static void exibirClientes(List<Customer> customers, boolean exibirIndex) {
		System.out.println("----------Clientes----------");
		if(!customers.isEmpty()) {
			
			if(exibirIndex == false) {			
				for(Customer c : customers) {
					String animaisCliente ="";
					for(Animal animal : c.getAnimals()) {
						animaisCliente+=animal.getName()+",";
					}
					System.out.println(c.getName()+"\nAnimais: "+animaisCliente);
					System.out.println("______________________________________");
				}
				
			}else {
				for(Customer c : customers) {
					System.out.println("Id " +customers.indexOf(c)+" | "+c.getName());
				}
			}
		}else {
			System.out.println("Não há clientes cadastrados");
		}
		System.out.println("--------Fim Clientes--------");
	}
	public static void exibirUnicoCliente(Customer clienteSelecionado) {
		System.out.println("---Cliente abaixo---");
		System.out.println("Nome: "+clienteSelecionado.getName());
		System.out.println("Email: " + clienteSelecionado.getEmail());
		System.out.println("Celular: "+clienteSelecionado.getMobileNumber());
		System.out.println("Endereço: "+clienteSelecionado.getAddress());
		System.out.println("--------------------");
	}

}
