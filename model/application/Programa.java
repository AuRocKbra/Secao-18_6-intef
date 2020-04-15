package model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Aluguel;
import model.entities.Modelo;
import model.services.ImpostoBrasil;
import model.services.ServicoDeAluguel;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		System.out.println("Dados do aluguel:");
		System.out.print("Modelo:");
		String modelo = sc.nextLine();
		System.out.print("Data de retirada(DD/MM/YYYY HH:MM):");
		Date dataDeRetirada = sdf.parse(sc.nextLine());
		System.out.print("Data de entrega(DD/MM/YYYY HH:MM):");
		Date dataDeEntrega = sdf.parse(sc.nextLine());
		Aluguel aluguel = new Aluguel(dataDeRetirada, dataDeEntrega, new Modelo(modelo));
		System.out.print("Taxa de aluguel por hora:");
		Double taxaPorHora = sc.nextDouble();
		System.out.print("Taxa da diária:");
		Double taxaDaDiaria = sc.nextDouble();
		ServicoDeAluguel servico = new ServicoDeAluguel(taxaPorHora, taxaDaDiaria, new ImpostoBrasil());
		servico.processaServico(aluguel);
		System.out.println("Recibo:");
		System.out.println("Valor base: R$"+String.format("%.2f",aluguel.getRecibo().getValorBase()));
		System.out.println("Valor da taxa: R$"+String.format("%.2f",aluguel.getRecibo().getTaxa()));
		System.out.println("Sub total: R$"+String.format("%.2f",aluguel.getRecibo().getSubTotal()));
		sc.close();
	}

}
