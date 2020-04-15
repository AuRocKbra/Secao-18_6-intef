package model.services;

import model.entities.Aluguel;
import model.entities.Recibo;

public class ServicoDeAluguel {
	private Double valorPorHora;
	private Double valorDaDiaria;
	private Imposto imposto;
	
	public ServicoDeAluguel() {
		
	}

	public ServicoDeAluguel(Double valorPorHora, Double valorDaDiaria, Imposto imposto) {
		this.valorPorHora = valorPorHora;
		this.valorDaDiaria = valorDaDiaria;
		this.imposto = imposto;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Double getValorDaDiaria() {
		return valorDaDiaria;
	}

	public void setValorDaDiaria(Double valorDaDiaria) {
		this.valorDaDiaria = valorDaDiaria;
	}
	
	public void processaServico(Aluguel aluguel) {
		Double tempo = (double) aluguel.getDataDeEntrega().getTime() - aluguel.getDataDeRetirada().getTime();
		Double valorBase;
		tempo = tempo / (60*60*1000);
		if(tempo<=12.0) {
			valorBase = Math.ceil(tempo) * valorPorHora;
		}
		else {
			valorBase = Math.ceil(tempo/24) * valorDaDiaria;
		}
		Double taxa = imposto.getTaxa(valorBase);
		aluguel.setRecibo(new Recibo(valorBase, taxa));
	}
}
