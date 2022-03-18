package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Domain.CustomerAnimals.Customer;
import Domain.CustomerAnimals.Invoice;
import Services.ClientesRelatorio;

public class Start {
	
	static List<Customer> customers = new ArrayList<Customer>();
	static List<Invoice> invoices = new ArrayList<Invoice>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		int opcaoNumber;
		String opcaoText;
		System.out.println("---PetGo---");
		System.out.println("1-Clientes");
		System.out.println("2-Vendas");
		opcaoNumber = leitor.nextInt();
		leitor.nextLine();
		
		//Main menu
		if(opcaoNumber == 1) {
			
			//Client Menu
			System.out.println("1-Ver Clientes");
			System.out.println("2-Adcionar Cliente");	
			opcaoNumber = leitor.nextInt();
			leitor.nextLine();
			
			if(opcaoNumber ==1) {
				//Ver Clientes
				System.out.println("----------Clientes----------");
				
				ClientesRelatorio.exibirClientes(customers,false);
				
				System.out.println("--------Fim Clientes--------");

				
			}else if(opcaoNumber == 2) {
				//Cadastrar Clientes
				Customer cliente = new Customer();
				customers.add(cliente);
				
				System.out.println("---Nome---");
				opcaoText = leitor.nextLine();
				cliente.setName(opcaoText);
				
				System.out.println("---Email---");
				opcaoText = leitor.nextLine();
				cliente.setEmail(opcaoText);
				
				System.out.println("---Celular---");
				opcaoText = leitor.nextLine();
				cliente.setMobileNumber(opcaoText);
				
				System.out.println("---Endereço---");
				opcaoText = leitor.nextLine();
				cliente.setAddress(opcaoText);
				
				String [] parametro = {};
				Start.main(parametro);
				
			}else {
			
				//Editar cliente
				ClientesRelatorio.exibirClientes(customers, true);
				System.out.println("Digite o número de Id do cliente para edição");
				opcaoNumber = leitor.nextInt();
				leitor.nextLine();
					
				Customer clienteSelecionado = customers.get(opcaoNumber);
					
				System.out.println("---Cliente abaixo---");
				System.out.println("Nome: "+clienteSelecionado.getName());
				System.out.println("Email: " + clienteSelecionado.getEmail());
				System.out.println("Celular: "+clienteSelecionado.getMobileNumber());
				System.out.println("Endereço: "+clienteSelecionado.getAddress());
				System.out.println("--------------------");
					
				
			}
			
			
		}else {
			//Opção 2 Vendas
			
		}
	}
	

}
