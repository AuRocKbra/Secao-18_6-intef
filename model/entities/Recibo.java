package model.entities;

public class Recibo {
	private Double valorBase;
	private Double taxa;
	private Double subTotal;
	
	public Recibo() {
		
	}

	public Recibo(Double valorBase, Double taxa) {
		this.valorBase = valorBase;
		this.taxa = taxa;
	}

	public Double getValorBase() {
		return valorBase;
	}

	public void setValorBase(Double valorBase) {
		this.valorBase = valorBase;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Double getSubTotal() {
		subTotal = valorBase + taxa;
		return subTotal;
	}
}
