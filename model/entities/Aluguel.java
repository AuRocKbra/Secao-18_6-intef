package model.entities;

import java.util.Date;

public class Aluguel {
	private Date dataDeRetirada;
	private Date dataDeEntrega;
	private Modelo modelo;
	private Recibo recibo;
	
	public Aluguel() {
		
	}

	public Aluguel(Date dataDeRetirada, Date dataDeEntrega, Modelo modelo) {
		this.dataDeRetirada = dataDeRetirada;
		this.dataDeEntrega = dataDeEntrega;
		this.modelo = modelo;
	}

	public Date getDataDeRetirada() {
		return dataDeRetirada;
	}

	public void setDataDeRetirada(Date dataDeRetirada) {
		this.dataDeRetirada = dataDeRetirada;
	}

	public Date getDataDeEntrega() {
		return dataDeEntrega;
	}

	public void setDataDeEntrega(Date dataDeEntrega) {
		this.dataDeEntrega = dataDeEntrega;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Recibo getRecibo() {
		return recibo;
	}

	public void setRecibo(Recibo recibo) {
		this.recibo = recibo;
	}
}
