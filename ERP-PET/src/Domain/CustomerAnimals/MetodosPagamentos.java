package Domain.CustomerAnimals;

public enum MetodosPagamentos {
	CREDITO(1),
	DEBITO(2),
	DINHEIRO(3),
	OUTROS(4);
	
	private int codPagamento;
	
	private MetodosPagamentos(int cod) {
		this.codPagamento = cod;
	}
	
}
