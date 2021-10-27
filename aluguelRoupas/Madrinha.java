package aluguelRoupas;

import java.util.Scanner;

public class Madrinha extends VestidoFem {
	String horaFesta;
	
	public void cadastrarVestMad(Scanner entrada) {
		System.out.println("Qual horário da festa?");
		horaFesta = entrada.nextLine();
		
	}

}
