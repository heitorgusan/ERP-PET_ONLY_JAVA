package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Domain.CustomerAnimals.Animal;
import Domain.CustomerAnimals.Customer;
import Domain.CustomerAnimals.Invoice;
import Domain.CustomerAnimals.ProdServ;
import Domain.CustomerAnimals.Species;
import Services.AnimaisRelatorio;
import Services.AnimaisServicos;
import Services.ClientesRelatorio;
import Services.ProdServRelatorios;
import Services.ProdServServicos;
import Services.VendasRelatorio;

public class Start {
	
	static List<Customer> customers = new ArrayList<Customer>();
	static List<Invoice> invoices = new ArrayList<Invoice>();
	static List<ProdServ> produtosServicos = new ArrayList<ProdServ>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		int opcaoNumber = 0;
		String opcaoText;
		
		
		while(opcaoNumber < 1 || opcaoNumber > 3 ) {
			System.out.println("1 - Clientes");
			System.out.println("2 - Vendas");
			System.out.println("3 - Produtos e Servi�os");
			opcaoNumber = leitor.nextInt();
			leitor.nextLine();
			if(opcaoNumber < 1 || opcaoNumber > 3 ) {
				System.out.println("Op��o inv�lida, digite um n�mero entre 1 e 3");
			}
			System.out.println();
		}
		
		//Main menu
		if(opcaoNumber == 1) {
			
			//Client Menu
			opcaoNumber = 0;
			while(opcaoNumber < 1 || opcaoNumber > 3) {
				
				System.out.println("1-Ver Clientes");
				System.out.println("2-Adicionar Cliente");	
				System.out.println("3-Acessar/Editar Cliente");	
				opcaoNumber = leitor.nextInt();
				leitor.nextLine();
				
				if(opcaoNumber < 1 || opcaoNumber > 3 ) {
					System.out.println("Op��o inv�lida, digite um n�mero entre 1 e 3");
				}
				System.out.println();
			}
			
			if(opcaoNumber ==1) {
				//Ver Clientes
			
				
				ClientesRelatorio.exibirClientes(customers,false);
				
		
				System.out.println();
				String [] parametro = {};
				Start.main(parametro);
				
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
				
				System.out.println("---Endere�o---");
				opcaoText = leitor.nextLine();
				cliente.setAddress(opcaoText);
				
				opcaoNumber = 0;
				while(opcaoNumber < 1 || opcaoNumber > 2) {
					System.out.println("Deseja cadastrar um animal para o(a) "+cliente.getName()+" ?");
					System.out.println("1-Sim");
					System.out.println("2-N�o");
					opcaoNumber = leitor.nextInt();
					leitor.nextLine();
					if(opcaoNumber < 1 || opcaoNumber > 2 ) {
						System.out.println("Op��o inv�lida, digite 1 ou 2 para cadastrar ou n�o um animal");
					}
					System.out.println();
				}
				if(opcaoNumber == 1) {
					//Cadastro animal
					 do{
						opcaoNumber = 0;
						Animal animal = new Animal();
						AnimaisServicos.cadastrarAnimal(animal);
						cliente.addAnimal(animal);
						AnimaisRelatorio.exibirAnimal(animal);
						System.out.println();
						System.out.println("Deseja cadastrar outro?");
						System.out.println("1 - Sim");
						System.out.println("2 - N�o");
						
						while(opcaoNumber < 1 || opcaoNumber > 2) {
							opcaoNumber = leitor.nextInt();
							leitor.nextLine();
							
							if(opcaoNumber <1 || opcaoNumber > 2) {
								System.out.println("Op��o inv�lida, digite 1 para sim ou 2 para n�o");								
							}
						}
						
					}while(opcaoNumber == 1);
					
				}
				System.out.println();
				String [] parametro = {};
				Start.main(parametro);
				
			}else {
			
				//Editar cliente
				
				ClientesRelatorio.exibirClientes(customers, true);
				if(!customers.isEmpty()) {
					System.out.println("Digite o n�mero de Id do cliente para edi��o");
					System.out.println();
					opcaoNumber = leitor.nextInt();
					leitor.nextLine();
					
					Customer clienteSelecionado = customers.get(opcaoNumber);
					
					ClientesRelatorio.exibirUnicoCliente(clienteSelecionado);
					System.out.println("1-Cadastrar um novo animal");
					System.out.println("2-Editar informa��es cliente");
					opcaoNumber = leitor.nextInt();
					leitor.nextLine();
					if(opcaoNumber == 1) {
						Animal animal = new Animal();
						AnimaisServicos.cadastrarAnimal(animal);
						clienteSelecionado.addAnimal(animal);
					}else {
						System.out.println("O qu� voc� deseja editar????");
						System.out.println("1-Nome");
						System.out.println("2-Email");
						System.out.println("3-Celular");
						System.out.println("4-Endere�o");
						opcaoNumber = leitor.nextInt();
						leitor.nextLine();
						
						switch(opcaoNumber) {
						case 1:
							System.out.println("Digite o novo nome abaixo");
							opcaoText = leitor.nextLine();
							clienteSelecionado.setName(opcaoText);
							break;
						case 2:
							System.out.println("Digite o novo email abaixo");
							opcaoText = leitor.nextLine();
							clienteSelecionado.setEmail(opcaoText);
							break;
						case 3:
							System.out.println("Digite o novo celular abaixo");
							opcaoText = leitor.nextLine();
							clienteSelecionado.setMobileNumber(opcaoText);
							break;
						case 4:
							System.out.println("Digite o novo endere�o abaixo");
							opcaoText = leitor.nextLine();
							clienteSelecionado.setAddress(opcaoText);
							break;
						}
						System.out.println("Cliente Editado com Sucesso!!");
						ClientesRelatorio.exibirUnicoCliente(clienteSelecionado);
						
					}
					
				}
				System.out.println();
				String [] parametro = {};
				Start.main(parametro);
			}
			
			
		}else if(opcaoNumber == 2){
			//Op��o 2 Vendas
			System.out.println("1 - Ver hist�rico de vendas");
			System.out.println("2 - Adcionar venda");
			opcaoNumber = leitor.nextInt();
			leitor.nextLine();
			
			if(opcaoNumber == 1) {
				VendasRelatorio.exibirVendas(invoices);
				
			}else {
				System.out.println("Selecione o cliente pelo Id");
				ClientesRelatorio.exibirClientes(customers,true);
				if(customers.isEmpty()) {
					
					String [] parametro = {};
					Start.main(parametro);
				}
				opcaoNumber = leitor.nextInt();
				leitor.nextLine();
				
				Customer clienteSelecionado = customers.get(opcaoNumber);
				Invoice vendaAtual = new Invoice();
				vendaAtual.setCliente(clienteSelecionado);
				
				if(produtosServicos.isEmpty()) {
					ProdServRelatorios.msgListaVazia();
					String [] parametro = {};
					Start.main(parametro);
				}
				System.out.println("Adcione os itens");
				do {
					
					System.out.println("Produtos");
					ProdServRelatorios.exibirProdServ(produtosServicos, true);
					System.out.println();
					System.out.println("Servi�os");
					ProdServRelatorios.exibirProdServ(produtosServicos, false);
					System.out.println("Digite o c�digo do item que deseja vender");
					opcaoNumber = leitor.nextInt();
					leitor.nextLine();
					
					ProdServ ProdServSelecionado = produtosServicos.get(opcaoNumber);
					vendaAtual.setTotal(ProdServSelecionado.getPreco() + vendaAtual.getTotal());
					
					System.out.println("Deseja adcionar mais itens? ");
					System.out.println("1 - Sim");
					System.out.println("2 - N�o");
					opcaoNumber = leitor.nextInt();
					leitor.nextLine();
					
				}while(opcaoNumber == 1);
				invoices.add(vendaAtual);
				
				
			}
			System.out.println();
			String [] parametro = {};
			Start.main(parametro);
			
		}else {
			//Produtos e Servi�os
			System.out.println("1 - Ver lista de Produtos");
			System.out.println("2 - Ver lista de Servi�os");
			System.out.println("3 - Criar novo Produto");
			System.out.println("4 - Criar novo Servi�o");
			opcaoNumber = leitor.nextInt();
			leitor.nextLine();
			
			if(opcaoNumber == 1) {
				
				ProdServRelatorios.exibirProdServ(produtosServicos, true);
				
			}else if(opcaoNumber == 2) {
				ProdServRelatorios.exibirProdServ(produtosServicos, false);
				
			}else if(opcaoNumber == 3) {
				ProdServ produto = new ProdServ();
				ProdServServicos.CadastrarProdServ(produto, true);
				produtosServicos.add(produto);
			
			}else {
				ProdServ servico = new ProdServ();
				ProdServServicos.CadastrarProdServ(servico, false);
				produtosServicos.add(servico);
			}
			System.out.println();
			String [] parametro = {};
			Start.main(parametro);
		}
	}
	

}
 