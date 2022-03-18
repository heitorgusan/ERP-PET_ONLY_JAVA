package Services;

import java.util.List;

import Domain.CustomerAnimals.Customer;

public class ClientesRelatorio {
	public static void exibirClientes(List<Customer> customers, boolean exibirIndex) {
		if(exibirIndex == false) {			
			for(Customer c : customers) {
				System.out.println(c.getName());
			}
			
		}else {
			for(Customer c : customers) {
				System.out.println("Id " +customers.indexOf(c) +"-"+c.getName());
			}
		}
	}
	

}
