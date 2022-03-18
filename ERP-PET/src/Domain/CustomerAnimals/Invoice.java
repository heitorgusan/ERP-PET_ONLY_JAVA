package Domain.CustomerAnimals;

public class Invoice {
	
	private double total;
	private boolean isPaid;
	private MetodosPagamentos metodoPagamento;
	
	//Constructors
	public Invoice(double total, boolean isPaid, MetodosPagamentos metodoPagamento) {
		super();
		this.total = total;
		this.isPaid = isPaid;
		this.metodoPagamento = metodoPagamento;
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
	
	
}
