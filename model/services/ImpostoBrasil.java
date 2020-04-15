package model.services;

public class ImpostoBrasil implements Imposto{
	
	@Override
	public Double getTaxa(Double valor) {
		if(valor<=100.0) {
			return valor * 0.2;
		}
		else {
			return valor * 0.15;
		}
	}
}
	