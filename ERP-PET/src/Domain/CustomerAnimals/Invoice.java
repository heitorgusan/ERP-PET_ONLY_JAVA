package Domain.CustomerAnimals;

public class Invoice {
	
	private double total;
	private boolean isPaid;
	private MetodosPagamentos metodoPagamento;
	private Customer cliente;
	//Constructors

	public Invoice() {
		
	}
	
	//Getters and Setters
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	public MetodosPagamentos getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setMetodoPagamento(MetodosPagamentos metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	public void addMetodoPagamento(int id) {
		if(id ==1) {
			this.setMetodoPagamento(MetodosPagamentos.CREDITO) ;
			return;
		}
		if(id ==2){
			this.setMetodoPagamento(MetodosPagamentos.DEBITO);
			return;
		}
		if(id ==3){
			this.setMetodoPagamento(MetodosPagamentos.DINHEIRO);
			return;
		}
		if(id ==4){
			this.setMetodoPagamento(MetodosPagamentos.OUTROS);
			return;
		}
	}

	public Customer getCliente() {
		return cliente;
	}

	public void setCliente(Customer cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Invoice [total=" + total + ", metodoPagamento=" + metodoPagamento + ", cliente=" + cliente + "]";
	}
	
	
}
